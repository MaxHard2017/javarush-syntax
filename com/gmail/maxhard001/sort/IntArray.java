package com.gmail.maxhard001.sort;

import java.util.Arrays;

public class IntArray {

    public static int iterationCount = 0;       // Search iteration counter

    /**
     * swap() - swaps values of the given two elements of an int array.
     * Adress values by its indexes
     * @param iArray[] - Changed array of integer
     * @param loIndex - first index to swap
     * @param hiIndex - seacond index to swap
     */
    public static void swap( int[] iArray, int loIndex, int hiIndex) {
        //checks
        if (loIndex == hiIndex) return;
        if (loIndex < 0 | loIndex > (iArray.length - 1)) {
            System.out.println("Index " + loIndex + " out of boundaries of array " + Arrays.toString(iArray));
            return;
        }
        if (hiIndex < 0 | hiIndex > (iArray.length - 1)) {
            System.out.println("Index " + hiIndex + " out of boundaries of array " + Arrays.toString(iArray));
            return;
        }
        if (iArray[loIndex] == iArray[hiIndex]) return;
        //end checks

        int temp = iArray[loIndex];
        iArray[loIndex] = iArray[hiIndex];
        iterationCount++;
        iArray[hiIndex] = temp;
        iterationCount++;
    }

    /**
     * minIndex() searches the index of minimal item in int array
     * @param iArray[] - search array
     * @return - int index of minimal element
     */
    public static int minIndex( int[] iArray ) {        // serachs index of the minimum element
        int minimum = iArray[0];
        int minimumIndex = 0;
        for (int i = 1; i < iArray.length; i++) {
            if (iArray[i] < minimum) {
                minimum = iArray[i];
                iterationCount++;
                minimumIndex = i;
            }
        }
        return minimumIndex;
    }

    /**
     * copyArray() copies Source int array into the Target changing it. 
     * It tooks subsequent items from Source array starting from [startSourceIndex[] index
     * to the end of Source array and copy them to the Targer array 
     * starting from [startTargetIndex] index.
     * @param iTargetArray[] - Target int array
     * @param startTargetIndex - index of Target array for start copying in
     * @param iSourceArray[] -Source int array
     * @param startSourceIndex - index if Source array for start copying from
     * @param copyLength - length of the source array starting from [0] index which we would like to copy
     */
    public static void copyArray(int[] iTargetArray, int startTargetIndex, int[] iSourceArray, int startSourceIndex, int copyLength) {
        //cheks
        if (copyLength < 1) {
            System.out.println("Can not copy " + copyLength + " elements. \n0 elements copied...");
            return;
        }
        if ((startTargetIndex > iTargetArray.length - 1) || ( startTargetIndex < 0)) {
            System.out.println("Index ["  + startTargetIndex + "] for start copying operation is out off Target array boundaries.");
            return;
        }
        if ((startSourceIndex > iSourceArray.length - 1) || ( startSourceIndex < 0)) {
            System.out.println("Index ["  + startSourceIndex + "] for start copying operation is out off Source array boundaries.");
            return;
        }
        if (iSourceArray.length < (startSourceIndex + copyLength)) {
            System.out.println( "There is no " + copyLength  + " items in Source array" );
            copyLength = iSourceArray.length - startSourceIndex;
            System.out.println( "only " + copyLength + " items will be copied." );
        }
        if (iTargetArray.length - startTargetIndex < copyLength) {
            System.out.println("There is no room in Target array starting from [" + startTargetIndex + "] index to copy " + copyLength + " items.");
            System.out.println("Only " + (iTargetArray.length - startTargetIndex) + " items could be copied.");
            return;
        }
        //end of cheks

        for (int i = 0; i < copyLength; i++) {
            iTargetArray[i +  startTargetIndex] = iSourceArray[i + startSourceIndex];
            iterationCount++;
        }
    }

    /**
     * int[] dellArrayItem() - deletes given index in int array but do not change Source array.
     * Creates New array and copy Source array except deleted index. New array lenth = Source array length - 1.
     * @param iSourceArray[] - Source array of integers.
     * @param delIndex - index which we would like to delete in Source array.
     * @return link to the New created array.
     */
    public static int[] dellArrayItem( int[] iSourceArray, int delIndex ) {
        if ((delIndex > iSourceArray.length - 1) | ( delIndex < 0)) {
            System.out.println("Failed deleting index ["  + delIndex + "] - its out off array boundaries: 0 - " + (iSourceArray.length - 1));
            return null;
        }    
        int[] iTempArray = new int[ iSourceArray.length - 1 ];
        
        if ( iSourceArray.length == 1 ) {
            return iTempArray;
        } else {
            if ( delIndex > 0 ) {
                copyArray( iTempArray, 0, iSourceArray, 0, delIndex );
            }
            if ( delIndex < iSourceArray.length - 1 ) {
                copyArray( iTempArray, delIndex, iSourceArray, delIndex + 1, iSourceArray.length - delIndex - 1 );
            }
            return iTempArray;
        }
    }


}
