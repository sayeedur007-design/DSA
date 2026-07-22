import java.util.*;

public class checksorted {

    static class Solution {

        public int ifsort(int[] arr) {
            for(int i=1;i<arr.length;i++){
                if(arr[i-1]>arr[i]){
                    return -1;
                }

            }
            return 1;
        }

    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {2,3,2,2,5,6,8,2,2,2};

        System.out.println(obj.ifsort(nums));
    }
}