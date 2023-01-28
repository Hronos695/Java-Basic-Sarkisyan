package ru.otus.homeworks.hw07.tests.unit;

import ru.otus.homeworks.hw07.game.Dice;

public class Draw implements Dice {

    @Override
    public int roll() {

        return 3;
    }
}