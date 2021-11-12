package nodule2.а20;

public class Solution {
   public void drawRectangle(int n, int m, String s) {
       for (int i = 0; i <= n; i++) {
           String string = "";
           if (i == 0 || i == n - 1) { // если первая или последняя строчки
               for (int j = 0; j < m; j++) {
                   string += s; // строим строку из m символов
               }
           } else {
               // иначе строим строку вида {символ s + m - 2 пробела + символ s}
               string += s;
               for (int j = 1; j < m - 1; j++) {
                   string += " ";
               }
               if (m != 1) string += s; // проверяем, что прямоугольник не 1 в ширину
           }
           System.out.println(string);
       }
   }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.drawRectangle(5,6,"a");
    }
}