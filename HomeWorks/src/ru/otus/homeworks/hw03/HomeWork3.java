package ru.otus.homeworks.hw03;


import java.util.Scanner;

class Questions {
    public String question;
    public int trueAnswer;

    public int[] questionAnswers;

    public boolean checkAnswer() {
        System.out.println(question);
        System.out.println("Выберите вариант ответа: ");
        for (int n = 0; n < questionAnswers.length; n++) {
            System.out.println(n + 1 + ". " + questionAnswers[n]);
        }
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer == trueAnswer) {
            System.out.println("Правильно");
            return true;
        } else {
            System.out.println("Неправильно");
            return false;

        }
    }

    public Questions(String question, int trueAnswer, int[] questionAnswers) {
        this.question = question;
        this.trueAnswer = trueAnswer;
        this.questionAnswers = questionAnswers;
    }
}


public class HomeWork3 {

    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        Questions question1 = new Questions("Сколько будет 1+1?", 1, new int[]{2, 3, 4, 10, 11});
        Questions question2 = new Questions("Сколько будет 2+2?", 1, new int[]{4, 5, 6, 10});
        Questions question3 = new Questions("Сколько будет 3+3?", 2, new int[]{5, 6, 7});
        if (question1.checkAnswer()) {
            correctCount++;
        } else {
            wrongCount++;
        }
        if (question2.checkAnswer()) {
            correctCount++;
        } else {
            wrongCount++;
        }
        if (question3.checkAnswer()) {
            correctCount++;
        } else {
            wrongCount++;
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}