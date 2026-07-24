// File name: linearsearch.java

import java.util.*;

class Solution {
    public int linearSearch(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

public class linearsearch {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {2, 3, 4, 5, 3};
        int target = 3;

        int index = obj.linearSearch(nums, target);

        System.out.println(index);
    }
}