package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

import leetcode.template.LeetCode;

/**
 * Solution to
 * <a href= "https://leetcode.com/problems/generate-parentheses/">Generate
 * Parentheses</a>
 * 
 * @author leriksen137
 */
public class Problem22 implements LeetCode {

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

	@Override
	public void run() {
		int n = 3;

		List<String> solution = generateParenthesis(n);

		assert solution.size() == 5 : "For n=3 there should be 5 combinations of well-formed parenthese.";
	}
}