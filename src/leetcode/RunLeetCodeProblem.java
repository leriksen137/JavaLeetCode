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

import org.reflections.Reflections;

import leetcode.template.LeetCodeAnnotation;

public class RunLeetCodeProblem {

	public static void main(String[] args) throws IOException {
		checkFlags();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			System.out.println("Enter a LeetCode problem number. Enter 'all' for all. Enter anything else to exit.");

			String consoleInput = reader.readLine();

			if (consoleInput.equals("all")) {
				runAllLeetCodeProblems();
				return;
			}

			if (!checkInput(consoleInput)) {
				System.out.println("Exiting");
				return;
			}

			runLeetCodeProblem("leetcode.problems.Problem" + consoleInput);
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

	public static void runAllLeetCodeProblems() {

		Reflections ref = new Reflections("leetcode.problems");
		for (Class<?> cl : ref.getTypesAnnotatedWith(LeetCodeAnnotation.class)) {
			LeetCodeAnnotation leetCodeProblemClass = cl.getAnnotation(LeetCodeAnnotation.class);
			System.out.println(
					cl.getSimpleName() + " - " + leetCodeProblemClass.name() + " - " + leetCodeProblemClass.url());
			// TODO actually run them
		}

		System.out.print("All Problems solved. Exiting");
		return;
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
			System.out.println("---ERROR: assert failed in " + className);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("---ERROR: reflection failed for " + className);
		}
	}

}