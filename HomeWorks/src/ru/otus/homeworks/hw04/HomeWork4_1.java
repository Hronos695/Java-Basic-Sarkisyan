package ru.otus.homeworks.hw04;

import java.util.*;

public class HomeWork4_1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(10, 8, 9, 7, 5, 6, 4, 2, 3, 1, -8));

        System.out.println("Изначальный массив      " + array.toString());


        for (int i = 0; i < array.size() - 1; i++) {
            int minNum = i;
            int min = array.get(i);
            for (int j = i + 1; j < array.size(); j++) {
                if (min > array.get(j)) {
                    min = array.get(j);
                    minNum = j;
                }
            }
            array.set(minNum, array.get(i));
            array.set(i, min);

        }

        System.out.println("Отсортированный массив  " + array);

    }
}


