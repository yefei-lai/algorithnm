package com.study.algorithnm.doublePointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * 三数之和（双指针算法）双指针法的前提：排好序的数组！！！
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组
 *
 */
public class SumOf3Nums {

    public  static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if (nums == null || nums.length <= 2) return lists;
        Arrays.sort(nums); //首先对数组进行排序
        for (int i = 0; i < nums.length - 2; i++){ //循环到倒数第三个元素结束
            if (nums[0] > 0) //排序后首元素大于0，直接返回
                break;
            if ( i > 0 && nums[i] == nums[i-1]) //保证无重复元素
                continue;
            int target = 0 - nums[i];
            int left = i + 1, right = nums.length - 1; //双指针
            while (left < right){
                if (nums[left] + nums[right] == target){
                    lists.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++; right--; //左指针和右指针都要移动
                    //保证无重复元素
                    while (left < right && nums[left] == nums[left-1]) left++;
                    while (left < right && nums[right] == nums[right+1]) right--;
                } else if (nums[left] + nums[right] < target) { //若小于目标值 左指针向右移动寻找更大元素
                    left ++;
                } else { //同理 若大于目标值，右指针向左移动寻找更小元素
                    right --;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = SumOf3Nums.threeSum(nums);
        System.out.println(lists);
    }
}
