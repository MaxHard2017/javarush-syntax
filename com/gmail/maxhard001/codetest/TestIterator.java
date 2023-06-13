package com.gmail.maxhard001.codetest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestIterator {
    /**
     * removeIntegerLessThan10() - removes integers from set using 'for' cycle
     * and access to set element to remove through an iterator
     * @param intSet - input set of integers 
     * @return Set<Integer> copyIntSet - modifyed copy of input Set<Integer> intSet
     */
    public static Set<Integer> removeIntegerLessThan10(Set<Integer> intSet) {
        
        Set<Integer> copyIntSet = new HashSet<Integer>(intSet);
        Iterator<Integer> intIterator = copyIntSet.iterator();

        for (;intIterator.hasNext();) {
            if (intIterator.next() <= 10) {
                 intIterator.remove();
            }
        }

        return copyIntSet;
    }

    /**
     * removeIntegerGraterThan10() - removes integers from set using 'foreach'
     * cycle and use remove() method of te set object to remove element.
     * 'copyIntSet' - copy of the input set 'intSet' is needed for iteretion
     * in order to avoid 'ConcurrentModificationException'
     * @param intSet - input set of integers 
     * @return Set<Integer> copyIntSet - modifyed copy of input Set<Integer> intSet
     */
    public static Set<Integer> removeIntegerGraterThan10(Set<Integer> intSet) {

        Set<Integer> copyIntSet = new HashSet<Integer>(intSet);

        for (Integer item : intSet) {
            if (item >= 10) {                
                copyIntSet.remove(item);
            }
        }
        
        return copyIntSet; 
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 10, 13, 13, 14, 15};
        Set<Integer> intInitianSet = new HashSet<Integer>(Arrays.asList(intArray ));
        System.out.println("Initial set : " + intInitianSet);
        
        Set<Integer> intSetLessTen = removeIntegerGraterThan10(intInitianSet);
        System.out.println("Less  then  10 set: " + intSetLessTen);
        
        Set<Integer> intSetGraterTen = removeIntegerLessThan10(intInitianSet);
        System.out.println("Grater than 10 set: " + intSetGraterTen);
        System.out.println("Initial set is not modifyed: " + intInitianSet);
    }
}