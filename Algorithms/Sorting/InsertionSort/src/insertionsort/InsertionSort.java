/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Arrays;

/**
 *
 * @author Sydnee
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int unsortedArray[] = new int[]{20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(unsortedArray));
        insertionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
        reverseInsertionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
    
    public static void insertionSort(int array[])
    {
        // Goes through the entire unsorted array starting at position 1. 
        // Since the first element in the array is already "sorted" we use that as a 
        // basis for where the other elements in the array should be put in the sorted
        // partition. 
        for(int i = 1; i < array.length; i++)
        {
            // Stores the numerical value of the current element in a temp variable.
            int temp = array[i];
            int j;
            
            // This loop goes through the sorted left partition and compares the 
            // curent index value to see if it is grater than it. If the element in the 
            // sorted partition is greater than the element in the unsorted partiton,
            // we move the greater variable to the location of the variable we are comparing.
            // Essentially we are moving the greater element down to make room for the new element
            //  being inserted into the sorted partiiton
            
            for(j = i; j > 0 && array[j-1] > temp; j--)
            {
                // Once we found an element in the sorted partititon that is greater than the 
                // value in the unsorted partition, we push the greater element to the right
                array[j] = array[j-1];
            }
            // Once we are done with the loop, the position that the loop left off at
            // is the correct position for the unsorted element.
            array[j] = temp;
        }
    }
    
    // This function sorts the array in decreasing order
    public static void reverseInsertionSort(int[] array)
    { 
        for(int i = 1; i < array.length; i++)
        {
            int temp = array[i];
            int j;
            
            for(j = i; j > 0; j--)
            {
                if(array[j-1] < temp)
                    array[j] = array[j-1];
                
                else
                    break;
            }
            array[j] = temp;
        }
    }
    
}
