package module3.frontline91;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int [] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.abs(i)*1)+1;
        }
        System.out.println(Arrays.toString(mas));

        boolean flag = true;
        for (int i = 1; i < mas.length; i++) {
            if(mas[i]<=mas[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}





