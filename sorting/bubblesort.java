import java.util.*;
public class bubblesort{

    static void swap(int[] nums,int a,int b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
        }
    public static void main(String[] args){
        int[] nums={7,4,1,3,5};
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
            if(nums[j]>nums[j+1]){
                swap(nums,j,j+1);
            }
        }
        }
        System.out.println(Arrays.toString(nums));

        



    }
}