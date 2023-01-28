package ru.otus.homeworks.hw07.tests.unit;

import ru.otus.homeworks.hw07.game.DiceImpl;
import ru.otus.homeworks.hw07.Assertions;


public class Test1 {
    public void test1() {
        String scenario = "Тест кубика на случайность";
        try {
            int actual1 = new DiceImpl().roll();
            int actual2 = new DiceImpl().roll();
            Assertions.assertNotEquals(actual1, actual2);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
