
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DS3006 {
    /*Find minimum element.
    Move Zeroes

6. Merge Sorted Arrays*/

    public static void main(String[] args) {
        Integer [] arr={1,2,3,4,5,5,5,6,7};
//        int minNum= Arrays.stream(arr).mapToInt(Integer::intValue).min().orElseThrow(() -> new RuntimeException("not found"));
//        int[] nonZero=new int[arr.length];
//        int j=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                nonZero[j]=arr[i];
//                j++;
//            }
//        }
//        System.out.println(arr.length);
//        System.out.println(nonZero.length);
//        while(j<nonZero.length){
//            nonZero[j]=0;
//            j++;
//        }
//        System.out.println(minNum);
//        for(int k=0;k<j;k++){
//            System.out.print(nonZero[k]+",");
//
//        }

        //5. Remove Duplicates from Sorted Array
//        List<Integer> list = new ArrayList<>();
//
//        list.add(arr[0]);
//
//        for (int i = 1; i < arr.length; i++) {
//
//            if (!arr[i].equals(arr[i - 1])) {
//                list.add(arr[i]);
//            }
//        }
//
//        System.out.println(list);
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of arr1
        while (i < arr1.length) {
            result[k++] = arr1[i++];

        }

        // Copy remaining elements of arr2
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(result));}
}
