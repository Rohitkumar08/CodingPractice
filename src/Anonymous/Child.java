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

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created 4/8/2019 9:53 PM
 *
 * @author Rohit Rawani
 */
public class Child extends Parent {

  int i=10;
  public void getData(){
    System.out.println(9);
  }

  int j=90;
  public static void main(String[] args) {
    Parent p =new Parent();
    /*p.getData();*/

    Parent p1 = new Child();
    /*p1.getData();*/
    /*System.out.println(p1.i);*/
    Map<Car, Integer>  hmap = new HashMap<>();
    Car c1= new Car("bmw", "x7");

    hmap.put(c1, 2);
    for (Map.Entry<Car, Integer> employeeStringEntry : hmap.entrySet()) {
      System.out.println(employeeStringEntry.getKey().hashCode());
    }

    c1.setModel("Q5");
    for (Map.Entry<Car, Integer> employeeStringEntry : hmap.entrySet()) {
      System.out.println(employeeStringEntry.getKey().hashCode());
    }

    System.out.println(hmap.get(c1));
    Car c2 = new Car("bmw", "x7");
    hmap.put(c2, 3);
    System.out.println(hmap.get(c2));



/*    Child c=  new Parent();
    c.getData();*/

  }
}
