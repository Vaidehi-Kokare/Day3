package com.bridgelabz.day3;

public class ReversingAnArray {

    public static void main(String[] args) {
        int[] Array1 = {3, 5, 42, 94, 23, 13};
        int[] Array2 = new int[6];
        System.out.println("Array before reversing ");
        for (int i = 0; i< Array1.length; i++) {
            System.out.print(Array1[i] + " ");
        }
        int n = Array1.length -1;
        for (int i=0; i<=Array2.length-1;i++) {
            Array2[i] = Array1[n];
            n--;
        }
        System.out.println(" ");
        System.out.println("Array after reversing ");
        for (int i = 0; i< Array2.length; i++) {
            System.out.print(Array2[i] + " ");
        }
    }
}
