package com.leetcode.problems.problem62;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 62, problemName = "Unique Paths")
public class Solution {
	public int uniquePaths(int m, int n) {
		long nBinomial = ((n - 1) + (m - 1));
		long kBinomial = (n - 1);

		// C(n,k) = C(n,n-k)
		if (kBinomial > nBinomial - kBinomial)
			kBinomial = nBinomial - kBinomial;

		long binomialCoefficientNK = 1;
		for (long i = 1; i <= kBinomial; i++) {
			binomialCoefficientNK *= nBinomial + 1 - i;
			binomialCoefficientNK /= i;
		}

		return (int) binomialCoefficientNK;
	}
}