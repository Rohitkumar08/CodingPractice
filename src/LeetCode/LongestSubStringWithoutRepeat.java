///*
// * Copyright 2006-2019 (c) Care.com, Inc.
// * 1400 Main Street, Waltham, MA, 02451, U.S.A.
// * All rights reserved.
// *
// * This software is the confidential and proprietary information of
// * Care.com, Inc. ("Confidential Information").  You shall not disclose
// * such Confidential Information and shall use it only in accordance with
// * the terms of an agreement between you and CZen.
// */
//package LeetCode;
//
//
//import Anonymous.MyAnnotation;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created 7/30/2019 1:01 AM
// *
// * @author Rohit Rawani
// */
//public class LongestSubStringWithoutRepeat {
//  @MyAnnotation
//  static Integer result;
//
//  public static  Integer lengthOfLongestSubstring(String s) {
//    if(s.length()==0){
//      return 0;
//    }
//    List<Character> list = new ArrayList<>();
//    int maxCount=0;
//    result=0;
//    for(char c: s.toCharArray()){
//      if(list.contains(c)){
//        int i=0;
//        while(i<list.size() && list.get(i)!=c){
//          list.remove(i);
//        }
//        list.remove(i);
//      }
//      list.add(c);
//      maxCount=list.size();
//      if(result<maxCount){
//        result=maxCount;
//      }
//    }
//    System.out.println(result);
//    return result;
//  }
//
//  public static void main(String[] args) {
//    lengthOfLongestSubstring("bbbbb");
//  }
//
//
//  @Test
//  public void testLengthOfLongestSubstring(){
//    Assert.assertEquals(Long.valueOf(1), lengthOfLongestSubstring("bbbbb"));
//    Assert.assertEquals(Long.valueOf(4), lengthOfLongestSubstring("pwwkep"));
//  }
//  @Before
//  public void setUp(){
//    System.out.println("before");
//  }
//}
