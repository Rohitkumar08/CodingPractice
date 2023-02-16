package Anonymous;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created 01/11/21 12:22 PM
 *
 * @author Rohit Rawani
 */

class Custom{
    int index;
    Character c;
    public Custom(int index, Character c){
        this.index = index;
        this.c=c;
    }
}

public class MinValidParanthesis {

    public String minRemoveToMakeValid(String s) {
        Stack<Custom> stk = new Stack<>();
        List<Custom> lst = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                Custom cs = new Custom(i, s.charAt(i));
                stk.push(cs);
            }else if(s.charAt(i)==')'){
                //check if stack is empty;
                if(stk.isEmpty()){
                    lst.add(new Custom(i, s.charAt(i)));
                }else{
                    stk.pop();
                }
            }else{
                continue;
            }
        }
        StringBuilder result = new StringBuilder(s);
        while(!stk.isEmpty()){
            Custom cs =  stk.pop();
//            System.out.println(cs.index);
            result.replace(cs.index, cs.index+1, "_");
        }
        for(int j =0; j<lst.size(); j++){
            Custom cs =  lst.get(j);
            result.replace(cs.index, cs.index+1, "_");
        }

        return new String(result).replaceAll("_", "");

    }

    public static void main(String[] args) {
        MinValidParanthesis minValidParanthesis = new MinValidParanthesis();
        System.out.println(minValidParanthesis.minRemoveToMakeValid("))(("));
    }
}
