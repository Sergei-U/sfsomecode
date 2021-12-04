package module2.kostya0;

public class Action {
    public static int action(int x, int y, char z) {
        int resault = 0;
        switch (z) {
            case '+':
                resault = x + y;
                break;
            case '-':
                resault = x - y;
                break;
            case '*':
                resault = x * y;
                break;
            case '/':
                resault = x / y;
                break;


            default:
                System.out.println("ВВедите корректно операцию");
                break;
        }
            return resault;


    }
}