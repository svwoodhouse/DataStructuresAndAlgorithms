package selectionsort;

import java.util.Arrays;

public class SelectionSort 
{
    public static void main(String[] args) 
    {
        int unsortedArray[] = new int[]{20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(unsortedArray));
        selectionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
    
    public static void selectionSort(int array[])
    {
        
        
        for(int i = array.length-1; i > 0; i--)
        {
            int highestNum = 0;
            
            for(int j = 1; j <= i; j++)
            {
                if(array[j] > array[highestNum])
                    highestNum = j;
            }
            
            int temp = array[i];
            array[i] = array[highestNum];
            array[highestNum] = temp;
        }
    }
    
}