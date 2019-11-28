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

import java.util.Optional;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created 7/11/2019 2:55 PM
 *
 * @author Rohit Rawani
 */
public class StreamsPrac {

  public static void main(String[] args) {
    Random rand = new Random();
    IntStream st = rand.ints(3);
    st.forEach(System.out::println);

    Stream<String> streamOfString = Pattern.compile(",").splitAsStream("a,b,c");
    streamOfString.forEach(System.out::println);

    Stream<String> stream =
        Stream.of("a", "b", "c").skip(1).filter(element -> element.contains("c"));
    Optional<String> anyElement = stream.findAny();
    System.out.println(anyElement);
//    Optional<String> firstElement = stream.findFirst();

  }
}
