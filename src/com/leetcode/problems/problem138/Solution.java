package com.leetcode.problems.problem138;

import java.util.HashMap;
import java.util.Map;

import com.leetcode.framework.annotations.LeetCodeProblem;
import com.leetcode.framework.datastructures.Node;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 138, problemName = "Copy List with Random Pointer")
public class Solution {
	public Node copyRandomList(Node head) {
		Map<Node, Node> map = new HashMap<>();
		Node pointer = head;
		while (pointer != null) {
			map.put(pointer, new Node(pointer.val));
			pointer = pointer.next;
		}

		pointer = head;
		while (pointer != null) {
			map.get(pointer).next = map.get(pointer.next);
			map.get(pointer).random = map.get(pointer.random);
			pointer = pointer.next;
		}

		return map.get(head);
	}
}