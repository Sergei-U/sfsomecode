package nodule2;

public class Main3 {
    public static void main(String[] args) {
        int value = addvalue(3, 4);
        int result = addvalue(value, 10);
        System.out.println(result);
    }
    public static int addvalue(int x, int y) {
        int result = x + y;
        return result;
    }
}