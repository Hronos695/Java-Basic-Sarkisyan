package ru.otus.homeworks.hw07.tests.unit;


import ru.otus.homeworks.hw07.game.DiceImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Test2 {
    public void test2() {
        String scenario = "Тест кубика на 1-6";
        try {
            List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
            int actual1 = new DiceImpl().roll();
            int actual2 = new DiceImpl().roll();

            if (!array.contains(actual1)||!array.contains(actual2)) {
                throw new AssertionError("This code does not take limitations of the cube");
            }

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
