package com.bridgelabz.day3;
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] Array1 = {3, 5, 42, 94, 23, 13};
        for (int i = 0; i < Array1.length; i++) {
            for (int j = i + 1; j < Array1.length; j++) {
                if (Array1[i] < Array1[j]) {
                    int temp = Array1[i];
                    Array1[i] = Array1[j];
                    Array1[j] = temp;
                }
            }

        }
        System.out.println(Array1[1]);
    }
}
