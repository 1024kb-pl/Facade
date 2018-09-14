package pl.maniaq.service;

public class CardService {

    public CardService() {

    }

    public void isCardCorrect(String cardNumber) {
        System.out.println("Sprawdzanie czy karta o numerze " + cardNumber + " jest poprawna.");
    }

    public void isDebitCard(String cardNumber) {
        System.out.println("Sprawdzanie czy karta o numerze " + cardNumber + " jest kartą debetową.");
    }

    public void isCreditCard(String cardNumber) {
        System.out.println("Sprawdzanie czy karta o numerze " + cardNumber + " jest kartą kredytową.");
    }
}
