package com.leetcode.problems.problem17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.leetcode.framework.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 17, problemName = "Letter Combinations of a Phone Number")
public class Solution {
	private Map<Character, String> numToChars;

	public List<String> letterCombinations(String digits) {
		if (digits.isEmpty()) {
			return Collections.emptyList();
		}

		numToChars = new HashMap<Character, String>();
		numToChars.put('2', "abc");
		numToChars.put('3', "def");
		numToChars.put('4', "ghi");
		numToChars.put('5', "jkl");
		numToChars.put('6', "mno");
		numToChars.put('7', "pqrs");
		numToChars.put('8', "tuv");
		numToChars.put('9', "wxyz");

		List<String> results = new ArrayList<>();

		recursiveLetterCombinations(results, digits, "");

		return results;
	}

	private void recursiveLetterCombinations(List<String> results, String digits, String combination) {
		if (digits.isEmpty()) {
			results.add(combination);
			return;
		}

		char num = digits.charAt(0);
		String chars = numToChars.get(num);

		for (int i = 0; i < chars.length(); i++) {
			// inefficient! String + operator always creates a new Object
			// because String is immutable
			// speedup expected if switching to StringBuilder or CharArray.
			recursiveLetterCombinations(results, digits.substring(1), combination + chars.charAt(i));
		}
	}
}