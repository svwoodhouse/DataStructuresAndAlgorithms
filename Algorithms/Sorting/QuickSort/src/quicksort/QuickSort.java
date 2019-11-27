package quicksort;

import java.util.Arrays;

public class QuickSort 
{
    public static void main(String[] args) 
    {
        int unsortedArray[] = new int[]{20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(unsortedArray));
        quickSort(unsortedArray, unsortedArray.length/2);
    }
    
    public static void quickSort(int[] array, int pivot)
    {
        
    }
}
