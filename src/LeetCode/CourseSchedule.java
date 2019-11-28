package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created 8/11/2019 2:49 AM
 *
 * @author Rohit Rawani
 */
public class CourseSchedule {
  public static boolean canFinish(int numCourses, int[][] prerequisites) {
    Map<Integer, Integer> hmap  = new HashMap<>();
    int size = hmap.size();
    int[][] arr = prerequisites;
    for(int i=0; i<prerequisites.length; i++){
      if(arr[i][0]>numCourses-1 || arr[i][1]>numCourses-1){
        return false;
      }
      if(hmap.containsKey(arr[i][0])){
        size++;
      }
      if(hmap.keySet().contains(arr[i][1]) && (hmap.get(arr[i][1])==arr[i][0])){
        return false;
      }
      hmap.put(arr[i][0],arr[i][1]);
    }
    int count=0;
    Set<Integer> set = hmap.keySet();
    for(Map.Entry entry : hmap.entrySet()){
        if(set.contains(entry.getValue())){
          count++;
        }
    }
    if(count<hmap.size()+size){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int[][] arr= {{1,0},{1,2},{0,1}};
    System.out.println(canFinish(3, arr));
  }

}
