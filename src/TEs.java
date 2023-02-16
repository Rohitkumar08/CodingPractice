import java.util.*;

/**
 * Created 22/12/21 1:09 PM
 *
 * @author Rohit Rawani
 */
public class TEs {
    public static void main(String[] args) {
        int[] arr ={0,1,6,6,4,6};
//        System.out.println(getMaxFruits(arr));
        TEs test = new TEs();
        System.out.println(test.getMaxFruitsV2(arr));
    }

    public int getMaxFruitsV2(int[] arr) {
        int n = arr.length;
        if(n<2){
            return n;
        }
        int maxCount = 0;
        int currCount=0;
        Queue<Integer> queue = new LinkedList<>();
        int i=0;
        Set<Integer> uniqueKeys = new HashSet<>();

        while(i<n){
            uniqueKeys.add(arr[i]);
            if(uniqueKeys.size()>2){
                while(queue.size()>1){
                    queue.poll();
                    currCount--;
                }
            }
            queue.add(arr[i]);
            if(uniqueKeys.size()>2){
                int firstKey = queue.poll();
                int secondKey = queue.poll();
                uniqueKeys.removeIf(val -> val != firstKey && val != secondKey);
                queue.add(firstKey);
                //add if similar key got removed
                queue.add(secondKey);

            }
            currCount++;
            i++;

            if(maxCount<currCount){
                maxCount=currCount;
            }
        }
        return maxCount;
    }

    public class FruitNode{
        int index;
        int count;
        int value;

        public FruitNode(int index, int count, int value){
            this.count=count;
            this.index=index;
            this.value=value;
        }
    }

    public static int getMaxFruits(int[] arr){
        Map<Integer, Integer> firstBucket = new HashMap<>();
        Map<Integer, Integer> secBucket = new HashMap<>();
        int maxTillNow=0;
        int currMax=0;
        for(int i =0; i<arr.length; i++){
            if(firstBucket.isEmpty() || (!firstBucket.isEmpty() && firstBucket.containsKey(arr[i]))){
                int currentValue=0;
                if(firstBucket.get(arr[i])!=null){
                    currentValue=firstBucket.get(arr[i]);
                    firstBucket.put(arr[i], currentValue+1);
                }else{
                    firstBucket.put(arr[i], 1);
                }
            }else if(secBucket.isEmpty() || (!secBucket.isEmpty() && secBucket.containsKey(arr[i]))){
                int currentValue=0;
                if(secBucket.get(arr[i])!=null){
                    currentValue=secBucket.get(arr[i]);
                    secBucket.put(arr[i], currentValue+1);
                }else{
                    secBucket.put(arr[i], 1);
                }
            }else if(!firstBucket.isEmpty() && !firstBucket.containsKey(arr[i])){
                firstBucket.remove(firstBucket.keySet().iterator().next());
                firstBucket.put(arr[i], 1);
            }
            if(!firstBucket.isEmpty() && !secBucket.isEmpty()){
                currMax = (firstBucket.get(firstBucket.keySet().iterator().next())+secBucket.get(secBucket.keySet().iterator().next()));

            }
            if(maxTillNow<currMax){
                maxTillNow= currMax;
            }
        }
        return maxTillNow;
    }
}



