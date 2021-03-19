package com.vecroun;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    final static Random random = new Random();


    public static void main(String[] args) {

        matrix();


    }

    public static void Array() {

        log("Создание списка");
        ArrayList<Integer> list = new ArrayList<>(0);

        log("Заполнение списка случайными числами");
        for (int i = 0; i < 5; ++i) {
            list.add(random.nextInt());
        }

        log("Вывод списка");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        log("Вывод списка");
        for (int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        log("удаление элемента списка");
        list.remove(list.size() - 1);

        log("Вывод списка");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        log("удаление всех элементов списка");
        list.clear();

        log("Вывод списка");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void matrix() {


        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        int ai, bi;
        int n = 10;

        for (int i = 0; i < n; ++i) {
            ai = random.nextInt(100);
            bi = random.nextInt(100);

            matrix.add(new ArrayList<Integer>(2));
            matrix.get(i).add(ai);
            matrix.get(i).add(bi);
        }
        for (int i = 0; i < matrix.size(); ++i) {
            System.out.printf("%d: %.5f\t%.5f\n", i, (double) matrix.get(i).get(0), (double) matrix.get(i).get(1));
        }
    }

    public static void log(String message) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_YELLOW = "\u001B[33m";

        System.out.println(ANSI_RED + "***");
        System.out.println(ANSI_YELLOW + message);
        System.out.println(ANSI_RED + "***" + ANSI_RESET + "\n");
    }
}

