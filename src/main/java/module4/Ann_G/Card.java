package module4.Ann_G;

public class Card {
    private int balance;
    private String cardHolder;
    private long cardNumber; // 16 numbers

    /* constructor */
    public Card(int balance, String cardHolder, long cardNumber) {
        this.balance = balance;
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    /* getters */
    public String getCardHolder() {
        return cardHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int sum) {
        if (balance == 0 || balance - sum < 0) {
            System.out.println("Try another amount");
        } else {
            balance -= sum;
            System.out.println("Amount " + sum + " rub withdrawn");
        }
    }

    public void deposit(int sum) {
        balance += sum;
        System.out.println(sum + " rub deposited");
    }

    public void hashCardNumber() {
        String number = String.valueOf(cardNumber);
        StringBuilder numberStr = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (i > 0 && i % 4 == 0) {
                numberStr.append(" " + number.charAt(i));
            } else {
                numberStr.append(number.charAt(i));
            }
        }
        number = numberStr.toString();
        number = number.substring(0, number.length() - 4).replaceAll("[0-9]", "X") + number.substring(number.length() - 4);
        System.out.println("Hashed card number " + number);
    }
}