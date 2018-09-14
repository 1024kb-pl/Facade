package pl.maniaq.service;

public class AccountService {

    public AccountService() {

    }

    public void withdraw(String cardNumber, Integer amount) {
        System.out.println("Z karty o numerze: " + cardNumber + " wypłacono: " + amount);
    }

    public void deposit(String cardNumber, Integer amount) {
        System.out.println("Na kartę o numerze: " + cardNumber + " wpłacono: " + amount);
    }


    public void balance(String cardNumber) {
        System.out.println("Stan konta o numerze " + cardNumber + ": " + 153 + "zł.");
    }
}
