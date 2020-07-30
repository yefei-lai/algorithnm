package com.study.algorithnm.model;

/**
 * 链表节点
 */
public class Node {

    public Object key;

    public Object val;

    //上一个节点
    public Node pre;

    //下一个节点
    public Node next;

    public Node(Object key, Object val){
        this.key = key;
        this.val = val;
    }
}
