package graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * using topological sort/ kah'n Algo
 */
public class CourseSchedule {

    public static boolean isPossible(int n, int[][] prerequisites){
        //form the graph
        int m = prerequisites.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }


        //populate adj list
        for(int i=0; i<m; i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        //populate inDegree
        int inDegree[] = new int[n];
        for(int i =0;  i<n; i++){
            for(int data : adj.get(i)){
                inDegree[data]++;
            }
        }

        //apply BFS
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0; i<n; i++){
            if(inDegree[i]==0){
                queue.add(i);
            }
        }

        List<Integer> topo = new ArrayList<>();
        while(!queue.isEmpty()){
            int node = queue.peek();
            queue.poll();

            topo.add(node);

            for(int element : adj.get(node)){
                inDegree[element]--;
                if(inDegree[element]==0){
                    queue.add(element);
                }
            }
        }


        if(topo.size() >= n){
//            return topo.stream().mapToInt(i->i).toArray();
            return true;
        }
//        int[] temp = {};
//        return temp;
        return false;

    }

    public static void main(String[] args) {
        int[][] pre = {{0,10},{3,18},{5,5},{6,11},{11,14},{13,1},{15,1},{17,4}};
        System.out.println(isPossible(20, pre));
    }
}
