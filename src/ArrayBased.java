import java.sql.Array;

public class ArrayBased {
    public static void main(String[] args) {
//        int[] arr=new int[]{1,2,3,4,5};
        //1. Find largest element in an array
        //2. Find second largest element

//        int[] arr=new int[]{1,4,-4,5,6,-8};
//        int maxNum=arr[0];
//        int secMax=arr[1];
//        for(int i=2;i<arr.length;i++){
//            if(arr[i]>maxNum){
//                secMax=maxNum;
//                maxNum=arr[i];}
//        }
//    System.out.println("1st & 2nd max number:"+maxNum+" , "+secMax);

        //3. Find smallest and second smallest
//        int minNum=arr[0];
//        int secMin=arr[1];
//        for(int i=2;i<arr.length;i++){
//            if(arr[i]<minNum){
//                secMin=minNum;
//                minNum=arr[i];}
//        }
//        System.out.println("1st & 2nd min number:"+minNum+" , "+secMin);

        //4. Reverse an array
//        for(int x=arr.length-1;x>=0;x--){
//            System.out.print(arr[x]+",");
//        }
        //5. Check if array is sorted
        int[] arr=new int[]{1,2,3,4,5};

            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    System.out.println("NOT SORTED");
                    return;
                }
            }
        System.out.println("SORTED");
    }
}
