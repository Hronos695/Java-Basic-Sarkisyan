package ru.otus.homeworks.hw02;

import java.util.Arrays;


public class HomeWork2_ChangeMassive {

    public static void main(String[] args) {
        String[] mas1 = {"test"};
        mas1 = Arrays.copyOf(mas1, mas1.length + 1);
        mas1[1] = "НОВОЕ ЗНАЧЕНИЕ";
        System.out.println(Arrays.toString(mas1));
    }
}