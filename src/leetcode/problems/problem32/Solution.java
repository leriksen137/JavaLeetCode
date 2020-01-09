package leetcode.problems.problem32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import leetcode.template.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemName = "Longest Valid Parentheses")
public class Solution {

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
}