import java.util.*;

public class largest {

    static class Solution {

        public int largestElement(int[] nums) {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>max){
                    max=nums[i];
                }
            }
            return max;
        }

    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {3, 3, 6, 1};

        System.out.println(obj.largestElement(nums));
    }
}