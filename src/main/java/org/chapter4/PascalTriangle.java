package org.chapter4;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the levels of Pascal Triangle:");
        int level = input.nextInt();
        int[][] arr = new int[level][];
        for (int i=0;i<arr.length;i++) {
            arr[i] = new int[i+1];
            for (int j=0;j<arr[i].length;j++) {
                if(j==0 || j==arr[i].length-1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
