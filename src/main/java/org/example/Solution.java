package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int n = arr.length;
        Map<Integer, Integer> dp = new HashMap<>();
        int globalMax = 1;

        for (int i = 0; i < n; i++) {
            int localMax = dp.getOrDefault(arr[i] - difference, 0) + 1;
            dp.put(arr[i], localMax);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}