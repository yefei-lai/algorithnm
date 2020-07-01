package com.study.algorithnm.StackAndQueue;

import java.util.HashMap;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 1、左括号必须用相同类型的右括号闭合。
 * 2、左括号必须以正确的顺序闭合。
 * *注意空字符串可被认为是有效字符串
 * 示例："()":true ; "()[]{}":true ; "(]":false ; "([)]":false ; "{[()]}":true
 */
public class LeftToRight {

    public static boolean leftToRight(String s){
        HashMap map = new HashMap();
        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");

        int len = s.length();
        Stack stack = new Stack();
        for (int i=0; i<len; i++){
            String ch = String.valueOf(s.charAt(i));
            if (ch.equals("(") || ch.equals("[") || ch.equals("{")){
                stack.push(map.get(ch));
            }else {
                if (stack.size()==0 || !stack.pop().equals(ch) ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }

}
