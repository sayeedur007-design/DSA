class Solution {
    public int jump(int[] arr) {
        int curr=0;
        int maxreach=0;
        int jump=0;
        for(int i=0;i<arr.length-1;i++){
            maxreach=Math.max(maxreach,i+arr[i]);
            if(i==curr){
                jump++;
                curr=maxreach;
            }
            
        }
        return jump;
    }
}
