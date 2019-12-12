package leetcode;

import java.util.Vector;

class Solution<Input, Output> {

	private Vector<Example<Input, Output>> examples = new Vector<Example<Input, Output>>();

	public void addExamples() {
		// TODO add examples to the "examples" vector in the following form:
		examples.add(new Example<Input, Output>(null, null));
	}

	public void run() {
		if (examples.isEmpty()) {
			throw new IllegalStateException("No examples were added");
		}

		for (Example<Input, Output> example : examples) {
			Output exampleOutput = generateOutputForInput(example.getInput());
			if (!example.getOutput().equals(exampleOutput)) {
				System.out.println(
						"Expected: " + example.getOutput().toString() + "\nReturned: " + exampleOutput.toString());
				return;
			}
		}

		System.out.println("Success!");
	}

	// TODO refactor method name and write solution code
	private Output generateOutputForInput(Input input) {

		return null;
	}

}