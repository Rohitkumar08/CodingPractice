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

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created 10/3/2019 11:34 PM
 *
 * @author Rohit Rawani
 */
@RunWith(JUnit4.class)
public class UnitTest {

  private List<String> list;

  @Before
  public void beforeTest(){
    System.out.println("filling up the list");
    list = new ArrayList<>(Arrays.asList("abc", "rohan"));
  }

  @After
  public void afterTest(){
    System.out.println("clearing the list");
    list.clear();
  }

  @Test
  public void testKadane(){
    Assert.assertEquals(1, list.size());
  }

}
