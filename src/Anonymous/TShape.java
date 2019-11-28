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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created 8/18/2019 2:16 AM
 *
 * @author Rohit Rawani
 */
public class TShape {
    // Complete the solve function below.
    static String solve(List<List<Integer>> grid) {
      System.out.println(grid.get(0).get(1));
      int j=0;
      Set<Integer> setX = new HashSet<>();
      Set<Integer> setY = new HashSet<>();
      List<Integer> list = new ArrayList<>();
      for(int i=0; i<grid.size(); i++){
        if(list.contains(grid.get(i).get(1))){
          setY.add(grid.get(i).get(0));
        }
        list.add(grid.get(i).get(1));
      }
      return "";
    }

    public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int t = Integer.parseInt(bufferedReader.readLine().trim());

      IntStream.range(0, t).forEach(tItr -> {
        try {
          List<List<Integer>> points = new ArrayList<>();

          IntStream.range(0, 5).forEach(i -> {
            try {
              points.add(
                  Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                      .map(Integer::parseInt)
                      .collect(Collectors.toList())
              );
            } catch (IOException ex) {
              throw new RuntimeException(ex);
            }
          });

          String result = solve(points);

/*          bufferedWriter.write(result);
          bufferedWriter.newLine();*/
        } catch (Exception ex) {
          throw new RuntimeException(ex);
        }
      });

      bufferedReader.close();
//      bufferedWriter.close();
    }
  }
