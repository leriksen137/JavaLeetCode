package leetcode;

public class Example<Input, Output> {
	private Input input;
	private Output output;

	public Example(Input input, Output output) {
		this.input = input;
		this.output = output;
	}

	public Input getInput() {
		return input;
	}

	public Output getOutput() {
		return output;
	}
}
