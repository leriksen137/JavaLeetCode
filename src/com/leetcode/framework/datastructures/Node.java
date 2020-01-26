package com.leetcode.framework.datastructures;

public class Node {
	public int val;
	public Node next;
	public Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}

	@Override
	public String toString() {
		// String representation taken from Output as listed in LeetCode problem
		Node head = this;
		Node startOfList = this;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('[');
		while (head != null) {
			stringBuilder.append('[');
			stringBuilder.append(head.val);
			stringBuilder.append(',');
			stringBuilder.append(getNodeIndex(head.random, startOfList));
			stringBuilder.append(']');
			if (head.next != null) {
				stringBuilder.append(',');
			}
			head = head.next;
		}
		stringBuilder.append(']');
		return stringBuilder.toString();
	}

	private static String getNodeIndex(Node target, Node head) {
		if (target == null) {
			return "null";
		}
		int index = 0;
		while (head != target) {
			index++;
			head = head.next;
		}
		return String.valueOf(index);
	}
}
