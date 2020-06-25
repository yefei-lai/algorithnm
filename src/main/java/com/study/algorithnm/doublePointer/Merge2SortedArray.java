package com.study.algorithnm.doublePointer;

import java.util.Arrays;

/**
 * 合并两个有序数组
 * 说明：给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组
 * 初始化： nums1 和 nums2 的元素数量分别为 m 和 n
 * 双指针法
 */
public class Merge2SortedArray {

    //从数组末开始遍历，将更大的元素放进nums1末尾
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n -1;
        while (i>=0 && j>=0){
            if (nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }else if (nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                k--;
                j--;
            }
            if (j>=0) //防止nums1遍历结束后 nums2未遍历结束，那么确定nums2剩余元素都比nums1小，将nums的剩余元素全部拷贝到nums1的前面
                System.arraycopy(nums2,0, nums1, 0, j+1);
        }
    }

    public static void main(String[] args) {
        //例子
        int[] nums1 = new int[]{1,2,3,0,0,0}; //m=3
        int[] nums2 = new int[]{2,5,6}; //n=3

        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
