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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created 11/24/2019 1:35 PM
 *
 * @author Rohit Rawani
 */
public class SumTree {
  static Node root;
  List<List<Integer>> sumList = new ArrayList<List<Integer>>();
  int s = 0;
  public List<List<Integer>> pathSum(Node root, int sum) {
    if(root==null) {
      return sumList;
    }
    List<Integer> list = new ArrayList<>();
    inOrderTraversal(root,sum, list);
    System.out.println("Sum List --"+sumList.get(0));
    return sumList;
  }
  public void inOrderTraversal(Node root, int sum, List<Integer> list) {

    if(root==null) {
      System.out.println("returning sumlist->"+sumList);
      return;
    }

    list.add(root.key);
    s = s+root.key;
    inOrderTraversal(root.left,sum, list);
    if(root.left==null && root.right==null) {
      if(s==sum) {
        System.out.println("SSS->"+root.key);
        List<Integer> list1 = new ArrayList<>(list);
        System.out.println(list1);
        sumList.add(list1);
        System.out.println("SumList->"+sumList.get(0));
      }
    }
    inOrderTraversal(root.right,sum, list);
    list.remove(list.size()-1);
    s = s - root.key;

  }

  public static void main(String[] args) {
    SumTree tree = new SumTree();
    tree.root = new Node(5);
    tree.root.left = new Node(4);
    tree.root.right = new Node(8);
    tree.root.left.left = new Node(11);
    tree.root.right.left = new Node(13);
    tree.root.right.right = new Node(4);
    tree.root.left.left.left = new Node(7);
    tree.root.left.left.right = new Node(2);
    tree.root.right.right.left = new Node(5);
    tree.root.right.right.right = new Node(1);
    System.out.println(tree.pathSum(root, 22));
  }

}
