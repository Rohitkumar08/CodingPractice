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
import java.util.ListResourceBundle;

/**
 * Created 8/17/2019 2:42 AM
 *
 * @author Rohit Rawani
 */
public class LCABT {
  static Node root;

  public static Node lowestCommonAncestor(Node root, Node p, Node q) {
    if(root==null){
      return root;
    }
    List<Node> path1 = new ArrayList<>();
    List<Node> path2 = new ArrayList<>();
    if(!findPath(root, p.key, path1) || !findPath(root, q.key, path2)){
      System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing");
      System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing");
      return new Node(-1);
    }
    int i=0;
    for(i=0; i<path1.size() && i<path2.size(); i++){
      if(!path1.get(i).equals(path2.get(i))){
        break;
      }
    }
    return path1.get(i-1);

  }

  public static boolean findPath(Node root, int n, List<Node> path){
      if(root == null){
        return false;
      }
      path.add(root);
      if(root.key == n){
        return true;
      }
      if(root.left != null && findPath(root.left, n, path)){
        return true;
      }
      if(root.right != null && findPath(root.right, n, path)){
        return true;
      }
      path.remove(path.size()-1);
      return false;
  }

  public static void main(String args[])
  {
    LCABT tree = new LCABT();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);
    System.out.println("LCA(4, 5) = " +
        tree.lowestCommonAncestor(root,new Node(4), new Node(6)).key);

  }
}
