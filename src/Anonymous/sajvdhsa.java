package Anonymous;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class sajvdhsa {

    static void swapped(String str){
        String[] arr = str.split(" ");
        System.out.println(arr[0]+" "+arr[1]);
        for(int k=arr.length-1; k>0; k--){
            System.out.print(arr[k]);
            if(k!=0)
                System.out.print(" ");
        }



    }


    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
                        // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0; i<t; i++){
            s.next();
            String str = s.nextLine();
            swapped(str);
        }
    }
}

