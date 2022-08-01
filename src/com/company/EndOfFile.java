package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/
public class EndOfFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> lines = new ArrayList<String>();
        lines.add(in.nextLine());
        lines.add(in.nextLine());
        lines.add(in.nextLine());
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(i+1 + " " +lines.get(i));
        }

    }
}
