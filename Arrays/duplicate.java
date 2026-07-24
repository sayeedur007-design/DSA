// File name: duplicate.java

import java.util.*;

class Solution {
    public int removeDuplicates(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        int k=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
}

public class duplicate {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {0, 0, 3, 3, 5, 6};

        int k = obj.removeDuplicates(nums);

        System.out.println(k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}