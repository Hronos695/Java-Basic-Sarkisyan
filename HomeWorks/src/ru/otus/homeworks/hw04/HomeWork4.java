package ru.otus.homeworks.hw04;

import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] array = {10, 8, 9, 7, 5, 6, 4, 2, 3, 1, -8};
        System.out.println("Изначальный массив      " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            int minNum = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minNum = j;
                }
            }
            array[minNum] = array[i];
            array[i] = min;
        }
        System.out.println("Отсортированный массив  " + Arrays.toString(array));
    }
}


