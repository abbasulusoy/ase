package com.example.ase;

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
        int[] numbers = { 5, 8, 14, 1, 5678 };
        for (int i: bubbleSort(numbers)) {
            System.out.println("sortedList" + i);
        }
    }
}
