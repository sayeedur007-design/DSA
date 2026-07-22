import java.util.*;

public class peakarraysort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }

    public static void main(String[] args) {

        int[] arr = {9, 4, 5, 3, 8, 7, 10, 11};

        ArrayList<Integer> peaks = new ArrayList<>();

        if (arr[0] > arr[1]) {
            peaks.add(arr[0]);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peaks.add(arr[i]);
            }
        }

        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            peaks.add(arr[arr.length - 1]);
        }

        int[] peakArray = new int[peaks.size()];

        for (int i = 0; i < peaks.size(); i++) {
            peakArray[i] = peaks.get(i);
        }

        mergeSort(peakArray, 0, peakArray.length - 1);

        System.out.println(Arrays.toString(peakArray));
    }
}