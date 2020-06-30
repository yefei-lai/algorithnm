package com.study.algorithnm.linkedList;

/**
 * // 链表的复杂操作之链表的反转
 * // 定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。
 * // 输入: 1->2->3->4->5->NULL
 * // 输出: 5->4->3->2->1->NULL
 *
 * // null, 1,   2,   3,   4,   5
 * // pre  cur  next
 */
public class ReverseLinkedList {

    public static ListNode reverseLinkedList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = null;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        one.getList(one);
        ListNode afterOne = reverseLinkedList(one);
        afterOne.getList(afterOne);
    }
}
