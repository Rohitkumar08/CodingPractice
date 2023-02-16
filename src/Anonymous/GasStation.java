package Anonymous;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        System.out.println(canCompleteCircuit1(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int startIndex =0;
        int i =0;
        while(gas[startIndex] < cost[startIndex]){
            if(startIndex == gas.length-1){
                return -1;
            }
            startIndex++;
            i++;
        }
        int gasLeft = gas[startIndex];

        while(startIndex < gas.length){
            gasLeft -= cost[i];
            if(gasLeft < 0){
                startIndex++;
                i = startIndex;
                if(startIndex >= gas.length-1){
                    return -1;
                }
                for(int j = startIndex; j<gas.length; j++){
                    if(gas[j] < cost[j]){
                        startIndex++;
                        i = startIndex;
                    }else{
                        gasLeft = gas[startIndex] - cost[startIndex];
                        break;
                    }
                }
            }
            if(i+1 >= gas.length){
                i=0;
                gasLeft += gas[i];
            }else{
                gasLeft+= gas[i+1];
                i++;
            }
            if(i==startIndex){
                return startIndex;
            }
        }
        return -1;
    }

    public static int canCompleteCircuit1(int[] gas, int[] cost) {
        if (arraySum(gas) < arraySum(cost)) return -1;
        int n = gas.length;
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (gas[i] - cost[i]);
            if (sum < 0) {
                sum = 0;
                answer = i + 1;
            }
        }
        return answer;
    }

    private static int arraySum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
