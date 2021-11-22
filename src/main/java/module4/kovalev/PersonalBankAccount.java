package module4.kovalev;

/**
 * This is a task 4.4.1 kovalyovop@yandex.ru
 * Используя конструктор и ключевое слово this создайте программу, выводящую индивидуальные
 * данные четырёх клиентов банка включая имя, баланс, год открытия счета.
 */

public class PersonalBankAccount {

    String clientName;
    double balance;
    int year;

    public PersonalBankAccount(String clientName, double balance, int year) {
        this.clientName = clientName;
        this.balance = balance;
        this.year = year;
    }
}