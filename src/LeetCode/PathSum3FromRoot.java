/*
 * Copyright 2006-2019 (c) Care.com, Inc.
 * 1400 Main Street, Waltham, MA, 02451, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Care.com, Inc. ("Confidential Information").  You shall not disclose
 * such Confidential Information and shall use it only in accordance with
 * the terms of an agreement between you and CZen.
 */
package LeetCode;
import Tree.*;

import java.util.Stack;

/**
 * Created 6/26/2019 2:04 PM
 * HAVING A LIMITATION CHECKS ONLY FROM ROOT
 *
 * @author Rohit Rawani
 */
public class PathSum3FromRoot {
  static Node root; static int sum =0;;
 static  Stack<Integer> stack = new Stack<>();
  public static void printGivenSumPath(Node root, int target){
    if(root == null){
      return;
    }
    //add the root into sum and put it into a stack.
    sum = sum+root.key;
    stack.push(root.key);
    if(sum == target){
      System.out.println(stack);
    }


    //do inorder traversal to left and right
    printGivenSumPath(root.left, target);
    printGivenSumPath(root.right, target);

    //after reaching at end substract the added element and pop from the stack and search for other path
    sum = sum-root.key;
    stack.pop();

  }

  public static void main(String[] args) {
    PathSum3FromRoot tree = new PathSum3FromRoot();
/*    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);*/

    tree.root = new Node(10);
    tree.root.left = new Node(5);
    tree.root.right = new Node(-3);
    tree.root.left.left = new Node(3);
    tree.root.left.right = new Node(2);
    tree.root.right.right = new Node(11);
    tree.root.left.left.left = new Node(3);
    tree.root.left.left.right = new Node(-2);
    tree.root.left.right.right = new Node(1);
    printGivenSumPath(root,18);
  }

}
