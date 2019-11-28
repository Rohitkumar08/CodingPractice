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
package Array;

/**
 * Created 9/4/2019 11:53 PM
 *
 * @author Rohit Rawani
 */
public class ReArrange {

  // Prints max at first position, min at second
  // position second max at third position, second
  // min at fourth position and so on.
  public static void rearrange(int arr[], int n)
  {
    // initialize index of first minimum and first
    // maximum element
    int max_idx = n - 1, min_idx = 0;

    // store maximum element of array
    int max_elem = arr[n - 1] + 1;

    // traverse array elements
    for (int i = 0; i < n; i++) {
      // at even index : we have to put
      // maximum element
      if (i % 2 == 0) {
        arr[i] += (arr[max_idx] % max_elem) * max_elem;
        max_idx--;
      }

      // at odd index : we have to put minimum element
      else {
        arr[i] += (arr[min_idx] % max_elem) * max_elem;
        min_idx++;
      }
    }

    // array elements back to it's original form
    for (int i = 0; i < n; i++)
      arr[i] = arr[i] / max_elem;
  }

  // Driver code
  public static void main(String args[])
  {
    int arr[] = { 1, 2, 3, 4, 7, 6, 5 };
    int n = arr.length;

    System.out.println("Original Array");
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");

    rearrange(arr, n);

    System.out.print("\nModified Array\n");
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
  }
}
