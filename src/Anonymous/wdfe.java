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
 * Created 11/21/2019 8:22 PM
 *
 * @author Rohit Rawani
 */
public class wdfe {

  private int k;

  public wdfe(int k){
    this.k = k;
  }

  public wdfe(){

  }
  public void say(){}

}

class App extends wdfe
{
  private int i;
  public App(int i){
    this.i = i;
  }

  public App(){
  }

  //emthod to print value of i;

  public static void main( String[] args )
  {
    App app = new App(10);


  }
}
