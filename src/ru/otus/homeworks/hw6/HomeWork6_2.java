package ru.otus.homeworks.hw06;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class GuessNumber {

    CompareNumber compare;

    GuessNumber(CompareNumber compare) {
        this.compare = compare;
    }
    public void guess(int userNumber) {

        try {
            compare.tryResult(userNumber);
            System.out.println("Вы угадали");
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException(e.getMessage());
        }

    }
}

class CompareNumber {
    private final int userNumber;
    private boolean isCorrect;

    CompareNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public void tryResult(int secretNumber) {
        if (secretNumber == userNumber) {
            isCorrect = true;
        } else {
            throw new ArrayIndexOutOfBoundsException("Загаданное число " + secretNumber + ",а вы назвали " + userNumber);
        }
    }
}


public class HomeWork6_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Угадайте значение от 0 до 3");
        String separator = File.separator;
        String pathFile = separator + "Users" + separator + "Artem" + separator + "Desktop" + separator + "123.txt";
        File file = new File(pathFile);
        //  try(Scanner sc = new Scanner(System.in)){ // вывод из консоли
        try (Scanner sc = new Scanner(file)) {        // вывод из файла
            GuessNumber c = new GuessNumber(new CompareNumber(sc.nextInt()));
            int secretNumber = new Random().nextInt(4);
            c.guess(secretNumber);
        }
    }
}
