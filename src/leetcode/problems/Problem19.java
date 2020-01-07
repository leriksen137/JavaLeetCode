package leetcode.problems;

import leetcode.datastructures.ListNode;
import leetcode.template.LeetCode;
import leetcode.template.LeetCodeAnnotation;

/**
 * 
 * @author leriksen137
 */
@LeetCodeAnnotation(name = "Remove Nth Node From End of List", url = "https://leetcode.com/problems/remove-nth-node-from-end-of-list/")
public class Problem19 implements LeetCode {

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

	@Override
	public void run() {
		ListNode head = ListNode.fromArray(new int[] { 1, 2, 3, 4, 5 });
		int n = 2; // remove second to last element

		removeNthFromEnd(head, n);

		assert head.toString().equals("1->2->3->5") : "Assertion failed in " + this.getClass().getName();

	}
}