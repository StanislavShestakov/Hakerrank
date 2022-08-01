package com.company;

import java.util.*;

//https://www.hackerrank.com/challenges/java-string-compare/
public class SortArrayList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

        }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        //String[] sa = s.split("(?<=\\G.{"+k+"})");

        String sa[] = new String[s.length()+1-k];
        for (int i = 0; i < sa.length; i++) {
            sa[i] = s.substring(i,i+k);
        }
        System.out.println(Arrays.toString(sa));
        largest = sa[0];
        smallest = sa[0];
        for (int i = 1; i < sa.length; i++) {
            if(sa[i].compareTo(largest) >= 0 ){
                largest = sa[i];
            }
            if(sa[i].compareTo(smallest) < 0 ){
                smallest = sa[i];
            }
        }
        return smallest + "\n" + largest;
    }

}
