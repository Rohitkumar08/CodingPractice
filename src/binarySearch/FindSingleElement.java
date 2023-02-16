package binarySearch;

public class FindSingleElement {

    public static void main(String args[]) {

        int arr[] = {1,1,2,3,3,4,4,8,8};

        int elem = findSingleElement(arr);

        System.out.println("The single occurring" +
                " element is " + elem);

    }

    public static int findSingleElement(int[] arr){
        int n =arr.length;
        int low =0;
        int high = n-2;

        while(low<=high){
            int mid = (low+high)/2;
            if(mid %2 ==0){
                if(arr[mid+1] != arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }else{
                if(arr[mid+1] == arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }

        return arr[low];
    }
}
