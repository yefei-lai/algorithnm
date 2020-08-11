package com.study.algorithnm.DynamicProgramming;

/**
 * // 动态规划————爬楼梯问题
 * // 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * // 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * // 示例：
 * // 输入：3
 * // 输出：3
 * // 解释：有三种方法可以爬到楼顶。
 *
 * // 1 阶 + 1 阶 +    1 阶
 * // 2 阶 +           1 阶
 *
 * // 1 阶 +           2 阶
 *
 * // f(5) = f(4) + f(3)
 * // f(4) = f(3) + f(2)
 * // f(3) = f(2) + f(1)
 *
 *
 * // f(n)表示爬n个台阶到楼顶的方法总数
 * // f(n) = f(n-1) + f(n-2)
 * // res[i] = res[i-1] + res[i-2]
 */
public class ClimbStairs {

    /**
     * 直接递归解法
     * @param n
     * @return
     */
    private static int climbStairs1(int n){
        //爬一层台阶有一种方法
        if (n == 1){
            return 1;
        }
        //爬两层台阶有两种方法
        if (n == 2){
            return 2;
        }
        return climbStairs1(n-1) + climbStairs1(n-2);
    }

    /**
     * 动态规划解法
     * @param n
     * @return
     */
    private static int climbStairs2(int n){
        //最少爬一阶楼梯，n从1开始，所以数组长n+2
        int[] result = new int[n+2];
        //爬0阶有0种方法；爬1阶有1种方法；爬2阶有2种方法
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        //从爬3阶开始遍历，爬到第三个台阶 = 爬到第二个台阶的方法数(再爬一阶就到第三阶) + 爬到第一个台阶的方法数(再爬两阶就到第三阶). 以此类推。。
        for (int i = 3; i <= n; i++){
            result[i]  = result[i-1] + result[i-2];
        }
        return result[n];
    }
}
