package ru.otus.homeworks.hw07.tests.unit;

import ru.otus.homeworks.hw07.Assertions;
import ru.otus.homeworks.hw07.game.*;
import ru.otus.homeworks.hw07.tests.unit.Spy.*;

public class Test5 {
    public void test5() {
        String scenario = "Тест на возможность победы первым игроком";
        int firstPlayerDice = 2;
        int secondPlayerDice = 1;
        Dice diceSpy = new DiceSpy(firstPlayerDice, secondPlayerDice);
        GameWinnerPrinterSpy gameWinnerPrinterSpy = new GameWinnerPrinterSpy();
        Player firstPlayerSpy = new PlayerSpy("Игорь");
        Player secondPlayerSpy = new PlayerSpy("Вася");
        Game game = new Game(diceSpy, gameWinnerPrinterSpy);
        game.playGame(firstPlayerSpy, secondPlayerSpy);

        try {
            Assertions.assertEquals((gameWinnerPrinterSpy.getWinnerName().equals(firstPlayerSpy.getName())), true);
            System.out.printf("%s passed\n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"another player won\" %n", scenario);
        }
    }
}
