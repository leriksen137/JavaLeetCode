package leetcode.problems;

import leetcode.datastructures.ListNode;

/**
 * Solution to <a href=
 * "https://leetcode.com/problems/remove-nth-node-from-end-of-list/">Remove Nth
 * Node From End of List</a>
 * 
 * @author leriksen137
 */
public class Problem19 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode headCopy = head;
		ListNode aheadByN = head;
		for (int i = 0; i < n; i++) {
			aheadByN = aheadByN.next;
		}
		if (aheadByN == null) {
			// catch special case that original head will be removed
			return headCopy.next;
		}
		while (aheadByN.next != null) {
			head = head.next;
			aheadByN = aheadByN.next;
		}

		head.next = head.next.next;

		return headCopy;
	}

	public void run() {
		ListNode head = ListNode.fromArray(new int[] { 1, 2, 3, 4, 5 });
		int n = 2; // remove second to last element

		removeNthFromEnd(head, n);

		assert head.toString().equals("1->2->3->5") : "should've eliminated ListNode 4";

	}
}