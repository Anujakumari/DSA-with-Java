package com.company;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2,3,42,63,81};
        int target = 63;
        int result = linearSearch(nums, target);
        System.out.println(result);


    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }


        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;

    }

}
