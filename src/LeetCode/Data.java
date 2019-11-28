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
package LeetCode;

/**
 * Created 7/14/2019 12:44 PM
 *
 * @author Rohit Rawani
 */
public class Data{

  public String getVideoName() {
    return videoName;
  }

  public void setVideoName(String videoName) {
    this.videoName = videoName;
  }

  public int getRange() {
    return range;
  }

  public void setRange(int range) {
    this.range = range;
  }

  String videoName;
  int range;
  public Data(String s, int data){
    this.videoName=s;
    this.range=data;
  }

  public Data() {
  }
}
