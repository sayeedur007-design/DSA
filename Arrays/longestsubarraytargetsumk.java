// File name: longestsubarraytargetsumk.java

import java.util.*;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int maxlen=0;
        
        
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
            
        }
        return maxlen;
    }
}

public class longestsubarraytargetsumk {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int ans = obj.longestSubarray(arr, k);

        System.out.println(ans);
    }
}