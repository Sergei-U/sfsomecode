package module12;

public class Main {

    // Lunch the show() method from the class Advertisement
    // (it's hidden) in a new Thread
    public static void main(String[] args) {

        //v1
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Advertisement.show();
            }
        });
        thread.start();


        //v2
        new Thread(Advertisement::show).start();
    }


}   
