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

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created 4/5/2019 1:21 PM
 *
 * @author Rohit Rawani
 */
public class Vehicle {

    public static void getResult(long l, long b, long h){
    long volume = l*b*h;
    long gcd=1;
    long[] arr ={l,b,h};
    Arrays.sort(arr);
    /*for(long j=1; j<=arr[0]; j++){
      if(l%j ==0 && b%j==0 && h%j==0){
        gcd=j;
      }
    }*/
    gcd = findGCD(arr, arr.length);
    long cubeVolume =gcd*gcd*gcd;
    long noOfCubes=volume/cubeVolume;

    System.out.print(gcd+" ");
    System.out.println((noOfCubes%1000000007));
  }
  static long findGCD(long arr[], int n){
    long result = arr[0];
    for (int i = 1; i < n; i++)
      result = gcd(arr[i], result);
    return result;
  }
  static long gcd(long a, long b){
    if(a==0){
      return b;
    }
    return gcd(b%a, a);
  }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

    // Write your code here
    Scanner sc = new Scanner(System.in);
    int t  = sc.nextInt();
    for(int i=0; i<t; i++){
      long l = sc.nextLong();
      long b = sc.nextLong();
      long h= sc.nextLong();
      getResult(l,b,h);
    }
  }

}
