package com.company;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/
public class EndOfFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i =1;
        while(in.hasNext()){
            System.out.println(i+" "+in.nextLine());
            i++;
        }

    }
}
