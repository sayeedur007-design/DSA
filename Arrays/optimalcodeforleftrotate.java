// File name: optimalcodeforleftrotate.java

import java.util.*;

class Solution {
    private void reverse(int[] arr, int start, int end) {
        while(end>start){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public void rotateArrayByK(int[] arr, int k) {
        if(arr.length==0 || arr.length==1){
            return;
        }
        k=k%arr.length;  // this is done to reduce the number of rotations like see if 7 rotations has to be done and length of array is 5 so we just need to 2 rotations insed to doing 7 so optimal rotations we can do 
        reverse(arr,0,k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
}

public class optimalcodeforleftrotate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        Solution obj = new Solution();
        obj.rotateArrayByK(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}