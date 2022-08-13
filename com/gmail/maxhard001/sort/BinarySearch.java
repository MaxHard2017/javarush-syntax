/*
 * @(#)BinarySearch.java    0.01 2022/08/12
 * 
 * CC0
 * CC-BY-NC-SA
 */
package com.gmail.maxhard001.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * BinarySearch.java implements search of an elemint in the search Array of integers
 * search() - "Binary search" method
 */
public class BinarySearch {

    public static int searchIterationCount = 0;     //counts search operations of the algorithm 

    /**
     * search() - Perfoms search fo an integer value in int search array
     * using "Binary search" algoriythm
     * @param searchArray[] - search array of integer
     * @param value - searched value
     * @return - int index of a searched value in searched array of null if not found
     */
    public static Integer search( int[] searchArray, int value ) {
        int loIndex = 0;
        int hiIndex = searchArray.length - 1;
        int halfIndex = 0;                               // determins the middle of searched sequence starting from hiIndex position
        if (searchArray[loIndex] == value) return loIndex;
        if (searchArray[hiIndex] == value) return hiIndex;

        while(hiIndex - loIndex > 1) {

            halfIndex = (hiIndex - loIndex + 1) / 2;               // количество элеменов = разница индексов + 1
            if (searchArray[loIndex + halfIndex] == value) return loIndex + halfIndex;
            
            if ( value <  searchArray[loIndex + halfIndex] ){
                hiIndex = loIndex + halfIndex - 1;
            } else {
                loIndex = loIndex + halfIndex + 1;
            }
            if (searchArray[loIndex] == value) return loIndex;
            if (searchArray[hiIndex] == value) return hiIndex;
            searchIterationCount++;
        }
        return null;
    }

    public static void main( String[] args ) throws IOException {

        /* TEST for binary search */    
        System.out.print("\033[H\033[2J");              //clears cosole
        System.out.flush();                                //reset cursor to staart position 

        int[] testArray = {10, 120, -3, 2, 10, 3, 1, 2, 5, 1, 4, 8, -34, 23, 77, 45, 2, 45, 16, 36, 28};
        System.out.println(  "Initial Array: " + "\n" + Arrays.toString( testArray) );
        System.out.println("Array elements cout: " + testArray.length);
        
        System.out.println( "Sorting Array ..." );
        testArray = ChoiceSort.sort( testArray);
        System.out.println( Arrays.toString( testArray));
        System.out.println("Array elements cout: " + testArray.length);
        System.out.println( "Array operation iterations: " + IntArray.iterationCount );

        BufferedReader read = new BufferedReader( new InputStreamReader( System.in, "cp866" ));
        System.out.print( "Enter value to search in array: " );
        int searchIndex = Integer.parseInt(read.readLine());
        
        Integer index = search( testArray, searchIndex);
        if (index == null) {
            System.out.println( "Value " + searchIndex + " not found in searched array." );
        } else { 
            System.out.println( "Searched value: {" + searchIndex + "} index [" + index + "]" );
        }
        System.out.println( "Search iterations: " + searchIterationCount );
    }
}
