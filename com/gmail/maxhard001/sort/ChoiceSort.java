/*
 * @(#)ChoiceSotr.java    0.01 2022/08/10
 * 
 * CC0
 * CC-BY-NC-SA
 */
package com.gmail.maxhard001.sort;

import java.io.IOException;
import java.util.Arrays;

/**
 * The ChoiceSort.java class porvides some "advanced" :)) method of int array ascending sorting
 * using choise algorith
 */
public class ChoiceSort {
    /**
     * sort() sorts int array using the "Choice" algorithm.
     * @param iArray[] - unsorted int array for sorting.
     * @return - link to the New created and sorted int array.
     */
    public static int[] sort( int[] iArray ) {
        int[] iTemp = new int[iArray.length];
        int tempIndex = 0;                  // piont to the index nex to the end of new sorted (iTemp) array
        int minIndex = 0;                   // will points to the mext found minimal in the searched (iArray)array
        while ( iArray.length > 0) {
            minIndex = IntArray.minIndex( iArray );
            iTemp[tempIndex] = iArray[minIndex];
            IntArray.iterationCount++;
            tempIndex++;
            iArray = IntArray.dellArrayItem(iArray, minIndex);
        }
        return iTemp;
    }

    public static void main( String[] args ) throws IOException {

        // Test sort
        System.out.print("\033[H\033[2J");              //clears cosole
        int[] array = {43, 4, 54, 2, 111, 7, 34, 87, 5, 8, 43, 12, 9, -7, -13, 0};
        System.out.println(  "Initial array: " + "\n" + Arrays.toString(array) );
        System.out.println("Sorting array ...");
        System.out.println( Arrays.toString(ChoiceSort.sort(array)) );
        System.out.println("Count of copy operation of array elements:" + IntArray.iterationCount);
    }
}