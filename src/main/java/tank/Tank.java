package tank;

class Tank {

    private int x;
    private int y;
    private int dir;
    private int fuel;

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public void goForward(int i) {
        if (i < 0 && -i > -fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir % 2 == 0) x += i;
        else y += i;
        fuel -= Math.abs(i);
    }


    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}
//package tank;
//
//public class Tank {
//    int positionX;
//    int positionY;
//    int posXY;
//
//    public Tank() {
//        this.positionX = 0;
//        this.positionY = 0;
//        this.posXY = 0; // четыре позиции, при 0 смотрит вдоль оси X, при 1 смотрит вдоль оси Y,
//        // при 2 смотрит обратно направлению оси X, при 3 смотрит обратно направлению оси Y
//        // Ось Y направлена вниз (по задаанию)
//    }
//
//    public Tank(int positionX, int positionY, int posX) {
//        this.positionX = positionX;
//        this.positionY = positionY;
//        this.posXY = posX % 4;
//    }
//
//    public Tank(int positionX, int positionY) {
//        this.positionX = positionX;
//        this.positionY = positionY;
//        this.posXY = 0;
//    }
//
//
//    void goForward(int metre) {
//        switch (posXY) {
//            case 0: {
//                positionX += metre;
//                break;
//            }
//            case 1: {
//                positionY += metre;
//                break;
//            }
//            case 2: {
//                positionX -= metre;
//                break;
//            }
//            case 3: {
//                positionY -= metre;
//                break;
//            }
//            default: {
//                System.out.println("AAAAAAAAAAA");
//                break;
//            }
//        }
//    }
//
//    void goBackward(int metre) {
//        goForward(-metre);
//    }
//
//    void printPosition() {
//        System.out.println("The Tank is at " + positionX + ", " + positionY + " now.");
//    }
//
//    void turnRight() {
//        //       posXY = (posXY + 1) % 4;
//        posXY++;
//        if (posXY == 4)
//            posXY = 0;
//    }
//
//    public void turnLeft() {
//        posXY--;
//        if (posXY == -1)
//            posXY = 3;
//    }
//}