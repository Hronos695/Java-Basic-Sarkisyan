package ru.otus.homeworks.hw07.tests.unit;


import ru.otus.homeworks.hw07.game.Dice;
import ru.otus.homeworks.hw07.game.*;
import ru.otus.homeworks.hw07.Assertions;


public class Test3 {
    private Dice testDice1 = new TestDice1();
    private TestGameWinnerConsolePrinter winnerPrinter = new TestGameWinnerConsolePrinter();
    String player1 = "First";
    String player2 = "Second";


    public void test3() {
        String scenario = "Тест на ничью 1";

        try {
            Game testGame = new Game(testDice1, winnerPrinter );
            testGame.playGame(new Player(player1), new Player(player2));
            Assertions.assertNotEquals(winnerPrinter.getTestWinnerName(), player1);
            Assertions.assertNotEquals(winnerPrinter.getTestWinnerName(), player2);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());

        }
    }
}
