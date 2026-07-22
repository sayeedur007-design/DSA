import java.util.*;

public class quicksort {

    static class Solution {

        public static int[] quickSort(int[] nums) {
            quickSort(nums, 0, nums.length - 1);
            return nums;
        }

        static void quickSort(int[] nums, int low, int high) {
            if (low >= high) {
                return;
            }

            int pivotIndex = partition(nums, low, high);

            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }

        static int partition(int[] nums, int low, int high) {
            int pivot = nums[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (nums[j] < pivot) {
                    i++;
                    swap(nums, i, j);
                }
            }

            swap(nums, i + 1, high);
            return i + 1;
        }

        static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {6, 7, 1, 3, 5};

        Solution.quickSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}