package com.study.algorithnm.linkedList;

/**
 * // 链表的复杂操作————双指针之快慢指针大法
 * // 给定一个链表，删除链表的倒数第 n 个结点，
 * // 并且返回链表的头结点。
 * // 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * // 当删除了倒数第二个结点后，链表变为 1->2->3->5.
 *
 * // null 1，2，3，4，5
 * //   j     i
 */
public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode prehead = new ListNode();
        prehead.next = head;
        ListNode fast = prehead;
        ListNode slow = prehead;
        while (n>0){
            fast = fast.next;
            n--;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return prehead.next;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        one.getList(one);
        removeNthFromEnd(one, 2);
        one.getList(one);
    }
}
