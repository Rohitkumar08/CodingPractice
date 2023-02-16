package Anonymous;

public class BInaryString {

    public static int minFlipsMonoIncr(String s) {
        char[] arr = s.toCharArray();
        int low=0;
        int high = arr.length-1;
        int count=0;
        while(low<high){
            if(arr[low]=='0'){
                low++;
                continue;
            }
            if(arr[high]=='1'){
                high--;
                continue;
            }
            if(arr[low]=='1' && arr[high]=='0'){
                char temp = arr[low];
                arr[low] =  arr[high];
                arr[high] = temp;
                low++;
                high--;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minFlipsMonoIncr("010110"));
    }
}
