package com.arrayex;

import java.util.*;

public class AscSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp = 0;

        System.out.println("Enter size");

        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    arr[i] = temp;
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
