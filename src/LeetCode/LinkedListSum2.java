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
 * Created 8/4/2019 8:57 PM
 *
 * @author Rohit Rawani
 */
class PartialSum{
  LinkedListNode finalNode=null;
  int carry =0;
}

public class LinkedListSum2 {

  public LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2){
    int length1= length(l1);
    int length2 = length(l2);
    if (length1 > length2) {
     l2= padList(l2, length1 - length2);
    } else {
      l1 = padList(l1, length2 - length1);
    }
    //Adds lists
    PartialSum sum = addListHelper(l1, l2);
    if(sum.carry == 0){
      return sum.finalNode;
    }else{
      LinkedListNode result = insertBefore(sum.finalNode, sum.carry);
      return result;
    }
  }

  public PartialSum addListHelper(LinkedListNode l1, LinkedListNode l2){
    if(l1 == null && l2 == null){
      PartialSum sum = new PartialSum();
      return sum;
    }
    PartialSum sum = addListHelper(l1.next, l2.next);
    int value = sum.carry + l1.val + l2.val;

    LinkedListNode fullResult = insertBefore(sum.finalNode, value%10);

    sum.finalNode = fullResult;
    sum.carry = value /10;
    return sum;
  }

  public LinkedListNode insertBefore(LinkedListNode list, int data){
    LinkedListNode node = new LinkedListNode(data);
    if(list != null){
      node.next=list;
    }
    return node;
  }

  /**
   * adds padding to the list as 0 5 6 7
    * @param node
   * @param padding
   * @return
   */
  public LinkedListNode padList(LinkedListNode node, int padding){
    LinkedListNode head =node;
    for(int i=0; i<padding; i++){
      head = insertBefore(head, 0);
    }
    return head;
  }

  /**
   * finds length of a linkedList
   *
   * @param node
   * @return
   */
  public int length(LinkedListNode node){
    int count=0;
    while(node!=null){
      node= node.next;
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    LinkedListNode node1 = new LinkedListNode(2);
//    node1.next=new LinkedListNode(4);
//    node1.next.next=new LinkedListNode(3);
    LinkedListNode node2 = new LinkedListNode(9);
//    node2.next=new LinkedListNode(6);
//    //    node2.next.next=new LinkedListNode(4);
    LinkedListSum2 sum = new LinkedListSum2();
    LinkedListNode node = sum.addTwoNumbers(node1, node2);
    while(node!=null){
      System.out.println(node.val);
      node= node.next;
    }
  }

}

