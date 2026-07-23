package com.DSA_PATTERNS.SlidingWindowFixed;

import java.util.Deque;
import java.util.LinkedList;

public class LC239SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<>();
        int left = 0;

        for(int right = 0 ; right < n ; right++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[right]){
                dq.pollLast();
            }
            dq.offerLast(right);
            if(dq.peekFirst()<left){
                dq.pollFirst();
            }
            if(right-left+1 == k){
                ans[left++] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}

