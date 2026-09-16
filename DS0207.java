import java.util.Arrays;
import java.util.HashSet;

public class DS0207 {

    public static void main(String[] args) {

        // ==========================
        // 1. Find Missing Number
        // ==========================
        int[] missingArr = {3, 0, 1};

        int n = missingArr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : missingArr) {
            actualSum += num;
        }

        System.out.println("Missing Number : " + (expectedSum - actualSum));


        // ==========================
        // 2. Find Duplicate Number
        // ==========================
        int[] duplicateArr = {1, 3, 4, 2, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int num : duplicateArr) {
            if (!set.add(num)) {
                System.out.println("Duplicate Number : " + num);
                break;
            }
        }


        // ==========================
        // 3. Product of Array Except Self (Brute Force)
        // ==========================
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {

            int ss = 1; // Left product
            int es = 1; // Right product

            // Right side product
            for (int j = i + 1; j < arr.length; j++) {
                es *= arr[j];
            }

            // Left side product
            for (int k = i - 1; k >= 0; k--) {
                ss *= arr[k];
            }

            System.out.println(ss * es);
        }
        // ==========================
        // 4. Sum of All Numbers (Stream)
        // ==========================
        int[] sumArr = {10, 20, 30, 40, 50};

        int sum = Arrays.stream(sumArr).sum();

        System.out.println("Sum : " + sum);
    }
}