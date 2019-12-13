package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Example of what a solution to a <a href="https://leetcode.com/">LeetCode</a>
 * problem can look like.
 * 
 * @author Laurent Eriksen
 */
public class Solution {

	private static boolean problemSolvingMethod(String input) {
		// TODO write code to solve the problem
		return true;
	}

	private static void addExamples() {
		examples.put("ExampleInput", true);
	}

	public static void run() {
		addExamples();

		for (Map.Entry<String, Boolean> example : examples.entrySet()) {
			String exampleInput = example.getKey();
			Boolean exampleOutput = example.getValue();

			Boolean myOutput = problemSolvingMethod(exampleInput);

			try {
				if (myOutput.compareTo(exampleOutput) != 0) {
					System.out.println(className + ": Failed. Details:");
					System.out.println("\tInput:    " + exampleInput.toString());
					System.out.println("\tExpected: " + exampleOutput.toString());
					System.out.println("\tReturned: " + myOutput.toString());
					return;
				}
			} catch (NullPointerException e) {
				System.out.println(className + ": Failed. Details:");
				System.out.println("\tNullPointerException on calculating result for: " + exampleInput.toString());
				return;
			}
		}

		System.out.println(className + ": Success!");
	}

	private static HashMap<String, Boolean> examples = new HashMap<>();
	private static String className = Solution.class.getName();

}