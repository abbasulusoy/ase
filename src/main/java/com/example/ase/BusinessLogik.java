package com.example.ase;

import java.util.Arrays;

public class BusinessLogik {

    public static int[] bubbleSort(int [] numbers){

        int tempVar;
        for (int i = 0; i < numbers.length-1; i++)
        {
            for(int j = 0; j < numbers.length-i-1; j++)
            {
                if(numbers[j] > numbers[j + 1])
                {
                    tempVar = numbers [j + 1];
                    numbers [j + 1]= numbers [j];
                    numbers [j] = tempVar;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 3, 2, 1};
        /**
        for (int i: bubbleSort(numbers)) {
            System.out.println("bubbleSort" + i);
        }
    **/
        for (int i: selectionSort(numbers)) {
            System.out.println("SelectionSort" + i);
        }


    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // swapping
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }

}
