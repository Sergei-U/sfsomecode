package module3;

import java.util.Scanner;

public class PhoneNumberSort {
    public static void main(String[] args) {
        Scanner scannerPN = new Scanner(System.in);
        boolean isCorrectPhoneNumber = false;
        while (!isCorrectPhoneNumber) {

            String phoneNumber = scannerPN.nextLine();
            isCorrectPhoneNumber = checkPhoneNumber(phoneNumber);
            if (!isCorrectPhoneNumber) {
                System.out.println("Неверный ввод! формат ввода должен быть:ххх ххх хх хх");
            } else {
                System.out.println(PhoneNumberRefactor(phoneNumber));
            }
        }
    }


    private static boolean checkPhoneNumber(String phoneNumber) {
        String phoneNAmount = phoneNumber.replaceAll("[^0-9]", "");

        return phoneNAmount.length() == 11;

    }

    private static String PhoneNumberRefactor(String phoneNumber) {
        String phoneNAmount = phoneNumber.replaceAll("[^0-9]", "");        
        String phoneNumberFinalView = "+7" + " " + phoneNAmount.substring(1,4) + " " + phoneNAmount.substring(4,7) + " " + phoneNAmount.substring(7, 9) + " " +phoneNAmount.substring(9);

        return phoneNumberFinalView;
    }
}