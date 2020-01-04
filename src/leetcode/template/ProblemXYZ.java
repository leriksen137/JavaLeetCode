package leetcode.template;

// Template for a new problem.
// Copy into leetcode.problems and follow all TODO comments.

/**
 * Solution to <a href= "URL">PROBLEMNAME</a>
 * 
 * @author leriksen137
 */
public class ProblemXYZ implements LeetCode {
	// TODO change XYZ to problem number, update URL and PROBLEMNAME in javadoc

	// TODO copy problem Signature from specific leetcode problem.
	public String calculateSolution(int[] inputArgument) {
		return "solution";
	}

	@Override
	public void run() {
		// TODO generate input arguments
		int[] inputArgument = new int[] { 1, 2, 3, 4 };

		// TODO call function
		String solution = calculateSolution(inputArgument);

		// TODO check solution with an appropriate assert statement
		assert solution.length() == 8 : "This text will be displayed if assertion failed";
	}
}