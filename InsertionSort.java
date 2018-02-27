/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author klyme
 */
public class InsertionSort {
public static void insertionSort(int arr[])
    {
        int size = arr.length;
        for (int i=1; i<size; i++)
        {
            int current = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > current)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = current;
        }
    }
 
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }

    public static void main(String args[])
    {        
        int arr[] = {15,10,222,45,68,1,18,90,560,76};
        insertionSort(arr);
         System.out.println("Sorted array: ");
        
        int size = arr.length;
        
        for (int i=0; i<size; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
}
