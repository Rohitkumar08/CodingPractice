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

/**
 * Created 10/15/2019 9:16 PM
 *
 * @author Rohit Rawani
 */
// Java program to find Excel
// column name from a given
// column number

public class ExcelColumnTitle
{
  private static String printString(long n)
  {
    long row = (n/702);
    StringBuilder label = new StringBuilder();
    n=n%702;
    if(n==0){
      label.append("ZZ");
    }
    else{
      row =row+1;
      while (n > 0)
      {
        long rem = n % 26;
        if (rem == 0)
        {
          label.append("Z");
          n = (n / 26) - 1;
        }
        else
        {
          label.append((char)((rem - 1) + 'A'));
          n = n / 26;
        }
      }
    }
    System.out.println(String.valueOf(row)+label.reverse());
    return String.valueOf(row)+label.reverse();
  }

  // Driver program to test above function
  public static void main(String[] args)
  {
/*    printString(27);
    printString(51);
    printString(52);
    printString(80);
    printString(676);
    printString(702);*/
    printString(1000);
  }
}

// This code is contributed by Harikrishnan Rajan
