package binarySearch;

public class RotatedSortedArayPivot {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(findPivot(arr, 0));
    }


    public static int findPivot(int[] arr, int target){
        int n= arr.length;
        int low =0;
        int high = n-1;

        while(low<= high){
            int mid = (low+high)/2;

            if(arr[mid]== target){
                return mid;
            }

            if(arr[low]<= arr[mid]){
                if(arr[low]<= target && arr[mid]>= target){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid]<= target && arr[high]>= target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
