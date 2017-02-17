package com.company.hackerrank;

import java.util.*;


public class Array2D {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int biggestSum = Integer.MIN_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
                if (i > 1 && j > 1) {
                    int sum = arr[i][j] + arr[i][j - 1] + arr[i][j - 2]
                            + arr[i - 1][j - 1] + arr[i - 2][j]
                            + arr[i - 2][j - 1] + arr[i - 2][j - 2];
                    if (sum > biggestSum) {
                        biggestSum = sum;
                    }
                }
            }
        }
        System.out.println(biggestSum);
    }
}




