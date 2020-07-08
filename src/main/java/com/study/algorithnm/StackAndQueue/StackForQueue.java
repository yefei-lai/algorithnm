package com.study.algorithnm.StackAndQueue;


import java.util.Stack;

/**
 * 使用栈实现队列的下列操作：
 *
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 *
 */
public class StackForQueue {
    private Stack<Integer> stack1 = null;
    private Stack<Integer> stack2 = null;

    public StackForQueue(){
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void push(int x){
        stack1.push(x);
    }

    public int pop(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public Integer peek(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty(){
        if (stack1.size() == 0 && stack2.size() == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        StackForQueue stackForQueue = new StackForQueue();
        stackForQueue.push(1);
        stackForQueue.pop();
        stackForQueue.push(2);
        stackForQueue.push(3);

        System.out.println(stackForQueue.pop());
    }
}
