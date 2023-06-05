package org.example;

import java.util.Arrays;

public class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int globalMax = 1;
        for (int i = 1; i < n; i++) {
            int localMax = 1;
            for (int j = 0; j < i; j++) {
                if(arr[i] - arr[j] == difference){
                    localMax = Math.max(localMax, dp[j] + 1);
                }
            }
            dp[i] = localMax;
            globalMax = Math.max(globalMax, localMax);
        }

        return globalMax;
    }
}