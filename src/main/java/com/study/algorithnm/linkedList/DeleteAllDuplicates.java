package com.study.algorithnm.linkedList;

/**
 * // 链表的基本操作（删除）
 * // 给定一个排序链表，删除所有含有重复数字的结点，
 * // 只保留原始链表中 没有重复出现的数字。
 * // 输入: 1->2->3->3->4->4->5
 * // 输出: 1->2->5
 */
public class DeleteAllDuplicates {

    public static ListNode deleteAllDuplicates(ListNode head){
        ListNode prehead = new ListNode();
        prehead.next = head;
        ListNode cur = prehead;
        while (cur.next != null && cur.next.next != null){
            if (cur.next.val == cur.next.next.val){
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x){
                    cur.next = cur.next.next;
                }
            }else {
                cur = cur.next;
            }
        }
        return prehead.next;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(3);
        ListNode five = new ListNode(4);
        ListNode six = new ListNode(4);
        ListNode seven = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        deleteAllDuplicates(one);
        one.getList(one);
    }
}
