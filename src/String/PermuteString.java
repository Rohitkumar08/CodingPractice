package String;

import java.util.*;

public class PermuteString {
    static Set<String> finalList = new HashSet<>();

    public static void main(String[] args) {
      Boolean x=call();
      System.out.println(x);
      int n =3;
      StringBuilder s = new StringBuilder(n);
      for(int i=0; i<n; i++){
          s.append('(');
          s.append(')');
      }
        System.out.println(s);
        permute(s.toString().split(""),0);
        System.out.println(new ArrayList<>(finalList));
    }
    static void permute(String str[], int index){
        if(str.length==index){
            String result = String.join("",str);
            if(isValidParan(result)){
                finalList.add(result);
            }
            return;
        }else{
            for(int i=index; i<str.length; i++){
                swap(str, index, i);
                permute(str,index+1);
                swap(str, i, index);
            }
        }
    }
    static boolean call(){
      return true;
    }

    static void swap(String arr[], int i, int j){
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static boolean isValidParan(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        for(char c: ch){
            if(c=='('){
                stk.push('(');
            }else{
                if(stk.isEmpty()){
                    return false;
                }else{
                    stk.pop();
                }
            }
        }
        if(stk.isEmpty()){
           return true;
        }
        return false;
    }
}
