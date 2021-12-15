package module4.uita;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите пароль в формате 2 буквы 4 числа:");
        Scanner inputPassword = new Scanner(System.in);
        String newPassword = inputPassword.nextLine(); // сканер для ввода пароля;
        InputPassword userPassword = new InputPassword(newPassword); // создание нового объекта;
        if(userPassword.checkPassword()) {
            userPassword.setPassword(newPassword); // инициализация сеттера;
        }
    }
}

