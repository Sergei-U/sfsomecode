package module12.seabattle;

public class SeaBoardDemo {
    public static void main(String[] args) {
        SeaBoard board = new SeaBoard();
        String[][] field = board.getField();
        board.shoot(0, 0, "m");
        board.shoot(2, 0, "h");
        board.shoot(6, 9, "h");
        board.shoot(2, 1, "d");
        System.out.println();
        board.shoot(5,5,"h");
        board.shoot(6,5,"h");
        board.shoot(6,6,"d");

        for (String[] line :
                field) {
            for (String cell :
                    line) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
//    public static void boardOut(SeaBoard board) {
//        for (String[] line :
//                board.getField()) {
//            for (String cell :
//                    line) {
//                System.out.print(cell);
//            }
//            System.out.println();
//        }
//    }
}