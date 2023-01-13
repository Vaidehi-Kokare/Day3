package com.bridgelabz.day3;

import java.util.Arrays;

public class ElementFrequency {
    public static void countFreq(int Array1[], int n)
    {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (Array1[i] == Array1[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(Array1[i] + " " + count);
        }
    }
    public static void main(String []args)
    {
        int Array1[] = new int[]{ 1, 2, 3, 8, 9, 1, 1, 2, 5, 1, 5, 3, 2 };
        int n = Array1.length;
        countFreq(Array1, n);
    }
}

