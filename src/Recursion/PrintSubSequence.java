package Recursion;

/**
 * Created 15/11/21 10:45 AM
 *
 * @author Rohit Rawani
 */
public class PrintSubSequence {


    public static void main(String[] args) {
        printSubsequence("abcd", "");
    }

    public static void printSubsequence(String question, String answer){
        if(question.length() == 0){
            System.out.println(answer);
            return;
        }
        char c = question.charAt(0);
        String newQuestion = question.substring(1);
        printSubsequence(newQuestion, answer+c);
        printSubsequence(newQuestion, answer);
    }
}
