package com.leetcode.problems.problem49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 49, problemName = "Group Anagrams")
public class Solution {

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) {
			return new ArrayList<List<String>>();
		}

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String inputString : strs) {
			char[] toSort = inputString.toCharArray();
			Arrays.sort(toSort);
			String sortedString = String.valueOf(toSort);
			if (!map.containsKey(sortedString))
				map.put(sortedString, new ArrayList<String>());
			map.get(sortedString).add(inputString);
		}
		return new ArrayList<List<String>>(map.values());
	}
}