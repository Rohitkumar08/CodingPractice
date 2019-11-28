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
package Test;

/**
 * Created 10/30/2019 10:53 AM
 *
 * @author Rohit Rawani
 */
public class IDE {
  public static String getCommentsOnlyCode(String code){
    String result="";
    boolean singleLineComment= false;
    boolean multipleLineComment= false;

    for(int i=0; i<code.length(); i++){
      if(singleLineComment && code.charAt(i)=='\n'){
        singleLineComment=false;
      }
      else if(multipleLineComment && code.charAt(i)=='*' && code.charAt(i+1)=='/'){
        multipleLineComment=false;
        result+=code.charAt(i)+""+code.charAt(i+1);
        i++;
      }
      else if(code.charAt(i)=='/' && code.charAt(i+1)=='/'){
        singleLineComment=true;
        result+='\n'+""+code.charAt(i)+""+code.charAt(i+1);
        i++;
      }
      else if(code.charAt(i)=='/' && code.charAt(i+1)=='*'){
        multipleLineComment = true;
        result+='\n'+""+code.charAt(i)+""+code.charAt(i+1);
        i++;
      }
      else if(!singleLineComment && !multipleLineComment){
        continue;
      }
      else{
        result+=code.charAt(i);
      }

    }
    return result;
  }

  public static void main(String[] args) {
    String program = "/**\n" + " * Created 7/18/2019 1:06 PM\n" + " *\n"
        + " * @author Rohit Rawani\n" + " */\n" + "public class Animal {\n" + "  /*\n"
        + "  this method is used to print dummy text.\n" + "   */\n"
        + "  public static void testClassMethod() {\n" + "    prints instance method/\n"
        + "    System.out.println(\"The static // method in Animal\");\n" + "  }\n" + "}\n"
        + "class Cat extends Animal {\n" + "  public static void testClassMethod() {\n"
        + "    System.out.println(\"The static method in Cat\");\n" + "  }\n"
        + "  public static void main(String[] args) {\n" + "    Cat myCat = new Cat();\n"
        + "    myCat.testClassMethod();\n" + "  }\n" + "}";
    System.out.println(getCommentsOnlyCode(program));
  }
}
