package ru.otus.homeworks.hw11;

import java.util.Scanner;

class Input {

    public boolean checkInput(int number) {
        if (0 < number && number < 1000000) {
            return true;
        } else {
            System.out.println("Введено неверное число");
            return false;
        }
    }
}

class Mod {

    //public boolean addCurrency(int number) {
    public String GetRuble(int num) {
        var secondFromEnd = num % 100 / 10;
        if (secondFromEnd == 1) {
            return "рублей";
        }

        return switch (num % 10) {
            case 1 -> "рубль";
            case 2, 3, 4 -> "рубля";
            default -> "рублей";
        };
    }

    //Для добавления любой новой валюты достаточно создать новый метод
    public String GetDollar(int num) {
        var secondFromEnd = num % 100 / 10;
        if (secondFromEnd == 1) {
            return "долларов";
        }

        return switch (num % 10) {
            case 1 -> "доллар";
            case 2, 3, 4 -> "доллара";
            default -> "долларов";
        };
    }

}


public class HomeWork11_1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число от одного до миллиона");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Input check1 = new Input();
        Mod rubles = new Mod();

        boolean userInput = check1.checkInput(number);

        if (userInput) {
            System.out.println(number + " " + rubles.GetRuble(number));
            System.out.println(number + " " + rubles.GetDollar(number));// Добавление новой валюты
        } else {
            System.out.print(number);
        }

    }
}
