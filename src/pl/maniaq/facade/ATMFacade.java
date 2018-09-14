package pl.maniaq.facade;

import pl.maniaq.service.AccountService;
import pl.maniaq.service.CardService;

public class ATMFacade {

    private AccountService accountService;
    private CardService cardService;

    public ATMFacade() {
        accountService = new AccountService();
        cardService = new CardService();
    }

    public void withdrawMoney(String cardNumber, Integer amount) {
        accountService.withdraw(cardNumber, amount);
    }

    public void isCardValid(String cardNumber) {
        cardService.isCardCorrect(cardNumber);
    }

    public void getAccountBalance(String cardNumber) {
        accountService.balance(cardNumber);
    }
}
