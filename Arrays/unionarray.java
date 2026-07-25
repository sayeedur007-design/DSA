// File name: unionarray.java

import java.util.*;

class Solution {
    public int[] unionArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (res.isEmpty() || res.get(res.size() - 1) != arr1[i]) {
                    res.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                if (res.isEmpty() || res.get(res.size() - 1) != arr1[i]) {
                    res.add(arr1[i]);
                }
                i++;
            } else {
                if (res.isEmpty() || res.get(res.size() - 1) != arr2[j]) {
                    res.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (res.isEmpty() || res.get(res.size() - 1) != arr1[i]) {
                res.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (res.isEmpty() || res.get(res.size() - 1) != arr2[j]) {
                res.add(arr2[j]);
            }
            j++;
        }

        int[] ans = new int[res.size()];
        for (int k = 0; k < res.size(); k++) {
            ans[k] = res.get(k);
        }

        return ans;
    }
}

public class unionarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 7};

        Solution obj = new Solution();
        int[] result = obj.unionArray(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}