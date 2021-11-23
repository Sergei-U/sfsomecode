package module14.Malik;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class CallCenter {
    LinkedBlockingDeque<Call.Service> services;
    public CallCenter(int workers) {
         services = new LinkedBlockingDeque<>(workers);
    }

    public class Call extends Thread {
        String callerName;

        public Call(String callerName) {
            this.callerName = callerName;
        }

        @Override
        public void run() {
            try {
                Service service = new Service();
                if (services.offer(service, 2000, TimeUnit.MILLISECONDS)) {
                    System.out.println(callerName + "'s call was answered by a specialist");
                    service.doWork();
                } else {
                    System.out.println(callerName + " hung up");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public class Service {
            public void doWork() {
                try {

                    sleep(4000);
                    System.out.println(callerName + "'s call ended");
                    services.remove(this);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void newCall(String callerName){
        new Call(callerName).start();
    }
}
