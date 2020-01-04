package leetcode;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RunLeetCodeProblem {

	public static void main(String[] args) throws Exception {

		if (args.length == 0) {
			System.out.println("args empty. Run with a list of problem numbers that you want to run.");
		}

		// create class for each problem number in args and call its run() method.
		String className;
		for (String i : args) {
			className = "leetcode.problems.Problem" + i;

			try {
				Class<?> clazz = Class.forName(className);
				Constructor<?> ctor = clazz.getConstructor();
				Object object = ctor.newInstance();
				Method run = clazz.getMethod("run");
				run.invoke(object);
				System.out.println(className + ": success!");
			} catch (Exception e) {
				System.out.println(className + ": failed: " + e.toString());
			}
		}
	}
}