package com.DSA_PATTERNS.SlidingWindowVariable;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {

    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for(int right = 0 ; right < s.length() ; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen,set.size());
        }
        return maxLen;
    }
}
