package com.study.algorithnm.linkedList;

/**
 * // 链表——局部反转一个链表
 * // 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * // 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * // 输出: 1->4->3->2->5->NULL
 * //        2      3      4
 * // 1  ->  4  ->  3  ->  2  ->  5  ->  NULL （反转之后）
 * //                     pre    cur    next
 * // lH   start
 */
public class ReverseLinkedListBetween {

    public static ListNode reverseLinkedListBetween(ListNode head, int m, int n){
        ListNode prehead = new ListNode();
        prehead.next = head;
        //记录m前面的那个节点
        ListNode leftHead = prehead;
        //让leftHead 定位到m前面
        while (m>1){
            leftHead = leftHead.next;
            m--;
        }
        //注意pre不能是leftHead,要不然把leftHead也反转了
        ListNode pre = leftHead.next;
        ListNode cur = pre.next;
        //记录开始位置，反转完之后要让它指向n后面那个节点
        ListNode start = pre;
        while (m<n){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            m++;
        }
        leftHead.next = pre;
        start.next = cur;
        return prehead.next;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = null;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        one.getList(one);
        reverseLinkedListBetween(one, 2,4);
        one.getList(one);
    }
}
