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
package Anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created 8/1/2019 8:59 PM
 *
 * @author Rohit Rawani
 */
public class DemoTask {
  public static int solution(int[] ar) {
    int p=0,res=0,n=ar.length;
    while(p<ar.length) {
      int i=p,j=p+1;
      while(j<ar.length && ar[i]==ar[j])
        j++;
      if(p==0 && j==n)
        res++;
      else if(p==0 || j==n)
        res++;
      else {
        if(ar[p-1]<ar[p] && ar[j]<ar[j-1])
          res++;
        else if(ar[p-1]>ar[p] && ar[j]>ar[j-1])
          res++;
      }
      p=j;
    }
    return res;
    /*// write your code in Java SE 8
    Integer.MIN_VALUE
    Arrays.sort(A);
    List<Integer> lst = new ArrayList<>();
    for (Integer a : A) {
      if (!lst.contains(a)) {
        lst.add(a);
      }
    }

    int[] arr = new int[lst.size()];
    for (int i =0; i < lst.size(); i++)
      arr[i] = lst.get(i);
    int j = 0;
    int i=0;
    for (i = arr[0]; i < arr[arr.length - 1]; i++) {
      if (arr[j] == i) {
        j++;
      }else{
        while (i < 1) {
          i++;
        }
        return i;
      }
    }
    if(i==arr[arr.length - 1]){
      return i+1;
    }
    return 0;*/
  }

  public static void main(String[] args) {
//    int a[] = {1, 3, 6, 4, 1, 2};
    int a[] = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
    System.out.println(solution(a));
  }

}
