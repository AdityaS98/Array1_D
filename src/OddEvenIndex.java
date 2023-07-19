package com.arrayex;

import java.util.Scanner;
public class OddEvenIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i =0;i<arr.length;i=i+2){
            System.out.println("Even Elements "+arr[i]+" at index "+i);
        }
        System.out.println("\n");
        for (int i=1;i<arr.length;i++){
            System.out.println("Odd Elements "+arr[i]+" at index "+i);

        }

    }
}
