package leetcode.problems.problem22;

import java.util.ArrayList;
import java.util.List;

import leetcode.template.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemName = "Generate Parentheses")
public class Solution {

	public List<String> generateParenthesis(int n) {
		List<String> solutions = new ArrayList<>();

		generateParenthesesRecursive("", n, n, n, solutions);

		return solutions;
	}

	public void generateParenthesesRecursive(String str, int n, int openParenthesesRemaining,
			int closeParenthesesRemaining, List<String> solutions) {

		if (openParenthesesRemaining == 0 && closeParenthesesRemaining == 0) {
			solutions.add(str);
		}

		if (openParenthesesRemaining > 0) {
			generateParenthesesRecursive(str + "(", n, openParenthesesRemaining - 1, closeParenthesesRemaining,
					solutions);
		}

		if (closeParenthesesRemaining > openParenthesesRemaining) {
			generateParenthesesRecursive(str + ")", n, openParenthesesRemaining, closeParenthesesRemaining - 1,
					solutions);
		}
	}
}