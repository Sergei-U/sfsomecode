package chess.src;

import java.util.Scanner;

public class Main {

    public static ChessBoard buildBoard() {
        String white = "White";
        String black = "Black";
        ChessBoard board = new ChessBoard(white);

        board.board[0][0] = new Rook(white);
        board.board[0][1] = new Horse(white);
        board.board[0][2] = new Bishop(white);
        board.board[0][3] = new Queen(white);
        board.board[0][4] = new King(white);
        board.board[0][5] = new Bishop(white);
        board.board[0][6] = new Horse(white);
        board.board[0][7] = new Rook(white);
        board.board[1][0] = new Pawn(white);
        board.board[1][1] = new Pawn(white);
        board.board[1][2] = new Pawn(white);
        board.board[1][3] = new Pawn(white);
        board.board[1][4] = new Pawn(white);
        board.board[1][5] = new Pawn(white);
        board.board[1][6] = new Pawn(white);
        board.board[1][7] = new Pawn(white);

        board.board[7][0] = new Rook(black);
        board.board[7][1] = new Horse(black);
        board.board[7][2] = new Bishop(black);
        board.board[7][3] = new Queen(black);
        board.board[7][4] = new King(black);
        board.board[7][5] = new Bishop(black);
        board.board[7][6] = new Horse(black);
        board.board[7][7] = new Rook(black);
        board.board[6][0] = new Pawn(black);
        board.board[6][1] = new Pawn(black);
        board.board[6][2] = new Pawn(black);
        board.board[6][3] = new Pawn(black);
        board.board[6][4] = new Pawn(black);
        board.board[6][5] = new Pawn(black);
        board.board[6][6] = new Pawn(black);
        board.board[6][7] = new Pawn(black);
        return board;
    }

    public static void main(String[] args) {

        ChessBoard board = buildBoard();
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Чтобы проверить игру надо вводить команды:"+
                "'exit' - для выхода"+
                "'replay' - для перезапуска игры"+
                "'castling0' или 'castling7' - для рокировки по соответсвующей линии"+
                "'move 1 1 2 3' - для передвижения фигуры с позиции 1 1 на 2 3(поле это двумерный массив от 0 до 7)"+
                "Проверьте могут ли фигуры ходить друг скозь друга, корректно ли съедают друг друга, можно ли поставить шах и сделть рокировку?");
        System.out.println();
        board.printBoard();
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("exit")) break;
            else if (s.equals("replay")) {
                System.out.println("Заново");
                board = buildBoard();
                board.printBoard();
            } else {
                if (s.equals("castling0")) {
                    if (board.castling0()) {
                        System.out.println("Рокировка удалась");
                        board.printBoard();
                    } else {
                        System.out.println("Рокировка не удалась");
                    }
                } else if (s.equals("castling7")) {
                    if (board.castling7()) {
                        System.out.println("Рокировка удалась");
                        board.printBoard();
                    } else {
                        System.out.println("Рокировка не удалась");
                    }
                } else if (s.contains("move")) {
                    String[] a = s.split(" ");
                    try {
                        int line = Integer.parseInt(a[1]);
                        int column = Integer.parseInt(a[2]);
                        int toLine = Integer.parseInt(a[3]);
                        int toColumn = Integer.parseInt(a[4]);
                        if (board.moveToPosition(line, column, toLine, toColumn)) {
                            System.out.println("Успешно передвинулись");
                            board.printBoard();
                        } else System.out.println("Передвижение не удалось");
                    } catch (Exception e) {
                        System.out.println("Вы что-то ввели не так, попробуйте еще раз");
                    }

                }
            }
        }
    }
}
