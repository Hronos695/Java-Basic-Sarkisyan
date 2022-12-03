package ru.otus.homeworks.hw02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork2_ChangeMassive {
    private static String[] append(String[] arr, String newElement) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add(newElement);

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] mas1 = {"test"};

        mas1 = append(mas1, "НОВОЕ ЗНАЧЕНИЕ");
        System.out.println(Arrays.toString(mas1));
    }
}