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
 * Created 8/1/2019 7:12 PM
 *LCA for BST
 * @author Rohit Rawani
 */
public class LCA {
  static Node root;

  public Node lcaNOde(int n1, int n2){
    Node tempNode = root;
    while(tempNode != null){
        if(tempNode.key>n1 && tempNode.key>n2){
          tempNode= tempNode.left;
        }else if(tempNode.key<n1 && tempNode.key<n2){
          tempNode=tempNode.right;
        }else {
       break;
      }
    }
    return tempNode;
  }

  public static void main(String[] args) {
    LCA tree = new LCA();
    tree.root = new Node(20);
    tree.root.left = new Node(8);
    tree.root.right = new Node(22);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(12);
    tree.root.left.right.left = new Node(10);
    tree.root.left.right.right = new Node(14);
    System.out.println(tree.lcaNOde(14,8).key);
  }

}
