// Leetcode: 21 ques from 150 interview questions


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null)
			return l1 == null ? l2 : l1;
		ListNode node1 = l1;
		ListNode node2 = l2;

		ListNode head = null;
		ListNode tail = null;

		if (head == null) {
			if (node1.val < node2.val) {
				head = node1;
				tail = node1;
				node1 = node1.next;
			} else {
				head = node2;
				tail = node2;
				node2 = node2.next;
			}
		}

		while (node1 != null && node2 != null) {

			if (node1.val < node2.val) {
				tail.next = node1;
				node1 = node1.next;

			} else {
				tail.next = node2;
				node2 = node2.next;
			}
			tail = tail.next;

		}

		if (node1 == null) {
			tail.next = node2;
		}
		if (node2 == null) {
			tail.next = node1;
		}

		return head;

	}
}
