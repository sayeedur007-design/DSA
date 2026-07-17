import java.util.*;

public class mergesort{

    static void ms(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        ms(nums, left, mid);
        ms(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    static void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        for (int n = 0; n < temp.length; n++) {
            nums[left + n] = temp[n];
        }
    }

    public static void main(String[] args) {

        int[] nums = {7, 4, 1, 3, 5};

        ms(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }
}