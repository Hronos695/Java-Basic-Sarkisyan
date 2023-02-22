package ru.otus.homeworks.hw11;

import java.util.Scanner;

interface Currency {
    default String getCurrency(int num, String[] currency) {
        var secondFromEnd = num % 100 / 10;
        if (secondFromEnd == 1) {
            return currency[0];
        }

        return switch (num % 10) {
            case 1 -> currency[1];
            case 2, 3, 4 -> currency[2];
            default -> currency[0];
        };
    }
}

    class Rubles implements Currency {
    }

    class Dollars implements Currency {
    }

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

    public class HomeWork11_2 {
        public static void main(String[] args) {
            System.out.println("Введите целое число от одного до миллиона");
            String[] rubValue = {"рублей", "рубль", "рубля"};
            String[] dollarValue = {"долларов", "доллар", "доллара"};
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            Input check1 = new Input();

            Rubles rubles = new Rubles();
            Dollars dollars = new Dollars();

            boolean userInput = check1.checkInput(number);

            if (userInput) {
                System.out.println(number + " " + rubles.getCurrency(number, rubValue));
                System.out.println(number + " " + dollars.getCurrency(number, dollarValue));
            } else {
                System.out.print(number);
            }
        }
    }

