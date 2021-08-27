package com.company;

import java.utils.Array;

public class BubbleSort {

      public static void main(String[] args) {
          int[] arr = {5,2,7,1,4,18,10};
          bubbleSort(arr);
          System.out.println(Arrays.toString(arr));
  
      }
      
      static void bubbleSort(int[] arr) {
        boolean swapped;
        
        for (int i = 0; i < arr.length; i++) {                               // run the steps n-1 times
            swapped = false;
            
            for (int j = 1; j < arr.length - i; j++) {                       // for each step, greatest item will come at the last respective index
                if (arr[j] < arr[j-1]) {                                     // swap if the item is smaller than the previous item
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if there is no swapping for a particular value of i, it means the array is sorted, hence stop the program.
            if (!swapped) { 
                break;
            }
        }
    }
}

