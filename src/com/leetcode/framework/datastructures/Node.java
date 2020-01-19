package com.leetcode.framework.datastructures;

import java.util.ArrayList;
import java.util.List;

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
        List<List<String>> stringForLinkedList = new ArrayList<>();
        Node head = this;
        while (head != null) {
            stringForLinkedList.add(new ArrayList<>(head.val));
        }
        return stringForLinkedList.toString();
    }
}
