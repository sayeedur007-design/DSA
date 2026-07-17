import java.util.*;
public class selectionSort{

    static void swap(int[] nums,int a,int b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
        }
    public static void main(String[] args){
        int[] nums={7,4,1,3,5};
        for(int i=0;i<nums.length-1;i++){
            int si=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[si]>nums[j]){
                    si=j;
                    
                }
                                

            }
            swap(nums,i,si);
        }
    System.out.println(Arrays.toString(nums));
 }
}