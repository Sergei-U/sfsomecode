package module14.gagarin;


public class NoSynch {
    public static void main(String[] args)
            throws InterruptedException {
        Client client = new Client(1000);
        Thread operation =
                new Operation(client, 1000);
        Thread operation1 =
                new Operation(client, 500);
        operation.start();
        operation1.start();
        operation.join();
        operation1.join();
        System.out.println(client.getBill());
    }
}

class Operation extends Thread {
    private final Client mClient;
    private int mPay;

    Operation(Client client, int pay) {
        mClient = client;
        mPay = pay;
    }

    @Override
    public void run() {
        System.out.println(this.getName() +
                ": " + mClient.getBill());
        synchronized (mClient) {
            if (mClient.getBill() - mPay >= 0) {
                try {
                    wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mClient.changeBill(mPay);
            }
        }
        System.out.println(this.getName() +
                ": " + mClient.getBill());
        System.out.println(this.getName() + " stop");
    }
}
class Client {
    private int mBill;

    Client(int bill) {
        this.mBill = bill;
    }

    int getBill() {
        return mBill;
    }

    void changeBill(int pay) {
        mBill -= pay;
    }
}
