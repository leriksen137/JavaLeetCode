package com.leetcode.problems.problem138;

import com.leetcode.framework.datastructures.Node;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * leriksen137
 */
public class SolutionTest {
    Solution s;

    @Before
    public void initializeSolution() {
        s = new Solution();
    }

    @Test
    public void testCopyRandomListExample1() {
        Node head = new Node(7);
        Node n1 = new Node(13);
        Node n2 = new Node(11);
        Node n3 = new Node(10);
        Node n4 = new Node(1);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n1.random = head;
        n2.random = n4;
        n3.random = n2;
        n4.random = head;

        System.out.println("Hello");

        System.out.println("World");

        System.out.println(head.toString());

        Node copy = s.copyRandomList(head);
        assertEquals("7", copy.toString());
    }
}
