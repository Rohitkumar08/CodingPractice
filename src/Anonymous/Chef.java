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

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created 11/13/2019 9:17 PM
 *
 * @author Rohit Rawani
 */
public class Chef {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numberOfDays = in.nextInt();
    int itemCount=0;
    String result="";
    Map<String, Integer> map = new LinkedHashMap<>();
    outer:
    for (int i = 0; i < numberOfDays; i++) {
      String ingredient = in.next();
      itemCount++;
      if(ingredient.substring(0,3).equals("FAT")){
        int count=0;
        if(map.containsKey("FAT")){
          count = map.get("FAT");
        }
        map.put("FAT", ++count);
      }else if(ingredient.substring(0,4).equals("CARB")){
        int count=0;
        if(map.containsKey("CARB")){
          count = map.get("CARB");
        }
        map.put("CARB", ++count);
      }else{
        int count=0;
        if(map.containsKey("FIBRE")){
          count = map.get("FIBRE");
        }
        map.put("FIBRE", ++count);
      }
      if(itemCount<3){
        result+="0";
        continue;
      }else{
        for(Map.Entry<String, Integer> entry : map.entrySet()){
          if(entry.getValue()>=2){
            map.put(entry.getKey(), entry.getValue()-2);
            for(Map.Entry<String, Integer> entry1 : map.entrySet()){
              if(entry1.getValue()==1){
                result+="1";
                map.put(entry1.getKey(), entry1.getValue()-1);
                itemCount-=3;
                continue outer;
              }
            }
          }
        }
        result+="0";
      }

    }
    System.out.println(result);
  }

}
