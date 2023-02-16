package Recursion;

/**
 * Created 17/11/21 12:27 AM
 *
 * @author Rohit Rawani
 */
public class Encodings {

    public static void main(String[] args) throws Exception {
        printEncodings("123", "");
    }
    public static void printEncodings(String ques, String ans){
        //1. check if question length is 0 then print answ
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        //2. else if question length is 1
            //1. if char is 0 --> return;
            //2. else append char at 0 to the answer and call printEncodings with rest of the string then 1st char
        else if(ques.length()==1){
            if(ques.charAt(0)=='0'){
                return;
            }else{
                String ch0 = ques.substring(0,1);
                String rest0= ques.substring(1);
                //get the code of ch0
                String code0 = (char)('a'+ (Integer.parseInt(ch0) -1)) + "";
                printEncodings(rest0, ans+ code0);
            }
        }
        //3. else (ques length is greater than 1)
            //1. if first char is 0 --> return
            //2. get first char code and and append it to answer
            //3. get the rest of the string and pass it to question

            //same above steps with first 2 chars
                //1. get the first 2 chars fid the code and append it to answ.
                //2. get teh rest of the strng and pass it to question
        else{
            if(ques.charAt(0) == '0'){
                return;
            }else{

                String ch0 = ques.substring(0,1);
                String rest0= ques.substring(1);
                //get the code of ch0
                String code0 = (char)('a'+ (Integer.parseInt(ch0) -1)) + "";
                printEncodings(rest0, ans+ code0);


                String ch01 = ques.substring(0,2);
                String rest01= ques.substring(2);
                //get the code of ch0
                String code01 = (char)('a'+ (Integer.parseInt(ch01) -1)) + "";
                if (Integer.parseInt(ch01) <= 26) {
                    printEncodings(rest01, ans+ code01);
                }
            }
        }

        //Now finally check if interger [arse int of first 2 char is <=26
            //the call ques and aswer+code for first 2 chars
    }
}
