package ru.otus.homeworks.hw02;

import java.util.Scanner;

public class HomeWork2_IntAnswer {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        Object[][][] questionsAnswers = {
                {{"Сколько будет 1+1?"}, {"2", "3", "4", "10", "11"}, {1}},
                {{"Сколько будет 2+2?"}, {"4", "5", "6", "10"}, {1}},
                {{"Сколько будет 3+3?"}, {"4", "5", "6", "10"}, {2}}
        };

        for (int i = 0; i < 3; i++) {
            System.out.println(questionsAnswers[i][0][0]);
            for (int n = 0; n < questionsAnswers[i][1].length; n++) {
                System.out.println(n + 1 + ". " + questionsAnswers[i][1][n]);
            }
            System.out.print("Выберите вариант ответа: ");
            Scanner scanner = new Scanner(System.in);
             Object answer = scanner.nextInt();
            if (answer == questionsAnswers[i][2][0]) {
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
