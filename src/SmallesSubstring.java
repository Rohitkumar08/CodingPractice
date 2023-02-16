
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/***
 * Input: aabcbcdbca --> abcd
 * Output: dbca
 *
 * aaaaaaaa
 * a
 *
 * abababa
 * ba
 *
 * acaab--> abc
 * caab
 */
public class SmallesSubstring {

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0, count = map.size();
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    count--;
                }
            }
            right++;

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }
                char lc = s.charAt(left);
                if (map.containsKey(lc)) {
                    map.put(lc, map.get(lc) + 1);
                    if (map.get(lc) > 0) {
                        count++;
                    }
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public static String getSmallestSubString(String input, String t){
        Set<Character> uniqueChars = new HashSet<>();
        for(char c : t.toCharArray()){
            uniqueChars.add(c);
        }

        int low=0;
        int high=uniqueChars.size()-1;
        int n = input.length();
        String temp;
        while(high-low<n){
            temp = getString(input, uniqueChars, low, high, n);
            if(temp!=null){
                return temp;
            }
            high++;
        }
        return "";
    }

    private static String getString(String input, Set<Character> uniqueChars, int low, int high, int n) {
        while(high < n){
            boolean found=true;
            String temp = input.substring(low, high +1);
            for(char c : uniqueChars){
                if(!temp.contains(String.valueOf(c))){
                    found=false;
                    break;
                }
            }
            if(found){
                return temp;
            }
            low++;
            high++;

        }
        return null;
    }

}
