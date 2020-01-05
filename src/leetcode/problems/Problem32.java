package leetcode.problems;

import java.util.Stack;

import leetcode.template.LeetCode;

// Template for a new problem.
// Copy into leetcode.problems and follow all TODO comments.

/**
 * Solution to
 * <a href= "https://leetcode.com/problems/longest-valid-parentheses/">Longest
 * Valid Parentheses</a>
 * 
 * @author leriksen137
 */
public class Problem32 implements LeetCode {

	// probably has to be O(n)
	public int longestValidParentheses(String s) {
		// tracks the best solution
		int solution = 0;

		// tracks the current solution with elements on the stack
		int currentSolution = 0;

		Stack<Character> bracketStack = new Stack<>();

		char c;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				bracketStack.push('(');
			} else { // it's ')'
				if (bracketStack.isEmpty()) {
					if (currentSolution > solution) {
						solution = currentSolution;
					}
					currentSolution = 0;
				} else {
					c = bracketStack.pop();
					if (c == '(') {
						currentSolution = currentSolution + 2;
					}
				}
			}

		}
		if (currentSolution > solution) {
			solution = currentSolution;
		}

		return solution;
	}

	@Override
	public void run() {

		String s1 = "(()";
		int solution = longestValidParentheses(s1);
		assert solution == 2 : "Result should be 2.";

		String s2 = "()(()";
		solution = longestValidParentheses(s2);
		assert solution == 2 : "Result should be 2.";

		String s3 = "())((()()(()(((()())))))))((((((())()(()()(())()))(()))(()()())((((((()())()()()(()))())(((()(()(())(()((()())())))((()(((()(()((()())())))(())))()))))))))))())()))((())()()()()))((()))(((()))()(()))()((()()()(()))(((()()()()((()()(()())))(())))))))()))))()))()((()())())(()))(((()()()((())())())(((())((()))(())(())()))))(())))()())())()(()))))(())))(())))(()((())(())))((()(()))((((()))))()((()()()())()(())(()(()()())()((())(()((()()()())()))((()))))()))())))))))()((()()))()()()()))(()()()()(())()(()))))()(((((()(((((((()(((())()))(()())()(()))(()(()((()((((()))))()(())(()))))()(()(((((((()))((()(()(()))(()())(()())()(())()(()((((()))))()()()(((())()())()))())()(())))(()()))))(())))))((((()))))(((((()))((((()))((())))))((())))())((((((((()(()((())))()))()()))))))))(((()(()())(()))((())((())(()))))))))((())()()())(()(())()))))((())())(()(())((()())))))((())((())())()(()))(())()()()((((()(()()))()(()(((((()())())())))())()))()))(()())()((()()()()((())()())(((())(((()(()()(((((((()(((()((((()(()((())))())())(())()(()())()((())()()()))()(()())()))()())))()()())))()(((((()()))(())(((()())))(())(())())(())(()()())))()())()))(()))))(()())()(()))((((())()())(())(((()())(()((((((((()))((((())())()((()()())())()()()())()()((()())(()()))((()()))()))(((()((()()(()))()(())()())((())())()(((())))(())((()((())(()()()(()(()))((()((((()(()()(())(()()))))(())()(()()))))())()((())(()))()()(()()()((()))(()))))())((()(()((";
		solution = longestValidParentheses(s3);

	}
}