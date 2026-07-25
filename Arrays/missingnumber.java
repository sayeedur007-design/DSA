// File name: missingnumber.java

import java.util.*;

class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int i;
        for( i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]+1){
                
                return arr[i-1]+1;
            }
            
        }
        return arr[i-1]+1;
    }
}

public class missingnumber {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {0,2, 3, 1, 4};

        int ans = obj.missingNumber(nums);

        System.out.println(ans);
    }
}