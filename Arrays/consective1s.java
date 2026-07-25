// File name: consective1s.java

import java.util.*;

class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        if(arr.length==0 || arr.length<1){
            return 0;
        }
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1){
                max=Math.max(max,count);
                count=0;
            }
            else{
                
                count++;
                max=Math.max(max, count);
            }
        }
        return max;
    }
}

public class consective1s {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 1, 1};

        Solution obj = new Solution();
        int result = obj.findMaxConsecutiveOnes(arr);

        System.out.println(result);
    }
}