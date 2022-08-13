/*
 * @(#)MergeSort.java    0.01 2022/08/12
 * 
 * CC0
 * CC-BY-NC-SA
 */
package com.gmail.maxhard001.sort;

import java.util.Arrays;

/**
 * The MergeSort.java class porvides most advanced method of int array ascending sorting
 * using "Merge sorting" algorith
 */
public class MergerSort {
    public static int recurseCount = 0;

    public static int[] merge( int[] aArray, int[] bArray ) {
        recurseCount++;
        if (aArray.length == 0) return bArray;
        if (bArray.length == 0) return aArray;
        
        if (aArray[0] < bArray[0]) {
            if (aArray.length == 1) {
                return concatArrays( aArray[0], bArray );
            } else {
                int[] tempArray = new int[aArray.length - 1];
                IntArray.copyArray( tempArray, 0, aArray, 1, aArray.length - 1);
                return concatArrays( aArray[0], merge( tempArray, bArray ));
            }
            
        } else {
            if (bArray.length == 1) {
                return concatArrays( bArray[0], aArray );
            } else {
                int[] tempArray = new int[bArray.length - 1];
                IntArray.copyArray( tempArray, 0, bArray, 1, bArray.length - 1);
                return concatArrays( bArray[0], merge( aArray, tempArray ));
            }
       }   
    }

    private static int[] concatArrays( int head, int[] mergeArray ) {
        int[] tempArray = new int[mergeArray.length + 1];
        tempArray[0] = head;
        if (mergeArray.length == 1) {
            tempArray[1] = mergeArray[0];
        } else {
            IntArray.copyArray( tempArray, 1, mergeArray, 0, mergeArray.length );
        }
        return tempArray;
    }

    public static int[] sort(int[] sortArray) {
        recurseCount++;
        if (sortArray.length == 1) return sortArray;
        int middle = sortArray.length / 2;
        int[] leftHalf = new int[middle];
        IntArray.copyArray( leftHalf, 0, sortArray, 0, middle );
        int[] rightHalf = new int[sortArray.length - middle];
        IntArray.copyArray( rightHalf, 0, sortArray, middle, sortArray.length - middle );
        return  merge( sort(leftHalf), sort(rightHalf) );
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");              //clears cosole
        
        int[] unsorted = {43, 4, 54, 2, 111, 7, 34, 87, 5, 8, 43, 12, 9, -7, -13, 0};
        System.out.println("Unsorted array: " + Arrays.toString(unsorted));
        System.out.println("Elements: " + unsorted.length);
        int[] sorted = sort(unsorted);
        System.out.println("Sorted array: " + Arrays.toString(sorted));
        System.out.println("Elements: " + sorted.length);
        System.out.println("Recurse iteration: " + recurseCount);
        System.out.println("Array operations: " + IntArray.iterationCount);
    }
}
