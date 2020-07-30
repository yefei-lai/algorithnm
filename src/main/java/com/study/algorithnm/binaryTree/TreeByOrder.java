package com.study.algorithnm.binaryTree;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的层序遍历
 *
 */
public class TreeByOrder {

    public static Queue<TreeNode> TreeByOrder(TreeNode treeNode){
        Queue<TreeNode> result = new LinkedList<>();
        Queue<TreeNode> query = new LinkedList<>();
        query.add(treeNode);
        while (query.size() != 0){
            TreeNode top = query.poll();
            result.add(top);
            if (top.left != null){
                query.add(top.left);
            }
            if (top.right != null){
                query.add(top.right);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        TreeNode rightNode = new TreeNode(3);
        TreeNode leftleftNode = new TreeNode(4);
        TreeNode leftrightNode = new TreeNode(5);
        leftNode.left = leftleftNode;
        leftNode.right = leftrightNode;
        treeNode.left = leftNode;
        treeNode.right = rightNode;

        Queue<TreeNode> queue = TreeByOrder.TreeByOrder(treeNode);
        Iterator<TreeNode> iterator = queue.iterator();
        while (iterator.hasNext()){
            TreeNode node = iterator.next();
            System.out.println(node.val);
        }
    }
}
