import java.util.ArrayList;
import java.util.List;

public class DS2906 {

    public static boolean  twoSum(List<Integer> list, Integer target) {
        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Integer multipleTimeSellsAndbuy(List<Integer> list){Integer profit=0;
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i)>list.get(i-1)) {
                profit+=(list.get(i)-list.get(i-1));
            }
        }
        return profit;}
    public static Integer singleSaleMaxProfit(List<Integer> list){
        Integer maxSoFar=0;
        int maxProfit=0;
        Integer minSoFar=list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i)<minSoFar) {
                minSoFar=list.get(i);
            }
            if(list.get(i)>maxSoFar) {
                maxSoFar=list.get(i);
            }
             maxProfit=maxSoFar-minSoFar;
        }
        return maxProfit;
    }
    public static Integer kDans(List<Integer> list){
        //MAX SUM of subarray
        int currentSum = list.get(0);
        int maxSum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            currentSum = Math.max(list.get(i), currentSum + list.get(i));
            maxSum = Math.max(maxSum, currentSum);}
        return maxSum;
    }
    public static void main(String[] args) {
        /*
        1. Find maximum element.
        1. Two Sum
        2. Best Time to Buy and Sell Stock
        3. Maximum Subarray (Kadane)
        4. find Max value by stream
        */

        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(32);
        list.add(41);
//        int maxNum = list.stream()
//                .mapToInt(Integer::intValue)
//                .max()
//                .orElseThrow(() -> new RuntimeException("Not Found"));
//        System.out.println(maxNum);
       //  System.out.println(twoSum(list,3));
      //  System.out.println(multipleTimeSellsAndbuy(list));
       // System.out.println(singleSaleMaxProfit(list));
        System.out.println(kDans(list));
    }
}
