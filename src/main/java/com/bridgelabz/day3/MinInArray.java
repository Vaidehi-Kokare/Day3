package com.bridgelabz.day3;

public class MinInArray {
    public static void main(String[] args) {
        int[] Array1 = {3, 5, 42, 94, 23, 13};
        int min = Array1[0];
        for (int i=0; i<=Array1.length-1;i++) {
            if (Array1[i]<min)
                min = Array1[i];
        }
        System.out.println(min + " is the smallest element");
    }
}
