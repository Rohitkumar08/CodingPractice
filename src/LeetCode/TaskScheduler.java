package LeetCode;

import java.util.*;

public class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(char c: tasks){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>((a, b)->
                !Objects.equals(a.getValue(), b.getValue()) ? b.getValue()-a.getValue() : a.getKey()-b.getKey());

        queue.addAll(frequencyMap.entrySet());

        int count = 0;
        while(!queue.isEmpty()){

            int k = n + 1;
            List<Map.Entry> tempList = new ArrayList<>();
            while(k>0 && !queue.isEmpty()){
                Map.Entry<Character, Integer> top = queue.poll();
                // decrease frequency, meaning it got executed
                top.setValue(top.getValue()-1);
                // collect task to add back to queue
                tempList.add(top);
                k--;
                count++;
            }
        }


        return -1;
    }
}
