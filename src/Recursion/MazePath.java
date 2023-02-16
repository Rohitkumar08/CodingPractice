package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 15/11/21 12:33 AM
 *
 * @author Rohit Rawani
 */
public class MazePath {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList< String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }

    /**
     *
     * @param i - source row
     * @param j - source column
     * @param n - dest row
     * @param m - dest col
     * @return
     */
    public static ArrayList<String> getMazePaths(int i, int j, int n, int m){
        if(i ==n && j ==m){
            ArrayList<String> reached = new ArrayList<>();
            reached.add("");
            return reached;
        }
        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();
        if(i<n){
            hPaths = getMazePaths(i+1, j, n, m);
        }
        if(j<m){
            vPaths = getMazePaths(i, j+1, n, m);
        }
        ArrayList<String> result = new ArrayList<>();
        for(String s: hPaths){
            result.add("h" + s);
        }
        for(String s: vPaths){
            result.add("v" + s);
        }
        return result;
    }
}
