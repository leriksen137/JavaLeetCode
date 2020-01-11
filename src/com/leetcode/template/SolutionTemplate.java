package com.leetcode.template;

import com.leetcode.framework.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 11, problemName = "TEMPLATE")
public class SolutionTemplate {
	// TODO Copy into leetcode.problems and follow all "TODO" comments.
	// TODO Update problem number and name
	// TODO Change class name to include problem number
	// TODO copy problem Signature from specific LeetCode problem.
	public String calculateSolution(int[] nums) {
		return "solution";
	}

	public void run() {
		// TODO generate input arguments
		int[] nums = new int[] { 1, 2, 3, 4 };

		// TODO call function
		String solution = calculateSolution(nums);

		// TODO check solution with an appropriate assert statement
		assert solution != null : "Assertion failed in " + this.getClass().getName();
	}
}