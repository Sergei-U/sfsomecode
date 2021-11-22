package module2.yurkov;

public class Loader3 {
    public static void main(String[] args) {
        int sum = 10;
        for (int i = 10; i < 100; i = i + 10) {
            sum += i;
        }
        System.out.println(sum);
    }
}