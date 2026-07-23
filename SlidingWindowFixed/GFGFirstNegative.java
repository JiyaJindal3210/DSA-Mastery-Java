package com.DSA_PATTERNS.SlidingWindowFixed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GFGFirstNegative {
    static List<Integer> firstNegInt(int arr[], int k) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        int left = 0;
        for(int right = 0 ; right < n ; right++){
            if(arr[right]<0){
                q.offer(right);
            }
            if(right - left + 1 == k){
                if(q.isEmpty()){
                    ans.add(0);
                }
                else{
                    ans.add(arr[q.peek()]);
                }
                if(!q.isEmpty() && q.peek()==left){
                    q.poll();
                }
                left++;
            }
        }
        return ans;
    }
}
