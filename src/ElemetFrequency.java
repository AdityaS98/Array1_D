package com.arrayex;
// Java Program to find the frequency of each element in the array

import java.util.Scanner;

public class ElemetFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];


        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 0;
            if(x==-1)continue;
            //Traversing along elements
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == x) {
                    count++;

                    arr[j] = -1;

                }
            }
            System.out.println("Frequency of " + x + " is " + count);
        }


    }
}
