package ru.otus.homeworks.hw03;


import java.util.Arrays;
import java.util.Scanner;

class Questions {
    private String question;
    private int trueAnswer;

    private int[] questionAnswers;


    public String getQuestion() {
        return question;
    }

    public int getTrueAnswer() {
        return trueAnswer;
    }

    public int[] getQuestionAnswers() {
        return Arrays.copyOf(questionAnswers, questionAnswers.length);
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


        Questions[] questionsAnswers = {question1, question2, question3};


        for (int i = 0; i < 3; i++) {
            System.out.println(questionsAnswers[i].getQuestion());
            for (int n = 0; n < questionsAnswers[i].getQuestionAnswers().length; n++) {
                System.out.println(n + 1 + ". " + questionsAnswers[i].getQuestionAnswers()[n]);
            }
            System.out.print("Выберите вариант ответа: ");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == questionsAnswers[i].getTrueAnswer()) {
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