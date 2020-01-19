package com.leetcode.problems.problem138;

import com.leetcode.framework.annotations.LeetCodeProblem;
import com.leetcode.framework.datastructures.Node;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 138, problemName = "Copy List with Random Pointer")
public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }


        Node copy = copyLinkedListWithoutRandomPointer(head);

        return copy;
    }

    private Node copyLinkedListWithoutRandomPointer(Node head) {
        Node dummyNodeForCopy = new Node(0);
        Node copy = dummyNodeForCopy;
        while (head != null) {
            copy.next = new Node(head.val);
            copy.next.next = head.next;

            head = head.next;
            copy = copy.next;
        }

        return dummyNodeForCopy.next;
    }

}