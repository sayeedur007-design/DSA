public class containerproblem {

    public static int maxArea(int[] arr) {
        int lp=0;
        int rp=arr.length-1;
        int max=0;
        while(lp<rp){
            int width=rp-lp;
            int heigth=Math.min(arr[lp],arr[rp]);
            int currarea=width * heigth;
            max=Math.max(max, currarea);
            if(arr[lp]<arr[rp]){
                lp++;
            }
            else rp--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int ans = maxArea(arr);
        System.out.println(ans);
    }
}