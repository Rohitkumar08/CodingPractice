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

/**
 * Created 8/4/2019 8:04 PM
 *
 * @author Rohit Rawani
 */
public class LinledListSum {

  public LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2) {
    LinkedListNode node = addTwoNumbers(l1, l2, 0);
    return node;
  }
  public LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2, int carry){
    if(l1 == null && l2==null && carry==0){
      return null;
    }
    LinkedListNode node;
    int value=0;
    if(l1!=null){
       value+=l1.val;
    }
    if(l2!=null){
      value+=l2.val;
    }
    value += carry;
    carry = value/10;
    int data = value%10;
    node = new LinkedListNode(data);
    if(l1 !=null || l2!=null){
      node.next= addTwoNumbers(l1!=null ? l1.next : null ,
          l2!=null ? l2.next : null, carry);
    }
    return node;
  }

  public static void main(String[] args) {
    LinkedListNode node1 = new LinkedListNode(2);
    node1.next=new LinkedListNode(4);
    node1.next.next=new LinkedListNode(3);
    LinkedListNode node2 = new LinkedListNode(5);
    node2.next=new LinkedListNode(6);
//    node2.next.next=new LinkedListNode(4);
    LinledListSum sum = new LinledListSum();
    LinkedListNode node = sum.addTwoNumbers(node1, node2);
    while(node!=null){
      System.out.println(node.val);
      node= node.next;
    }
  }
}

class LinkedListNode{
  LinkedListNode next;
  int val;
  LinkedListNode(int data){
    this.val=data;
    this.next=null;
  }
}