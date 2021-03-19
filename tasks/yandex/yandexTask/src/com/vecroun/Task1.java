package com.vecroun;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n==1){
            System.out.println(1);
        }
        else {
            int first = scanner.nextInt();
            int previous = first;
            int tmpInt=0;
            for (int i = 1; i < n; ++i) {
                tmpInt = scanner.nextInt();
                if (previous>tmpInt){
                    System.out.println(-1);
                    return;
                }
                else {
                    previous=tmpInt;
                }
            }
            System.out.println(tmpInt-first);
        }
    }
}
