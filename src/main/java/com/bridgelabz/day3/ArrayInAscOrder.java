package com.bridgelabz.day3;
public class ArrayInAscOrder {
    public static void main(String[] args) {
        int[] Array1 = {3, 5, 42, 94, 23, 13};
        System.out.println("Element of array before sorting:");
        for (int i = 0; i< Array1.length; i++) {
            System.out.print(Array1[i] + " ");
        }
        for (int i = 0; i < Array1.length; i++) {
            for (int j = i + 1; j < Array1.length; j++) {
                if (Array1[i] > Array1[j]) {
                    int temp = Array1[i];
                    Array1[i] = Array1[j];
                    Array1[j] = temp;
                }
            }

        }
        System.out.println(" ");
        System.out.println("Element of array after sorting:");
        for (int i = 0; i< Array1.length; i++) {
            System.out.print(Array1[i] + " ");
        }


    }
}
