package Array;

public class GroupReversal {

   public static void reverseArray(int arr[], int k){
       int n=arr.length;

       for(int i=0; i<n; i+=k){

           int left =i;
           int right = Math.min(k-1+i, n-1);

           while(left<right){
               int temp = arr[right];
               arr[right]=arr[left];
               arr[left]=temp;
               left++;
               right--;
           }
    System.out.notifyAll();

       }

   }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k=3;
        reverseArray(arr,k);
        for(int i =0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
