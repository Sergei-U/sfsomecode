package nodule2.week2;

import java.util.Scanner;

public class Loader2_7_6 {

    public static final String RED = "red";
    public static final String YELLOW = "yellow";
    public static final String GREEN = "green";

    public static void main(String[] args) {
        String y = "yellow";
        Scanner scanner = new Scanner(System.in);
        String signalForCar = scanner.nextLine().toLowerCase();

        switch (signalForCar){
            case RED:
                System.out.println("остановиться");
                break;
            case YELLOW:
                System.out.println("подождать");
                break;
            case GREEN:
                System.out.println("ехать");
                break;
        }
    }
}