package Anonymous;

/**
 * @author rrawani
 */

public class Sort0s1s2s {



    public static void main(String[] args) {

        int[] arr={0,1,1,0,1,2,1,2,0,0,0,1};

        Sort0s1s2s sort=new Sort0s1s2s();
        sort.sortDutchNationalFlag(arr);


    }

    public void sortDutchNationalFlag(int arr[]) {
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        int temp=0;
        while(mid<=high){

            switch (arr[mid] ){

                case 0:
                {
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;

                    low++;
                    mid++;

                    break;

                }
                case 1 :
                {
                    mid++;
                    break;

                }

                case 2 :
                {
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
                }
            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k] + "\t");
        }

    }




}