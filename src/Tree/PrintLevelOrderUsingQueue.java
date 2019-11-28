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

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created 8/1/2019 6:16 PM
 *
 * @author Rohit Rawani
 */
public class PrintLevelOrderUsingQueue {
  static Node root;

  public void printLevelOrder(){
    Queue<Node> queue = new LinkedList<>();
    Node tempNode=root;

    while(tempNode!= null){
      System.out.print(tempNode.key+ " ");
      queue.add(tempNode.left);
      queue.add(tempNode.right);
      tempNode=queue.poll();
    }


  }

  public static void main(String[] args) {
    PrintLevelOrderUsingQueue tree = new PrintLevelOrderUsingQueue();
    tree.root= new Node(1);
    tree.root.left=new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);
    tree.printLevelOrder();
  }

}
