package com.leetcode.problems.problem121;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 121, problemName = "Best Time to Buy and Sell Stock")
public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length < 2) {
			return 0;
		}

		int buyPrice = prices[0];
		int sellPrice;
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			// I want to sell in this case:
			if (prices[i] > buyPrice) {
				sellPrice = prices[i];
				if (sellPrice - buyPrice > maxProfit) {
					maxProfit = sellPrice - buyPrice;
				}
			}
			// I want to buy in this case
			if (prices[i] < buyPrice) {
				buyPrice = prices[i];
			}
		}
		return maxProfit;
	}
}