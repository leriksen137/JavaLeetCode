package com.leetcode.problems.problem79;

import java.awt.Point;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 79, problemName = "Word Search")
public class Solution {
	private boolean[][] visited;
	private int m;
	private int n;
	private char[][] board;
	private String word;
	private Point[] candidateOffsets;

	public boolean exist(char[][] board, String word) {
		this.word = word;
		this.board = board;
		m = board.length;
		n = board[0].length;
		visited = new boolean[m][n];
		candidateOffsets = new Point[] { new Point(-1, 0), new Point(0, -1), new Point(1, 0), new Point(0, 1) };
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (recursiveWordSearch(i, j, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean recursiveWordSearch(int i, int j, int stringIndex) {
		if (board[i][j] == word.charAt(stringIndex)) {
			if (stringIndex == word.length() - 1) {
				return true;
			}
			visited[i][j] = true;

			for (Point p : candidateOffsets) {
				int di = p.x;
				int dj = p.y;
				if (isInBounds(i + di, j + dj) && !visited[i + di][j + dj]
						&& recursiveWordSearch(i + di, j + dj, stringIndex + 1)) {
					return true;
				}
			}

			visited[i][j] = false;
		}
		return false;
	}

	private boolean isInBounds(int i, int j) {
		return (i >= 0 && i < m) && (j >= 0 && j < n);
	}
}