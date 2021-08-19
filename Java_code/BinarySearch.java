package com.kunal;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-8, -2, -1, 0, 2, 3, 5, 15, 17, 19, 22, 50, 70};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;  //ans found
            }
        }
        return -1;
    }
}
