// File name: rotatearraybyone.java

import java.util.*;

class Solution {
    public void rotateArrayByOne(int[] arr) {
        if(arr.length==0 || arr.length<1){
            return;
        }
        int first=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
    }
}

public class rotatearraybyone {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        Solution obj = new Solution();
        obj.rotateArrayByOne(nums);

        System.out.println(Arrays.toString(nums));
    }
}