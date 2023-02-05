package ru.otus.homeworks.hw07.game;
import java.util.Random;

public class DiceImpl implements Dice {
    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        //return 1;
        return new Random().nextInt();
    }
}
