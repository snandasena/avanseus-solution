package com.avanseus.sample;

import java.util.Arrays;

public class Solution
{
    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * Simple sorting algo with big(O) of n^2 time and constant space
     *
     * @param arr: Unsorted int array
     */
    public static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[i] < arr[j]) // Ascending order
                {
                    swap(arr, i, j);
                }
            }
        }
    }

    /**
     * Simple array duplication algo with Big(O) of n time and Gig(O) of n space
     *
     * @param arr: Sorted array
     * @return : Non duplication sorted array
     */
    public static int[] removeDuplicatesSortedArray(int[] arr)
    {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int idx = 1;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i - 1] != arr[i])
            {
                temp[idx++] = arr[i];
            }
        }
        return Arrays.copyOf(temp, idx);
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 3, 2, 4, 5, 4, 9, 2, 3, 5, 6, 8, 2, 12};

        // Sort the array
        bubbleSort(arr);
        System.out.println("Printing sorted array");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println("\n\nAfter duplications removal");
        arr = removeDuplicatesSortedArray(arr);
        for (int i : arr)
        {
            System.out.print(i + " ");
        }

    }
}
