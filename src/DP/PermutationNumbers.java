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
package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created 6/16/2019 10:03 AM
 *
 * @author Rohit Rawani
 */
public class PermutationNumbers {
  public static   List<List<Integer>> permute(List current, List possible, List result){

    result.add(current.get(0));
    current.remove(0);
    possible = current;
    permute(current, possible, result);
    return result;
  }

  public static void main(String[] args) {
    int arr[]= new int[]{1,2,3};
    List<List<Integer>> permutations = permute(Arrays.asList(arr), new ArrayList<>(), new ArrayList<>());
  }
}
