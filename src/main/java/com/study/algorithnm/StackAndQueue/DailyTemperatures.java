package com.study.algorithnm.StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

/**
 * // 栈问题进阶——递减栈
 * // 根据每日气温列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。
 * // 如果之后都不会升高，请在该位置用 0 来代替。
 * // 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，
 * // 你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * // 演示动画: https://www.bilibili.com/video/BV12t4y1274o/
 *
 * // [73, 74, 75, 71, 69, 72, 76, 73]
 * //   i
 * // [6, 7] 存索引
 *
 * // [1, 1, 4, 2, 1, 1, 0, 0]
 */
public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] arr){
        Stack<Integer> stack = new Stack<Integer>();
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            while (!stack.isEmpty() && arr[stack.get(stack.size()-1)] <= arr[i]){
                int top = stack.pop();
                result[top] = i - top;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{73,74,75,71,69,72,76,73};
        int[] result = dailyTemperatures(arr);
        System.out.println(Arrays.toString(result));
    }
}
