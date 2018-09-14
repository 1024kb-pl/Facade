package pl.maniaq;

import pl.maniaq.facade.ATMFacade;

import java.util.Scanner;

public class ATM {

    public static void displayMenu() {
        System.out.println("BANKOMAT");
        System.out.println("1 - sprawdź stań konta");
        System.out.println("2 - wypłać gotówkę");
        System.out.println("0 - zakończ");
    }

    public static void main(String[] args) {
        ATMFacade atm = new ATMFacade();
        Scanner scanner = new Scanner(System.in);
        String cardNumber = "1239505430239123";
        int data = -1;

        if (atm.isCardValid(cardNumber)) {
            while (data != 0) {
                data = scanner.nextInt();

                switch (data) {
                    case 1:
                        Integer balance = atm.getAccountBalance(cardNumber);
                        System.out.println("Stan konta o numerze " + cardNumber + ": " + balance + "zł.");
                        break;

                    case 2:
                        System.out.println("Podaj kwotę jaką wypłacić: ");
                        Integer amount = scanner.nextInt();
                        atm.withdrawMoney(cardNumber, amount);

                    case 0:
                        data = 0;
                        System.out.println("Dziękujemy za skorzystanie z naszych usług.");
                        break;
                }
            }
        }


    }
}
