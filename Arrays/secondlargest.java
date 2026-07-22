import java.util.*;

public class secondlargest {

    static class Solution {

        public int secondlargest(int[] nums) {
            int max=Integer.MIN_VALUE;
            int second=Integer.MIN_VALUE;
            for(int x : nums){
                if(x>max){
                    second=max;
                    max=x;
                }
                else if(x>second && x!=max){
                    second=x;
                }
            }
            if(second==Integer.MIN_VALUE){
                return -1;
            }
            return second;
        }

    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {2,2,2,2,2,2,2};

        System.out.println(obj.secondlargest(nums));
    }
}