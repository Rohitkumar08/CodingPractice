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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created 5/14/2019 3:23 PM
 *
 * @author Rohit Rawani
 */
public class TestA {

  public static void main(String[] args) {
    String s1="abc";
    String s2 = "a"+"bc".trim();
    String s3 = "a"+"b"+"c";
    System.out.println(s1==s2);
/*
    Integer i = new Integer(8);
*//*    call([[]]);
    System.out.println(mat[[]]);*//*

    i=4;
    int b = i;
    System.out.println(b==i);
    String string = getSsn("123456789");
    System.out.println(string + string.replaceAll("-", ""));
    Long s = Long.valueOf(123);
    List<Long> n = Arrays.asList(s);.0
    List<String> lst = new ArrayList<>();
    lst.add("abc" +" " +  (!string.isEmpty() ? string+ " " : "dfsgsfdg") + "def");
    System.out.println(lst);
    System.out.println(n);*/
  /*  A a = new A(1, "a");
    A b = new A(2, "b");
    B as = call();
    for(A ele: as){
        ele.getData();
    }
*/
  }
  public static String getSsn(String ssn) {
    return ssn.substring(0, 3) + "-" + ssn.substring(3, 6)
        + "-" + ssn.substring(6, 9);
  }

  static B call(){
    B c = new B();
    c.addAll(Collections.EMPTY_LIST);
    return c;
  }

}
