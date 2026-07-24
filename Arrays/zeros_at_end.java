import java.util.*;

public class zeros_at_end {

    static class Solution {

        public void moveZeroes(int[] nums) {
            int[] temp=new int[nums.length];
            for(int i=0,k=0;i<nums.length;i++){
                if(nums[i]!=0){
                    temp[k]=nums[i];
                    k++;
                }
            }
            for(int i=0;i<nums.length;i++){
                nums[i]=temp[i];
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        obj.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}