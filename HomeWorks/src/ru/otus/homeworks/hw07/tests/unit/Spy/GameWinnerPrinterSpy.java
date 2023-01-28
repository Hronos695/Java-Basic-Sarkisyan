package ru.otus.homeworks.hw07.tests.unit.Spy;

import ru.otus.homeworks.hw07.game.GameWinnerPrinter;
import ru.otus.homeworks.hw07.game.Player;

public class GameWinnerPrinterSpy implements GameWinnerPrinter {

    private String winnerName = "";

    public void printWinner(Player winner) {
        winnerName = winner.getName();
    }

    public String getWinnerName() {
        return winnerName;
    }
}