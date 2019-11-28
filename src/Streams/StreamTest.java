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
package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created 8/21/2019 11:37 PM
 *
 * @author Rohit Rawani
 */
public class StreamTest {

  public static void check(Integer i){
    System.out.println("wrapper "+ i);
  }
  public static void check(int i){
    System.out.println("prem "+ i);
  }
  public static void main(String[] args) {

    check(3);
    //1
    IntStream.range(1, 10).skip(5).forEach(System.out::print);
    System.out.println();
    //2.
    System.out.println(
        IntStream.range(1, 5).sum()
    );

    //3.
    Stream.of("zac", "piv", "dass").sorted().findFirst().ifPresent(System.out::print);
    System.out.println();
    //4.Average of squares of int array (map mapes each element as square of them)
    Arrays.stream(new int[]{1,2,3,4,5}).map(x->x*x).average().ifPresent(System.out::print);
    System.out.println();
    //5 Reduction
    double total = Stream.of(7.3, 1.5, 6.7).reduce(0.0, (Double a, Double b)-> a+b);
    System.out.println(total);
    List<Integer> lst = Arrays.asList(1,9,4,6);
    System.out.println(lst);
    int data = lst.stream().mapToInt(x->x).sum();
    System.out.println("data :"+data);
    lst = lst.stream().sorted((Integer i1, Integer i2)-> i2-i1).collect(Collectors.toList());
    System.out.println(lst);
    int[] arr =new int[]{5,4,8,6,3};
    int[] sorted = IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(i->i).toArray();
    System.out.println(sorted[0]);

  }

}
