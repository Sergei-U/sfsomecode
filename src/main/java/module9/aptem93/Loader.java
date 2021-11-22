package module9.aptem93;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Loader {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

        System.out.println("Сейчас " + dateFormat.format(calendar.getTime()));
        long m = System.currentTimeMillis();
        Loader loader = new Loader();
        System.out.println(loader.fibonacci(30));
        System.out.println((double) (System.currentTimeMillis() - m));
        

    }

    public int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

}

