// File name: kadane.java

import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

public class kadane {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int ans = obj.maxSubArray(nums);

        System.out.println(ans);
    }
}