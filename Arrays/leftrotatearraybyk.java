// File name: leftrotatearraybyk.java

import java.util.*;

class Solution {
    public void rotateArrayByK(int[] arr, int k) {
        if(arr.length==0 || arr.length<1){
            return;
        }
        for(int i=0;i<k;i++){
            int first=arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=first;
        }
    }
}

public class leftrotatearraybyk {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        Solution obj = new Solution();
        obj.rotateArrayByK(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}