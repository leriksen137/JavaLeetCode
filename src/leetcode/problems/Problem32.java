package leetcode.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
		// tracks the current best solution separated by "levels"
		List<Integer> solutionByLevel = new ArrayList<>();

		// stack used to push and pop brackets on
		Stack<Character> bracketStack = new Stack<>();

		char poppedChar = ' ';
		int collapseSum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				bracketStack.push('(');
			} else { // it's ')'
				if (!bracketStack.isEmpty()) {
					poppedChar = bracketStack.pop();
					if (poppedChar == '(') {
						if (solutionByLevel.size() > bracketStack.size()) {
							collapseSum = solutionByLevel.get(bracketStack.size());
						} else {
							collapseSum = 0;
						}

						while (solutionByLevel.size() > bracketStack.size()) {
							collapseSum = collapseSum + solutionByLevel.get(solutionByLevel.size() - 1);
							solutionByLevel.remove(solutionByLevel.size() - 1);
						}
						solutionByLevel.add(collapseSum + 2);
					}
				}
			}
		}

		if (solutionByLevel.isEmpty()) {
			return 0;
		} else {
			return Collections.max(solutionByLevel);
		}
	}

	@Override
	public void run() {

		String s0 = "())";
		int solution = longestValidParentheses(s0);
		assert solution == 2 : "Result should be 2.";

		String s1 = "(()()";
		solution = longestValidParentheses(s1);
		assert solution == 4 : "Result should be 4 for " + s1;

		String s2 = "()((())";
		solution = longestValidParentheses(s2);
		assert solution == 4 : "Result should be 4 for " + s2;

		String s3 = "()(()";
		solution = longestValidParentheses(s3);
		assert solution == 2 : "Result should be 2.";

		String s4 = "())((()()(()(((()())))))))((((((())()(()()(())()))(()))(()()())((((((()())()()()(()))())(((()(()(())(()((()())())))((()(((()(()((()())())))(())))()))))))))))())()))((())()()()()))((()))(((()))()(()))()((()()()(()))(((()()()()((()()(()())))(())))))))()))))()))()((()())())(()))(((()()()((())())())(((())((()))(())(())()))))(())))()())())()(()))))(())))(())))(()((())(())))((()(()))((((()))))()((()()()())()(())(()(()()())()((())(()((()()()())()))((()))))()))())))))))()((()()))()()()()))(()()()()(())()(()))))()(((((()(((((((()(((())()))(()())()(()))(()(()((()((((()))))()(())(()))))()(()(((((((()))((()(()(()))(()())(()())()(())()(()((((()))))()()()(((())()())()))())()(())))(()()))))(())))))((((()))))(((((()))((((()))((())))))((())))())((((((((()(()((())))()))()()))))))))(((()(()())(()))((())((())(()))))))))((())()()())(()(())()))))((())())(()(())((()())))))((())((())())()(()))(())()()()((((()(()()))()(()(((((()())())())))())()))()))(()())()((()()()()((())()())(((())(((()(()()(((((((()(((()((((()(()((())))())())(())()(()())()((())()()()))()(()())()))()())))()()())))()(((((()()))(())(((()())))(())(())())(())(()()())))()())()))(()))))(()())()(()))((((())()())(())(((()())(()((((((((()))((((())())()((()()())())()()()())()()((()())(()()))((()()))()))(((()((()()(()))()(())()())((())())()(((())))(())((()((())(()()()(()(()))((()((((()(()()(())(()()))))(())()(()()))))())()((())(()))()()(()()()((()))(()))))())((()(()((";
		solution = longestValidParentheses(s4);

	}
}