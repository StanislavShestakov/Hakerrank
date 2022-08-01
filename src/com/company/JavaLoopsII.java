package com.company;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-loops/problem
public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 1; j < n+1; j++) {
                int sum = a + b*1;
                for (int k = 1; k < j; k++) {
                    sum += b * Math.pow(2,k);
                }
                System.out.print(sum + " ");
            }
            System.out.println();

        }
        in.close();
    }
}
