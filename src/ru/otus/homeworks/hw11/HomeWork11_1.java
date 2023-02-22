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

    public String getRuble(int num) {
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
    public String getDollar(int num) {
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

class Result {


    public String getResult(boolean userInput, int number) {
        Mod currency = new Mod();
        if (userInput) {
            return (number + " " + currency.getRuble(number));
        } else {
            return String.valueOf(number);
        }
    }
}


public class HomeWork11_1 {
    public static void main(String ...args) {
        System.out.println("Введите целое число от одного до миллиона");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Input check1 = new Input();
        Result result= new Result();
        boolean userInput = check1.checkInput(number);

        System.out.println(result.getResult(userInput,number));
    }
}
