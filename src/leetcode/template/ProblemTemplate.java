package leetcode.template;

/**
 * @author leriksen137
 */
@LeetCodeAnnotation(name = "TEMPLATE", url = "URL")
public class ProblemTemplate implements LeetCode {
	// TODO Copy into leetcode.problems and follow all "TODO" comments.
	// TODO Update problem name and LeetCode URL
	// TODO Change class name to include problem number
	// TODO copy problem Signature from specific LeetCode problem.
	public String calculateSolution(int[] nums) {
		return "solution";
	}

	@Override
	public void run() {
		// TODO generate input arguments
		int[] nums = new int[] { 1, 2, 3, 4 };

		// TODO call function
		String solution = calculateSolution(nums);

		// TODO check solution with an appropriate assert statement
		assert solution != null : "Assertion failed in " + this.getClass().getName();
	}
}