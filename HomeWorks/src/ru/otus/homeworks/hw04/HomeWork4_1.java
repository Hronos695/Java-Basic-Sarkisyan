package ru.otus.homeworks.hw04;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class HomeWork4_1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(10, 8, 9, 7, 5, 6, 4, 2, 3, 1, -8));

        System.out.println("Изначальный массив      " + array);

        long start = System.nanoTime();
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
        long end = System.nanoTime();
        long timeInMicro = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);

        System.out.println("Отсортированный массив  " + array);
        System.out.println("Время ручной сортировки в микросекундах " + timeInMicro);

        //Сортировка коллекцией
        List<Integer> array2 = new ArrayList<>(Arrays.asList(10, 8, 9, 7, 5, 6, 4, 2, 3, 1, -8));

        long start2 = System.nanoTime();
        System.out.println("Изначальный массив      " + array2);
        Collections.sort(array2);
        System.out.println("Отсортированный массив  " + array);

        long end2 = System.nanoTime();
        long timeInMicro2 = TimeUnit.MICROSECONDS.convert(end2 - start2, TimeUnit.NANOSECONDS);
        System.out.println("Время сортировки с помощью коллекции в микросекундах " + timeInMicro2);

    }
}


