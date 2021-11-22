package module4.kovalev;

/**
 * This is a task 4.4.1 kovalyovop@yandex.ru
 * Используя конструктор и ключевое слово this создайте программу, выводящую индивидуальные
 * данные четырёх клиентов банка включая имя, баланс, год открытия счета.
 */

public class Main {

    public static void main(String[] args) {

        PersonalBankAccount Account1 = new PersonalBankAccount("Ivan", 24567.25, 2005);
        PersonalBankAccount Account2 = new PersonalBankAccount("Anna", 38569.17, 2009);
        PersonalBankAccount Account3 = new PersonalBankAccount("Sergey", 10254.89, 2004);
        PersonalBankAccount Account4 = new PersonalBankAccount("Vladimir", 69475.63, 2020);

        System.out.println("Name: " + Account1.clientName + " " + "Balance: " +
                Account1.balance + " " + "Year: " + Account1.year);
        System.out.println("Name: " + Account2.clientName + " " + "Balance: " +
                Account2.balance + " " + "Year: " + Account2.year);
        System.out.println("Name: " + Account3.clientName + " " + "Balance: " +
                Account3.balance + " " + "Year: " + Account3.year);
        System.out.println("Name: " + Account4.clientName + " " + "Balance: " +
                Account4.balance + " " + "Year: " + Account4.year);
    }
}