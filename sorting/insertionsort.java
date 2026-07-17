import java.util.*;
public class insertionsort{
    public static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void main(String[] args){
        int[] nums={7,4,1,3,2};
        for(int i=1;i<nums.length;i++){
            int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
        System.out.println(Arrays.toString(nums));
    }
}