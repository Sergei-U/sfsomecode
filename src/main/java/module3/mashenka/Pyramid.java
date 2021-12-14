package module3.mashenka;

public class Pyramid {


    public static void main(String[] args) {

        int h = 5;

        int i, j;

        char[] arr = new char[2 * h - 1];


        for (i = h - 1, j = h - 1; i >= 0 && j <= 2 * h - 1; i--, j++) {

            arr[i] = '*';

            arr[j] = '*';

            System.out.println(arr);

        }

    }

}




