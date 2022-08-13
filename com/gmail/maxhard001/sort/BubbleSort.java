
/*
 * @(#)BubbleSort.java    0.01 2022/08/10
 * 
 * CC0
 * CC-BY-NC-SA
 */
package com.gmail.maxhard001.sort;

import java.util.Arrays;

/**
 * The BubbleSort.java class porvides bubble method for int array ascending sorting
 */
public class BubbleSort {
    public static void sort( int[] iArray ) {
        boolean needIteration = true;         // needIteration - key for proceeding chesking Array 
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < iArray.length; i++) {
                if (iArray[i] < iArray[i - 1]) {
                    IntArray.swap(iArray, i, i-1);
                    needIteration = true;               
                 }
            }
        }
    }

    public static void main(String[] args) {
        
        //test sort
        System.out.print("\033[H\033[2J");              //clears cosole
        int[] array = {43, 4, 54, 2, 111, 7, 34, 87, 5, 8, 43, 12, 9, -7, -13, 0};
        System.out.println("Initial  array: " + Arrays.toString(array));
        BubbleSort.sort(array);
        System.out.println("Arranged array: " + Arrays.toString(array));
        System.out.println("Arranged in " + IntArray.iterationCount + " iterations.");
    }
}
