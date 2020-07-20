package com.study.algorithnm.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueForStack {

    private Queue<Integer> q1;//输出队列
    private Queue<Integer> q2;//输入队列

    /** Initialize your data structure here. */
    public QueueForStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty())
            q2.add(q1.remove());
        Queue temp = q2;
        q2 = q1;
        q1 = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q1.poll();
    }

    /** Get the top element. */
    public int top() {
        return q1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {


    }

 }
