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
package DesignPatterns.Proxy;

/**
 * Created 8/2/2019 5:43 PM
 *
 * @author Rohit Rawani
 */
public class CommandExecutorProxyImpl implements CommandExecutor {
  private boolean isAdmin;
  private CommandExecutor executor;
  public CommandExecutorProxyImpl(){}

  public CommandExecutorProxyImpl(String user, String pwd){
    if("Pankaj".equals(user) && "J@urnalD$v".equals(pwd)){
      isAdmin=true;
      executor = new CommandExecutorImpl();
    }else{
      executor = new CommandExecutorProxyImpl();
    }
  }

  @Override
  public void runCommand(String cmd) throws Exception {
//    if(isAdmin){
      executor.runCommand(cmd);
   /* }else{
      if(cmd.trim().startsWith("rm")){
        throw new Exception("rm command is not allowed for non-admin users.");
      }else{
        executor.runCommand(cmd);
      }
    }*/
  }

}
