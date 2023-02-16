package graph;

import java.util.ArrayList;

public class CycleDetectionUsingDFS {
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        CycleDetectionUsingDFS obj = new CycleDetectionUsingDFS();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }

    private boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {

        boolean visited[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(visited[i]== false){
                    if(dfs(i, -1, visited, adj)==true){
                        return true;
                    }
            }
        }
        return false;
    }

    private boolean dfs(int i, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[i] = true;
        for(Integer adjNode : adj.get(i)){
            if(visited[adjNode]== false){
                if(dfs(adjNode, i, visited, adj) == true){
                    return true;
                }
                else if(parent != adjNode){
                    return true;
                }
            }
        }
        return false;
    }

}
