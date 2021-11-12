package nodule2.a19;

public class Solution {
   public void table(int n) {
       // выводим таблицу умножения в стандартном виде
       for (int i = 1; i < n + 1; i++) {
//           System.out.println("ni= "+n);
           for (int j = 1; j < n + 1; j++) {
//               System.out.println("nj= "+n);
//               System.out.print("i= "+i+" ");
//               System.out.print("j= "+j+" ");
               System.out.print(i * j + "\t");
           }
           System.out.println();
       }

       System.out.println();

       // выводим таблицу умножения для числа n
       for (int i = 1; i < n + 1; i++) {
           System.out.println(i + " * " + n + " = " + i * n);
       }
   }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.table(5);
    }
}

