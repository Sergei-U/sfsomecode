package CollectionComparator;

class NewEx extends Exception {
    NewEx(String str) {
        super(str);
    }
}

public class ClientAccounts {
    public static void main(String[] args) {
        int[] account = {149, 358, 503, 799, 905};

        String[] name = {"Mariam", "Michael", "James", "Steven", "Anna"};

        double[] balance = {10000.00, 12000.00, 5600.0, 1100.55, 989.00};
        try {
            System.out.println("Account" + " " + "Client" + " " + "Balance");

            for (int i = 0; i < 5; i++) {
                System.out.println(account[i] + " " + name[i] + " " + balance[i]);

                if (balance[i] < 1000) {
                    NewEx ex = new NewEx("There are not enough funds in your account");
                    throw ex;
                }
            }
        } catch (NewEx ex) {
            System.out.println("The exception is caught!");
        }
    }
}