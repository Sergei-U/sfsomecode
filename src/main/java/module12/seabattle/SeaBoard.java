package module12.seabattle;

import java.util.Arrays;

public class SeaBoard {
    private final int FIELD_SIZE = 11;
    private final String[][] field = new String[FIELD_SIZE][FIELD_SIZE];

    public SeaBoard() {
        for (String[] line : field) {
            Arrays.fill(line, ".");
        }
    }

    public String[][] getField() {
        return field;
    }

    public void shoot(int line, int column, String issue) { //m — miss/промах, h — hit/попадание и d — destroy/уничтожени
        switch (issue) {
            case "m" : field[line][column] = "#";
            case "h" : field[line][column] = "x";
            case "d" : {
                field[line][column] = "x";
                setMissAroundShip(line, column, "LU");
            }
        }
    }

    public String check(int line, int column) {
        return field[line][column];
    }

    private void setMissAroundShip(int line, int column, String preDirection) {
        if (line > 0) {
            if (column > 0) step(line, column, "LU");
            if (!preDirection.equals("D")) step(line, column, "U");
            if (column < FIELD_SIZE - 1) step(line, column, "RU");
        }

        if ((column > 0) && !preDirection.equals("R")) step(line, column, "L");
        if ((column < FIELD_SIZE - 1) && !preDirection.equals("L")) step(line, column, "R");

        if (line < FIELD_SIZE - 1) {
            if (column > 0) step(line, column, "LD");
            if (!preDirection.equals("U")) step(line, column, "D");
            if (column < FIELD_SIZE - 1) step(line, column, "RD");
        }
    }

    private void step(int line, int column, String direction) {
        boolean diagonal = false;
        switch (direction) {
            case "LU" : {
                line--;
                column--;
                diagonal = true;
            }
            case "U" : line--;
            case "RU" : {
                line--;
                column++;
                diagonal = true;
            }
            case "L" : column--;
            case "R" : column++;
            case "LD" : {
                line++;
                column--;
                diagonal = true;
            }
            case "D" : line++;
            case "RD" : {
                line++;
                column++;
                diagonal = true;
            }
        }
        if (field[line][column].equals("x")) {
            if (!diagonal) setMissAroundShip(line, column, direction);
        } else {
            field[line][column] = "#";
        }
    }
}