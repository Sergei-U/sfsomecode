public class Hello {
    public static void main(String[] args) {
        System.out.println("hello, word");
        int[] arr = {
                15,
                27,
                3,
                344,
                17
        };
        int summ = 0;
        for (int i: arr) {
            summ += i;
        }
        System.out.println(summ / arr.length);
    }
}
