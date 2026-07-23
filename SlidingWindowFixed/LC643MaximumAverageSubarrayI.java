package com.DSA_PATTERNS.SlidingWindowFixed;

public class LC643MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        double maxSum = 0;
        double avg = 0;

        for(int right = 0 ; right < k ; right++){
            sum += nums[right];
        }

        maxSum = sum;

        for(int right = k ; right < n ; right++){
            sum += nums[right];
            sum -= nums[right-k];
            maxSum = Math.max(maxSum,sum);
        }
        avg = maxSum/k;
        return avg;
    }
}
