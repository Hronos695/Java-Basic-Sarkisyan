package ru.otus.homeworks.hw05;

import java.util.*;

class Client {
    private String clientName;
    private int clientAge;

    public Client(String clientName, int clientAge) {
        this.setClientName(clientName);
        this.setClientAge(clientAge);

    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientAge() {
        return clientAge;
    }

    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientAge == client.clientAge && Objects.equals(clientName, client.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientAge);
    }
}

class Account {
    private int accountNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}

public class HomeWork5_1 {


    public static void main(String[] args) throws InterruptedException {

        //Добавляем клиентов и счета
        Client client1 = new Client("Артем", 20);
        Client client2 = new Client("Коля", 30);
        Client client3 = new Client("Игорь", 40);
        Account acc1 = new Account(1);
        Account acc2 = new Account(2);
        Account acc3 = new Account(3);
        Account acc4 = new Account(4);
        Account acc5 = new Account(5);
        Account acc6 = new Account(6);
        Account acc7 = new Account(7);
        Account acc8 = new Account(8);
        //Добавляем счета клиентам
        ArrayList<Account> clientAccounts1 = new ArrayList<>();
        ArrayList<Account> clientAccounts2 = new ArrayList<>();
        ArrayList<Account> clientAccounts3 = new ArrayList<>();
        clientAccounts1.add(acc1);
        clientAccounts1.add(acc2);
        clientAccounts2.add(acc3);
        clientAccounts2.add(acc4);
        clientAccounts2.add(acc5);
        clientAccounts3.add(acc6);
        clientAccounts3.add(acc7);
        clientAccounts3.add(acc8);
        HashMap<Client, ArrayList<Account>> bank = new HashMap<>();
        bank.put(client1, clientAccounts1);
        bank.put(client2, clientAccounts2);
        bank.put(client3, clientAccounts3);

        //Вывод клиента по счёту
        System.out.println(findClient(bank, new Account(5)).getClientName());

        //Вывод счетов клиента
        for (Account account : findAccounts(bank, new Client("Игорь", 40))) {
            System.out.println(account.getAccountNumber());
        }

    }

    public static Client findClient(HashMap<Client, ArrayList<Account>> bank, Account accountNumber) {

        for (Map.Entry<Client, ArrayList<Account>> clientAccounts : bank.entrySet()) {
            for (Account account : clientAccounts.getValue()) {
                if (account.equals(accountNumber)) {
                    return clientAccounts.getKey();
                }
            }
        }
        return null;
    }

    public static ArrayList<Account> findAccounts(HashMap<Client, ArrayList<Account>> bank, Client clientName) {
        return bank.get(clientName);

    }
}
