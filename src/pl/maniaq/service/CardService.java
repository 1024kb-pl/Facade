package pl.maniaq.service;

public class CardService {

    public CardService() {

    }

    public void isCardCorrect(String cardNumber) {
        System.out.println("Card with number: " + cardNumber + " is correct.");
    }

    public void isDebitCard(String cardNumber) {
        System.out.println("Card with number: " + cardNumber + " is debit card.");
    }

    public void isCreditCard(String cardNumber) {
        System.out.println("Card with number: " + cardNumber + " is credit card.");
    }
}
