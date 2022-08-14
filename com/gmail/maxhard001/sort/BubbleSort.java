
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
    public static int calcChecks = 0;
    public static int calcSwaps = 0;
    public static void sort( int[] iArray ) {
        boolean needIteration = true;         // needIteration - key for proceeding chesking Array 
        int totalItetation = iArray.length;
        
        while (needIteration && (totalItetation > 0)) {
            needIteration = false;
            for (int i = 1; i < totalItetation; i++) {  //decrease totalItetation in order not to check arranged tail of array
                calcChecks++;
                if (iArray[totalItetation - i] < iArray[totalItetation - 1 - i]) {
                    IntArray.swap(iArray, totalItetation - i, totalItetation - i - 1);      // max value of will be placed to the end of array
                    needIteration = true;
                    calcSwaps++;

                 }
                 if (iArray[i] < iArray[i - 1]) {
                    IntArray.swap(iArray, i, i-1);      // max value of will be placed to the end of array
                    needIteration = true;
                    calcSwaps++;
                       
                 }
            }
            totalItetation--;   
        }
        System.out.println(calcChecks);
        System.out.println(calcSwaps);
        System.out.println(iArray.length - totalItetation); // calculate counts of "big" cycle while
    }

    public static void main(String[] args) {
        
        //test sort
        System.out.print("\033[H\033[2J");              //clears cosole
        int[] array = {43, 4, 54, 2, 111, 7, 34, 87, 5, 8, 43, 12, 9, -7, -13, 0, -34, -12, -54, 45};
        System.out.println("Initial  array: " + Arrays.toString(array));
        BubbleSort.sort(array);
        System.out.println("Arranged array: " + Arrays.toString(array));
        System.out.println("Arranged in " + IntArray.iterationCount + " iterations.");
    }
}
