// File name: singlenumber.java

import java.util.*;

class Solution {
    public int singleNumber(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return -1;
    }
}

public class singlenumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 3, 1, 4};

        Solution obj = new Solution();
        int result = obj.singleNumber(arr);

        System.out.println(result);
    }
}