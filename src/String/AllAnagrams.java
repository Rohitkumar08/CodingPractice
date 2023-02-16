package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagrams {
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if(m>n){
            return ans;
        }
        int []arrs = new int[26];
        int []arrp = new int[26];
        for(int i=0;i<m;i++){
            arrs[s.charAt(i)-'a']++;
            arrp[p.charAt(i)-'a']++;
        }
        for(int i=0;i<=n-m;i++){
            if(iszero(arrs,arrp)){
                ans.add(i);
            }
            arrs[s.charAt(i)-'a']--;
            if(i+m < n){
                arrs[s.charAt(i+m)-'a']++;
            }
        }
        return ans;
    }
    public static boolean iszero(int [] arrs, int []arrp){
        for(int j=0;j<26;j++){
            if(arrs[j]!=arrp[j]){
                return false;
            }
        }
        return true;
    }

//    public static List<Integer> findAnagrams(String s, String p) {
//        int low = 0;
//        int high= p.length()-1;
//        List<Integer> result = new ArrayList<>();
//
//        Map<Character, Integer> freqMap = new HashMap<>();
//        for(char c : p.toCharArray()){
//            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
//        }
//
//        while(low<=s.length()-p.length()){
//            Map<Character, Integer> tempMap = new HashMap<>();
//            for(int i=low; i<=high; i++){
//                char c =s.charAt(i);
//                if(!freqMap.containsKey(c)){
//                    break;
//                }
//                tempMap.put(c, tempMap.getOrDefault(c, 0)+1);
//            }
//            if(tempMap.size()!=freqMap.size()){
//                low++;
//                high++;
//                continue;
//            }
//            boolean isMatched = true;
//            for(Map.Entry<Character, Integer> entry : tempMap.entrySet()){
//                if(!freqMap.get(entry.getKey()).equals(entry.getValue())){
//                    isMatched=false;
//                    break;
//                }
//            }
//            if(isMatched){
//                result.add(low);
//            }
//            low++;
//            high++;
//        }
//        return result;
//    }
}
