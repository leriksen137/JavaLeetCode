package com.leetcode.problems.problem62;

import java.math.BigInteger;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 62, problemName = "Unique Paths")
public class Solution {
	public int uniquePaths(int m, int n) {
		BigInteger nBinomial = BigInteger.valueOf((n - 1) + (m - 1));
		BigInteger kBinomial = BigInteger.valueOf(n - 1);

		// C(n,k) = C(n,n-k)
		if (kBinomial.compareTo((nBinomial.subtract(kBinomial))) == 1)
			kBinomial = nBinomial.subtract(kBinomial);

		BigInteger binomialCoefficientNK = BigInteger.ONE;
		for (BigInteger i = BigInteger.ONE; i.compareTo(kBinomial) < 1; i = i.add(BigInteger.ONE)) {
			binomialCoefficientNK = binomialCoefficientNK.multiply(nBinomial.add(BigInteger.ONE).subtract(i));
			binomialCoefficientNK = binomialCoefficientNK.divide(i);
		}

		return binomialCoefficientNK.intValue();
	}
}