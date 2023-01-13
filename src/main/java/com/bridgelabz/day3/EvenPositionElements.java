package com.bridgelabz.day3;

public class EvenPositionElements {
    public static void main(String[] args) {
        int[] Array1 = {3, 5, 42, 94, 23, 13};
        for (int i = 0; i<Array1.length; i++) {
            if(i%2==0)
                System.out.print(Array1[i] + " ");
        }
    }
}
