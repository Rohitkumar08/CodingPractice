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
 * Created 8/3/2019 2:08 PM
 *
 * @author Rohit Rawani
 */
public class BalancedBT {
  public int getHeight(Node node){
    if(node==null){
      return 0;
    }
    return Math.max(getHeight(node.left), getHeight(node.right))+1;
  }
  public boolean isBalanced(Node root) {
    if(root == null){
      return true;
    }
    int heightDiff = Math.abs(getHeight(root.left)- getHeight(root.right));
    if(heightDiff>1){
      return false;
    }
    return isBalanced(root.left) && isBalanced(root.right);
  }
}
