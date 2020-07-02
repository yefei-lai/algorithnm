package com.study.algorithnm.linkedList;

import java.util.HashSet;

/**
 * // 链表的复杂操作之环形链表1
 * // 给定一个链表，判断链表中是否有环。
 * // 输入： 3->2->4->1->(2) 注意：此处的2是就是前面3后面的2
 * // 输出： true
 */
public class IsCycleLinkedList {

    public static boolean isCycle(ListNode head){
        HashSet<ListNode> hashSet = new HashSet<ListNode>();
        while (head != null && head.next != null){
            if (hashSet.contains(head)){
                return true;
            }else {
                hashSet.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(3);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = two;

        System.out.println(isCycle(one));
    }
}
