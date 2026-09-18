
package com.example.demo;

class LongestSubarraySumK {

    public static void main(String[] args) {

        int[] numbers = {6, 1,44, 1, 1, 3,1,1,1};

        // int taget = 6;              // ❌ Typo
        int targetSum = 6;

        // int maxLength = Integer.MIN_VALUE; // ❌ Unnecessary for length
        int maxLength = 0;

        int leftIndex = 0;

        // int Csum = 0;                // ❌ Naming convention
        int currentSum = 0;

        for (int rightIndex = 0; rightIndex < numbers.length; rightIndex++) {

            currentSum += numbers[rightIndex];

            while (currentSum > targetSum) {

                currentSum -= numbers[leftIndex];
                leftIndex++;
            }

            if (currentSum == targetSum) {

                // maxLength = Math.max(maxLength, i - left + 1); // ❌ Old variable names
                int currentLength = rightIndex - leftIndex + 1;

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        System.out.println(maxLength);
    }
}

