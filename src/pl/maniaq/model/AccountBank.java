package pl.maniaq.model;


public class AccountBank {
    private String ownerName;
    private Card card;
    private Integer balance;

    public AccountBank(String ownerName, Card card, Integer balance) {
        this.ownerName=ownerName;
        this.card=card;
        this.balance=balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Card getCard() {
        return card;
    }

    public Integer getBalance() {
        return balance;
    }
}
