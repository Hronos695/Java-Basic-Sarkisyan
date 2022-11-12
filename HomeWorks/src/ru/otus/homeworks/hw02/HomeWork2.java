package ru.otus.homeworks.hw02;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        String[] questions = {"Сколько будет 1+1?", "Сколько будет 2+2?", "Сколько будет 3+3?"};
        String[][] answerOptions = {
                {"2", "3", "4"}, //варианты ответа для первого вопроса
                {"4", "5", "6"}, //варианты ответа для второго вопроса
                {"5", "6", "7"}, //варианты ответа для третьего вопроса
        };
        int[] correctAnswers = {1, 1, 2};
        for (int i = 0; i < 3; i++) {
            System.out.println(questions[i]);
            System.out.println("1. " + answerOptions[i][0]);
            System.out.println("2. " + answerOptions[i][1]);
            System.out.println("3. " + answerOptions[i][2]);
            System.out.print("Выберите вариант ответа: ");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == correctAnswers[i]) {
                System.out.println("Правильно");
                correctCount++;
            } else {
                System.out.println("Неправильно");
                wrongCount++;
            }
            System.out.println();
        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}

