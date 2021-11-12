package main.java;

public class tt {
    public class Tank {
        int x, y;
        int dir;
        int fuel;

        public Tank(int x, int y, int direction, int fuel) {
            this.x = x;
            this.y = y;
            this.dir = direction;
            this.fuel = fuel;
        }

        public Tank() {
            this(0, 0, 0, 100);
        }

        public Tank(int x, int y) {
            this(x, y, 0, 100);
        }

        public Tank(int x, int y, int fuel) {
            this(x, y, 0, fuel);
        }

        public void goForward(int i) {
            if (i < 0) {
                if (i * (-1) > this.fuel) {
                    i = this.fuel * (-1);
                }
            } else {
                if (i > this.fuel) {
                    i = this.fuel;
                }
            }
            if (dir == 0) x += i;
            else if (dir == 1) y += i;
            else if (dir == 2) x -= i;
            else y -= i;
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
}
