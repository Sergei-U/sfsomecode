package module13.aptem93;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

//        Test0 test0 = new Test0(46);
//        Test1 test1 = new Test1(46);
//        Test3 test3 = new Test3(46);
//        test0.start();
//        test1.start();
//        test3.start();
//        test0.join();
//        test1.join();
//        test3.join();
        fibNaive(46);
        fibNaive(46);
        fibNaive(46);

        long end = System.currentTimeMillis();

        System.out.println("Total time: " + (end - start) + " ms");
    }
    static long fibNaive(int n){
        if(n <= 1){
            return n;
        }else {
            return fibNaive(n - 1) + fibNaive(n - 2);
        }
    }
}



class Test0 extends Thread{
    private int fibCount;
    public Test0(int fibCount){
        this.fibCount = fibCount;
    }
    @Override
    public void run() {
        System.out.println(Test0.fibNaive(fibCount));
    }

    static long fibNaive(int n){
        if(n <= 1){
            return n;
        }else {
            return fibNaive(n - 1) + fibNaive(n - 2);
        }
    }
}



class Test1 extends Thread{
    private int fibCount;
    public Test1(int fibCount){
        this.fibCount = fibCount;
    }
    @Override
    public void run() {
        System.out.println(Test0.fibNaive(fibCount));
    }

    static long fibNaive(int n){
        if(n <= 1){
            return n;
        }else {
            return fibNaive(n - 1) + fibNaive(n - 2);
        }
    }
}




class Test3 extends Thread{
    private int fibCount;
    public Test3(int fibCount){
        this.fibCount = fibCount;
    }
    @Override
    public void run() {
        System.out.println(Test0.fibNaive(fibCount));
    }

    static long fibNaive(int n){
        if(n <= 1){
            return n;
        }else {
            return fibNaive(n - 1) + fibNaive(n - 2);
        }
    }
}


