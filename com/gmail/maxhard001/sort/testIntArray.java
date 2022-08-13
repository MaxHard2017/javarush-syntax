package com.gmail.maxhard001.sort;

// import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
// import java.util.Arrays;

public class testIntArray {
    public static void main(String[] args) throws NumberFormatException, IOException, UnsupportedEncodingException {
        
    /*  TEST: IntArray.copyArray() 
        while(true) {
            System.out.print("\033[H\033[2J");              //clears cosole
 
            int[] testArray = {10, 120, -3, 2, 10, 3, 1, 2, 5, 1, 4, 8, -34, 23, 77, 45, 2, 45, 16, 36, 28};
            int[] sourceArray = {91, 93, 95, 96, 98, 99};
            System.out.println( "Initial Array: " + "\n" + Arrays.toString( testArray) );
            System.out.println( "Array elements cout: " + testArray.length);
            System.out.println( "Source Array: " + "\n" + Arrays.toString( sourceArray) );
            System.out.println( "Array elements cout: " + sourceArray.length );
    
            BufferedReader read = new BufferedReader( new InputStreamReader( System.in, "cp866" ));
            System.out.print( "Enter index to copy to: " );
            int startIndex = Integer.parseInt(read.readLine());
            System.out.print( "Enter index to copy from: " );
            int startSourceIndex = Integer.parseInt(read.readLine());
            System.out.print( "Enter number of items to copy: " );
            int copyLength = Integer.parseInt(read.readLine());
        
            IntArray.copyArray( testArray, startIndex, sourceArray, startSourceIndex, copyLength );
            System.out.println("New array:");
            System.out.println( Arrays.toString( testArray ));
            System.out.println("Array elements cout: " + testArray.length);

            System.out.println( "Iterations: " + IntArray.iterationCount );
            read.readLine();
        }
    */
    /* TEST merge() 
        System.out.print("\033[H\033[2J");              //clears cosole
        int[] a = {1, 13, 15, 29};
        int[] b = {23, 64, 87, 100, 201, 231, 342};
        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
        int[] sorted = merge(a, b);
        System.out.println("Sorted array: " + Arrays.toString(sorted));
    */
    /*TEST serach algorythms
        System.out.print("\033[H\033[2J");              //clears cosole
        int a = -100; // Начальное значение диапазона - "от"
        int b = 100; // Конечное значение диапазона - "до"
        int arrayLength = 80000;

        int[] unsortedArray = new int[arrayLength];
        
        for (int i = 0; i < arrayLength; i++) {
            unsortedArray[i] = a + (int) (Math.random() * b);
        }
    // System.out.println(Arrays.toString(unsortedArray));

        IntArray.iterationCount = 0;
        System.out.println("Sorted array: " + Arrays.toString(MergerSort.sort(unsortedArray)));
        System.out.println("Recurse iteration: " + MergerSort.recurseCount);
        System.out.println("Array operations: " + IntArray.iterationCount);


        IntArray.iterationCount = 0;
        BubbleSort.sort(unsortedArray);
    // System.out.println("Arranged array: " + Arrays.toString(unsortedArray));
        System.out.println("Arranged in " + IntArray.iterationCount + " iterations.");

        IntArray.iterationCount = 0;
        System.out.println( Arrays.toString(ChoiceSort.sort(unsortedArray)) );
        System.out.println("Count of copy operation of array elements:" + IntArray.iterationCount);
    */
        
    }
}