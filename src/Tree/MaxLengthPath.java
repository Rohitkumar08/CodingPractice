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
package Tree;

/**
 * Created 7/26/2019 1:49 AM
 *
 * @author Rohit Rawani
 */
public class MaxLengthPath {
  int ans;
  static Node root;
  public int diameterOfBinaryTree(Node root) {
    ans = 1;
     depth(root);
    return ans - 1;
  }
  public int depth(Node node) {
    if (node == null) return 0;
    int L = depth(node.left);
    int R = depth(node.right);
    ans = Math.max(ans, L+R+1);
    return Math.max(L, R) + 1;
  }

  public static void main(String[] args) {
    MaxLengthPath tree = new MaxLengthPath();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.right.left = new Node(9);

    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.left.right.right = new Node(6);
    tree.root.left.right.right.right = new Node(7);
    System.out.println(tree.diameterOfBinaryTree(root));
  }
}
