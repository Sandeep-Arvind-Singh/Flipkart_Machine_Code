package ds;

import java.util.Arrays;

public class CountInversionByMergeSort {
    public static void main(String[] args) {
       // int arr[] = {12, 11, 13, 5, 6, 7};
        int arr[] = {1, 20, 6 , 4 , 5};

        int[] temp = new int[arr.length];

       System.out.println( mergeSort(arr,0, arr.length - 1));
       Arrays.stream(temp).forEach(System.out::println);

    }

    private static int mergeSort(int[] arr, int l, int r) {
        int inv_count = 0;
        if (l < r) {
            int m = (l + r) / 2;
            inv_count+=  mergeSort(arr, l, m);
            inv_count+=  mergeSort(arr,m + 1, r);

            inv_count += merge(arr, l, m, r);
        }
        return inv_count;
    }

    private static int merge(int[] arr ,int l, int m, int r) {
        int i = 0, j = m+1;
        int inv_count=0;
        int k = 0;
        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
        while ((i < left.length) && (j < right.length)) {
            if (left[i] <=  right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                inv_count =inv_count+ (m+1)-(l+i);
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
        return inv_count;
    }
}
