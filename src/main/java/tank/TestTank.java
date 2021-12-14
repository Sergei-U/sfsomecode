package tank;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestTank {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void test() {

        // Get user output
        ByteArrayOutputStream outUser = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outUser));
        user();
        String userOutput = outUser.toString();

        // Get correct output
        ByteArrayOutputStream outCorrect = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outCorrect));
        correct();
        String correctOutput = outCorrect.toString();

        assertEquals(correctOutput, userOutput);

        restoreStreams();

        System.out.println("\nThe code for this exercise is:");
        System.out.println("THIS IS COOL!");

    }

    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    public void user(){
        Tank justTank = new Tank();
        Tank anywareTank = new Tank(20, -10);
        Tank customTank = new Tank(20, 30, 150);
        justTank.goBackward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.goBackward(201);
        customTank.printPosition();
    }

    public void correct(){
/////////////////////////////////////////

        class Tank {

            int x, y;
            int dir;
            int fuel;

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
                System.out.println("The Tank is at " + x +", " + y + " now.");
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
//////////////////////////////////////////////////////
        Tank justTank = new Tank();
        Tank anywareTank = new Tank(20, -10);
        Tank customTank = new Tank(20, 30, 150);
        justTank.goBackward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.goBackward(201);
        customTank.printPosition();    }
}
