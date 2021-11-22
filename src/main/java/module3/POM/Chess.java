package module3.POM;

public class Chess {
   public static void main(String[] args) {
       String[][] chessBoard = new String[8][8];
       for (int i = 0; i < chessBoard.length; i++) {
           for (int j = 0; j < chessBoard[0].length; j++) {
               if ((i + j) % 2 == 0) chessBoard[i][j] = "W" + boardCoord(j, i);
               else chessBoard[i][j] = "B" + boardCoord(j, i);
           }
       }
       for (int i = 0; i < chessBoard.length; i++) {
           for (int j = 0; j < chessBoard[0].length; j++) {
               System.out.print(" " + chessBoard[i][j] + " ");
           }
           System.out.println();
       }
   }

   public static String boardCoord(int a, int b) {
       String letters = "abcdefgh";
       String numbers = "87654321";
       if ((a > 7) || (b > 7)) return null;
       else return (Character.toString(letters.charAt(a)) + numbers.charAt(b));
   }
}

