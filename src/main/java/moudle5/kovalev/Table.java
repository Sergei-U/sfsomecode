package moudle5.kovalev;

public class Table {
    public static void main(String[] args) {

        int[][] table = {{10,20,30}, {40,50,60}, {70,80,90}};

        for (int a = 0; a < table.length; a++) {
            for (int b = 0; b < table[a].length; b++) {
                System.out.print(table[a][b] + " ");
            }
            System.out.println();
        }
    }
}