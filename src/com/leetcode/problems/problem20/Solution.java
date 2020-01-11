package com.leetcode.problems.problem20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.leetcode.framework.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 20, problemName = "Valid Parentheses")
public class Solution {
	public boolean isValid(String input) {
		Map<Character, Character> bracketMap = new HashMap<Character, Character>();
		bracketMap.put('(', ')');
		bracketMap.put('[', ']');
		bracketMap.put('{', '}');

		Stack<Character> bracketStack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			if (bracketMap.containsKey(c)) {
				bracketStack.push(c);
			} else if (bracketMap.containsValue(c)) {
				if (bracketStack.isEmpty()) {
					// too many closing brackets
					return false;
				}
				char bracket = bracketStack.pop();
				if (!bracketMap.get(bracket).equals(c)) {
					// nonmatching brackets
					return false;
				}
			} else {
				throw new IllegalArgumentException("Unexpected value: " + c);
			}
		}
		if (!bracketStack.isEmpty()) {
			// unclosed brackets remaining
			return false;
		}
		return true;
	}
}