package com.arrayex;
//Linear Search

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
        int marks[] = new int[size];


        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Enter element to search");
        int x = sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == x) {
                System.out.println("Element Found");
            } else {
                System.out.println("Element not found");
            }
        }
/*
        System.out.println("Elemts are");
        for (int i =0;i<marks.length;i++)
            System.out.println(marks[i]);

 */
    }
}

