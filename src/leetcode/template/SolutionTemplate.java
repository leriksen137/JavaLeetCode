package leetcode.template;

import java.util.HashMap;
import java.util.Map;

/**
 * Example of what a solution to a <a href="https://leetcode.com/">LeetCode</a>
 * problem can look like.
 * 
 * Follow all comments marked TODO for
 * 
 * @author Laurent Eriksen
 */
public class SolutionTemplate {

	// TODO change method signature to fit the problem
	public boolean problemSolvingMethod(String input) {
		// TODO write code to solve the problem

		return true;
	}

	// TODO Change generic types to fit leetcode input and output type
	private HashMap<String, Boolean> examples = new HashMap<>();

	private void addExamples() {
		// TODO Add examples
		examples.put("ExampleInput", "ExampleOutput".isEmpty());
	}

	public void run() {
		addExamples();

		// TODO Change generic types to fit leetcode input and output type
		for (Map.Entry<String, Boolean> example : examples.entrySet()) {
			String exampleInput = example.getKey();
			Boolean exampleOutput = example.getValue();

			Boolean myOutput = problemSolvingMethod(exampleInput);

			try {
				if (myOutput.compareTo(exampleOutput) != 0) {
					System.out.println("Failed");
					System.out.println("\tInput:    " + exampleInput.toString());
					System.out.println("\tExpected: " + exampleOutput.toString());
					System.out.println("\tReturned: " + myOutput.toString());
					return;
				}
			} catch (NullPointerException e) {
				System.out.println("Failed");
				System.out.println("\tNullPointerException on calculating result for: " + exampleInput.toString());
				return;
			}
		}

	}
}