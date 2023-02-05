package ru.otus.homeworks.hw07.tests.unit;

import ru.otus.homeworks.hw07.Assertions;
import ru.otus.homeworks.hw07.game.*;
import ru.otus.homeworks.hw07.tests.unit.Spy.*;



public class Test4 {
    public void test4() {
        String scenario = "Тест на ничью 2";
        int drawScore = 2;
        DiceSpy diceSpy = new DiceSpy(drawScore);
        GameWinnerPrinterSpy gameWinnerPrinterSpy = new GameWinnerPrinterSpy();
        Player firstPlayerSpy = new PlayerSpy("Игорь");
        Player secondPlayerSpy = new PlayerSpy("Вася");
        Game game1 = new Game(diceSpy, gameWinnerPrinterSpy);
        game1.playGame(firstPlayerSpy, secondPlayerSpy);
        try {
            Assertions.assertEquals((!(gameWinnerPrinterSpy.getWinnerName().equals(firstPlayerSpy.getName())) &&
                    !(gameWinnerPrinterSpy.getWinnerName().equals(secondPlayerSpy.getName()))), true);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"both players have %d - draw \" %n", scenario, drawScore);
        }
    }
}
