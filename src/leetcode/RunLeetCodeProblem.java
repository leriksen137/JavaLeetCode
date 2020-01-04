package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class RunLeetCodeProblem {

	public static void main(String[] args) throws IOException {
		checkFlags();

		System.out.println("Type Problem Number you would like to run and press enter. Type anything else to exit.");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String consoleInputNumber = reader.readLine();

			if (!checkInput(consoleInputNumber)) {
				System.out.println("Exiting");
				return;
			}

			runLeetCodeProblem("leetcode.problems.Problem" + consoleInputNumber);
		}
	}

	private static void checkFlags() {
		RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();
		List<String> arguments = runtimeMxBean.getInputArguments();
		if (!arguments.contains("-ea") && !arguments.contains("-enableassertions")) {
			System.out.println(
					"WARNING: Add \"-ea\" or \"-enableassertions\" flag to VM arguments, otherwise solutions will not be checked.");
		}
	}

	private static boolean checkInput(String consoleInputNumber) {
		try {
			Integer.valueOf(consoleInputNumber);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static void runLeetCodeProblem(String className) {
		try {
			Class<?> clazz = Class.forName(className);
			Constructor<?> ctor = clazz.getConstructor();
			Object object = ctor.newInstance();
			Method run = clazz.getMethod("run");
			run.invoke(object);

			System.out.println(className + ": success!");
		} catch (ClassNotFoundException e) {
			System.out.println("---ERROR: Can't find anything for: " + className);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			System.out.println("---ERROR: assert failed in " + className);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("---ERROR: reflection failed for " + className);
		}
	}

}