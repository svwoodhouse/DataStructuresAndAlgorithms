package bubblesort;

import java.util.Arrays;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int unsortedArray[] = new int[]{20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(unsortedArray));
        bubbleSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
    
    public static void bubbleSort(int[] array)
    {
        for(int i = 0; i < array.length-1; i++)
        {
            for(int j = 0; j < array.length - 1 - i; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
}
