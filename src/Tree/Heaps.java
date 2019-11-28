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
 * Created 5/18/2019 11:10 PM
 *
 * @author Rohit Rawani
 */
public class Heaps {
  private int[] heap;
  private int size;
  private int maxSize;

  private static final int FRONT = 1;

  public Heaps(int maxSize){
    this.maxSize=maxSize;
    this.size=0;
    heap = new int[this.maxSize+1]; ///define the size of the heap
    heap[0] = Integer.MIN_VALUE;   //to store the min value in the root.
  }
  // utility methods for getting the parent and left and right indexes
  private int parent(int index){
    return (index)/2;
  }
  private int leftChild(int index){
    return (2*index);
  }
  private int rightChild(int index){
    return (2*index)+1;
  }

  private void swap(int index1, int index2){
    int temp;
    temp= heap[index1];
    heap[index1] = heap[index2];
    heap[index2]= temp;
  }

  //insert into the heap
  public void insert(int element){
    if(size >= maxSize)
      return;
    //insert the element at the last inserted element
    heap[++size] = element;
    int current = size;

    while(heap[current] < heap[parent(current)]){
      swap(current, parent(current));
      current = parent(current);
    }
  }

  //remove always from the top means root
  public int remove(){
    int popped = heap[FRONT];
    heap[FRONT] = heap[size--];
    minHeapify(FRONT);
    return popped;
  }

  public boolean isLeaf(int pos){
    if(pos >= (size/2) && pos <= size ){
      return true;
    }
    return false;
  }
  //heapify the element at given index
  public void minHeapify(int index) {
    if (!isLeaf(index)) {
      if ((heap[index] > heap[leftChild(index)]) || (heap[index] > heap[rightChild(
          index)])) {
        if (heap[leftChild(index)] < heap[rightChild(index)]) {
          swap(index, leftChild(index));
          minHeapify(leftChild(index));
        } else {
          swap(index, rightChild(index));
          minHeapify(rightChild(index));
        }
      }
    }
  }
  //size/2 because its an array and half of it will already traverse the whole
  public void minHeap(){
    for(int index= size/2; index>=1; index--){
      minHeapify(index);
    }
  }

  // Function to print the contents of the heap
  public void print()
  {
    for (int i = 1; i <= size / 2; i++) {
      System.out.print(" PARENT : " + heap[i]
          + " LEFT CHILD : " + heap[2 * i]
          + " RIGHT CHILD :" + heap[2 * i + 1]);
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Heaps heaps= new Heaps(15);
    heaps.insert(5);
    heaps.insert(3);
    heaps.insert(17);
    heaps.insert(10);
    heaps.insert(84);
    heaps.insert(19);
    heaps.insert(6);
    heaps.insert(22);
    heaps.insert(9);
    heaps.minHeap();
    heaps.print();

    System.out.println("The Min val is " + heaps.remove());
    heaps.print();
  }
}

