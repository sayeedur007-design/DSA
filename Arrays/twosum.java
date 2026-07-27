import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] temp=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){    
                if(arr[i]+arr[j]==target){
                    temp[0]=i;
                    temp[1]=j;
                }
            }                          //THe optimal code uses hashmap
        }
         Arrays.sort(temp);
         return temp;
    }
}

public class twosum {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] arr = {1, 6, 2, 10, 3};
        int target = 3;

        int[] ans = obj.twoSum(arr, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}