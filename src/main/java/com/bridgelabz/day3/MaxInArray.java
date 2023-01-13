package com.bridgelabz.day3;

public class MaxInArray {
    public static void main(String[] args) {
        int[] Array1 = {3, 5, 42, 94, 23, 13};
        int max = Array1[0];
        for (int i=0; i<=Array1.length-1;i++) {
            if (Array1[i]>max)
                max = Array1[i];
        }
        System.out.println(max + " is the largest element");
    }
}
