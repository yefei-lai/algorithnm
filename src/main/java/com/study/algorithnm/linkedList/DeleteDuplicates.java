package com.study.algorithnm.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * // 链表的基本操作（删除）
 * // 给定一个排序链表，删除所有重复的元素，
 * // 使得每个元素只出现一次。
 * // 输入: 1->1->2->3->3
 * // 输出: 1->2->3
 */
public class DeleteDuplicates {

    public static ListNode deleteDuplicates(ListNode head){
        ListNode cur = head;
        while (cur != null && cur.next != null){
            if (cur.val == cur.next.val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(3);
        ListNode five = new ListNode(3);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        deleteDuplicates(one);
        one.getList(one);
    }
}
