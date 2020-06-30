package com.study.algorithnm.linkedList;

/**
 * 单链表初始化
 */
public class ListNode {

    int val;

    ListNode next;

    ListNode(){}

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }


    public void getList(ListNode listNode){
        while (listNode != null){
            if (listNode.next == null){
                System.out.println(listNode.val+"");
            }else {
                System.out.print(listNode.val+"->");
            }
            listNode = listNode.next;
        }
    }
}
