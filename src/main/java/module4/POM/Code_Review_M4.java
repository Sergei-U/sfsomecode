package module4.POM;

import java.util.Scanner;

class Code_Review_M4 {
//Проверка формата Email и правил создания пароля
	public static void main(String[] args) {
    	String email = null;
    	String password = null;
    	Boolean password_valid = false;
    	Boolean email_valid = false;

    	Scanner input = new Scanner(System.in);
        do {
        	System.out.println("Enter your email: ");
        	email = input.nextLine();

        	System.out.println("Enter your passsword: ");
        	password = input.nextLine();
        	//проверяем наличие слов и цифр перед '@' и между '@' и '.'
        	// после '.' должны быть 2 или 3 цифры
        	if (email.matches("[\\w]+@[\\w]+\\.[a-zA-Z]{2,3}"))
            	email_valid = true;
        	else
            	email_valid = false;
        	// проверка правил создания пароля
        	// проверяем наличие специальных символов
        	if ((password.matches(".*[^\\w\\s].*")) &&
                	// проверяем наличие букв
                	(password.matches(".*[a-zA-Z].*")) &&
                	// проверяем наличие цифр
                	(password.matches(".*[0-9].*")) &&
                	// проверка длины пароля
                	(password.length() >= 8))
            	password_valid = true;
        	else
            	password_valid = false;
        	if (password_valid && email_valid)
            	System.out.println(" Welcome User!!");
        	else {
            	if (!email_valid)
                	System.out.println(" Re-enter your email: ");
            	if (!password_valid)
                	System.out.println(" Re-enter your password: ");
        	}
    	} while (!email_valid || !password_valid);
	}
}
