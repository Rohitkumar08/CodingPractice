package Array;

/**
 * @author rrawani
 */
public class SearchElementWithMinComparison {

    public static void findElement(int[] arr, int x){
        int n = arr.length;
        if(arr[n-1]==x){
            System.out.println("found");
        }
        int backup = arr[n-1];
        arr[n-1]=x;
        for(int i=0;;i++){
            if(arr[i]==x){
                arr[n-1]=backup;
                if(i<n-1){
                    System.out.println("found");
                }else{
                    System.out.println("not found");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{4, 7, 1, 8, 6};
        findElement(arr,9);
    }
}
