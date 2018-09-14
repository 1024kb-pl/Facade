package pl.maniaq.model;

public class Card {
    private Integer cardNumber;
    private boolean isCredit;

    public Card(Integer cardNumber, boolean isCredit) {
        this.cardNumber = cardNumber;
        this.isCredit = isCredit;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public boolean isCredit() {
        return isCredit;
    }
}
