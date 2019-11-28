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
 * Created 8/3/2019 12:57 PM
 *
 * @author Rohit Rawani
 */
public class CheckBST {
  static Node root;
  Integer lastPrinted=null;

  public boolean checkBST(Node node){
    if(node == null){
      return true;
    }
    if(!checkBST(node.left)){
      return false;
    }
    if(lastPrinted!=null && node.key<=lastPrinted){
      return false;
    }
    lastPrinted=node.key;

    //recurr right tree
    if(!checkBST(node.right)){
      return false;
    }
    //all looks good
    return true;
  }

  public static void main(String[] args) {
    CheckBST tree = new CheckBST();
    tree.root = new Node(20);
    tree.root.left = new Node(8);
    tree.root.right = new Node(22);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(12);
    tree.root.left.right.left = new Node(10);
    tree.root.left.right.right = new Node(15);
    System.out.println(tree.checkBST(root));
  }

}
