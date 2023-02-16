package String;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

public class SubString {

    public static void main(String[] args) {

        substrings("abcd");
    }

    public static void substrings(String s){
        int n = s.length();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                System.out.println(s.charAt(i) + s.substring(i+1, j));
            }
        }
    }
}
