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
        System.out.println("MY TANK CAN GO ANYWHERE!");

    }

    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    public void user(){
        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.turnLeft();
        tank.goForward(50);
        tank.printPosition();
        tank.turnRight();
        tank.turnRight();
        tank.goBackward(100);
        tank.printPosition();
    }

    public void correct(){
/////////////////////////////////////////
        class Tank {

            int x, y;
            int dir;

            public void goForward(int i) {
                if (dir == 0) x += i;
                else if (dir == 1) y += i;
                else if (dir == 2) x -= i;
                else y -= i;
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
        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.turnLeft();
        tank.goForward(50);
        tank.printPosition();
        tank.turnRight();
        tank.turnRight();
        tank.goBackward(100);
        tank.printPosition();
    }
}
