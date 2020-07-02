package com.study.algorithnm.linkedList;

import java.util.HashSet;

/**
 * // 链表的复杂操作之环形链表2
 * // 给定一个链表，返回链表开始入环的第一个结点。 如果链表无环，则返回 null。
 * // 输入：3->2->4->1->(2) 注意：此处的2是就是前面3后面的2
 * // 输出：2
 */
public class CycleLinkedListReturn {

    public static ListNode CycleReturn(ListNode head){
        HashSet<ListNode> hashSet = new HashSet<ListNode>();
        while (head != null && head.next != null){
            if (hashSet.contains(head)){
                return head;
            }else {
                hashSet.add(head);
            }
            head = head.next;
        }
        return null;
    }
}
