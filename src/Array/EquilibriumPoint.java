package Array;

public class EquilibriumPoint {

    public static void findEquilibriumPoint(int arr[]){

        int n=arr.length;
        int leftSum=0;
        int rightSum= 0;
        int sum =0;
        for(int i=0; i<n; i++)
            sum+=arr[i];
        rightSum=sum;
        for(int i=0; i<n; i++){
            rightSum=rightSum-arr[i];
            if(leftSum==rightSum)
                System.out.println(i);
            leftSum=leftSum+arr[i];

        }

    }
    public static void main(String[] args) {
        String s = "abc";
        String s2 = s;
        System.out.println(s.hashCode()+" "+s2.hashCode());
        s+="d";
        System.out.println(s.hashCode()+" "+s2.hashCode());

        String s3 = "bcd";
        String s4 = new String("bcd");
        System.out.println(s3==s4);

        int arr[] = {0, 1,  5, 2, -4, 3};
        findEquilibriumPoint(arr);

    }
}
