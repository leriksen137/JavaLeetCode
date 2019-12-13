package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	private static HashMap<String, Boolean> examples = new HashMap<>();

	public static void run() {
		addExamples();

		for (Map.Entry<String, Boolean> example : examples.entrySet()) {
			String exampleInput = example.getKey();
			Boolean exampleOutput = example.getValue();

			Boolean myOutput = problemSolvingMethod(exampleInput);

			try {
				if (myOutput.compareTo(exampleOutput) != 0) {
					System.out.println("Input:    " + exampleInput.toString());
					System.out.println("Expected: " + exampleOutput.toString());
					System.out.println("Returned: " + myOutput.toString());
					return;
				}
			} catch (NullPointerException e) {
				System.out.println("NullPointerException on calculating result for: " + exampleInput.toString());
				return;
			}
		}

		System.out.println("Success!");
	}

	public static void addExamples() {
		examples.put("ExampleInput", true);
	}

	private static Boolean problemSolvingMethod(String input) {
		// TODO write code to solve the problem
		return true;
	}

}