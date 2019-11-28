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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created 8/3/2019 1:05 AM
 *
 * @author Rohit Rawani
 */
public class TopView {
  static Node root;

  public void topView(){
    Map<Integer, List<Integer>>  map = new LinkedHashMap<>();
    int height = height(root);
    for(int level=1; level<=height; level++){
      List<Integer> lst = new ArrayList<>();
    }
   }
/*   public List<Integer> getGivenLevelData(Node root, int level, List<Integer> lst){


   }*/

   public int height(Node root){
    if(root!= null){
      int leftHeight = height(root.left);
      int rightHeight = height(root.right);

      if(leftHeight>rightHeight){
        return leftHeight+1;
      }else{
        return rightHeight+1;
      }
    }
    return 0;
   }
  public static void main(String[] args) {
    TopView tree = new TopView();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);

     tree.topView();
  }

}
