package LeetCode;

import java.util.*;

/**
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 *
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * Output: false
 */
public class WordBreak {

    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>(Arrays.asList("aaa","aaaa"));
        System.out.println(wordBreak("aaaaaaaaa", wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        return wordBreakMemo(s, new HashSet<>(wordDict), 0, new Boolean[s.length()]);
    }

    private static boolean wordBreakMemo(String s, Set<String> wordDict, int start, Boolean[] memo) {
        if (start == s.length()) {
            return true;
        }
        if (memo[start] != null) {
            return memo[start];
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && wordBreakMemo(s, wordDict, end, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }
    //usong BFS
    public boolean wordBreakBFS(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[s.length()];
        queue.add(0);
        while (!queue.isEmpty()) {
            int start = queue.remove();
            if (visited[start]) {
                continue;
            }
            for (int end = start + 1; end <= s.length(); end++) {
                if (wordDictSet.contains(s.substring(start, end))) {
                    queue.add(end);
                    if (end == s.length()) {
                        return true;
                    }
                }
            }
            visited[start] = true;
        }
        return false;
    }

//    public static boolean wordBreak(String s, List<String> wordDict) {
//
//        int n = s.length();
//        int i=0;
//        int low=0;
//        int high= n-1;
//        while(low<n){
//            if(low==high){
//                if(!wordDict.contains(s.substring(low, high+1))){
//                    return false;
//                }else{
//                    low++;
//                    high=n-1;
//                    continue;
//                }
//            }
//            if(wordDict.contains(s.substring(low, high+1))){
//                low= high+1;
//                high=n-1;
//            }else{
//                high--;
//            }
//        }
//        return true;
//    }
//
//    public static boolean wordBreakSecond(String s, List<String> wordDict) {
//
//        int n = s.length();
//        int i=0;
//        String temp = "";
//        int lastFoundIndex=0;
//        while(i<n){
//            temp+=s.charAt(i);
//            if(wordDict.contains(temp)){
//                lastFoundIndex=i;
//                temp="";
//            }
//            i++;
//        }
//        if(lastFoundIndex<n-1){
//            return false;
//        }
//        return true;
//    }
}
