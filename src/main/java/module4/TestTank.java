package module4;

import static org.junit.Assert.*;
import org.junit.Test.*;
import org.junit.*;

import org.junit.After; 
import org.junit.Before; 

import java.io.*;

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
       
       assertEquals(userOutput, correctOutput);
       
       restoreStreams();
       
       System.out.println("\nThe code for this exercise is:");
       System.out.println("I'VE GOT A TANK! REALLY!");
       
    }
    
    public void restoreStreams() {
       System.setOut(originalOut);
       System.setErr(originalErr);
    }
    
    public void user(){
        Tank tank = new Tank();
        tank.goForward(-10);
        tank.printPosition();
        tank.printPosition();
        tank.goForward(50);
        tank.goForward(20);
        tank.printPosition();
        tank.goBackward(100);
        tank.printPosition();
    }
    
    public void correct(){
/////////////////////////////////////////
class Tank {

	int x;

	public void goForward(int i) {
		x += i;
		
	}

	public void printPosition() {
		System.out.println("The Tank is at " + x +" now.");
	}


	public void goBackward(int i) {
        goForward(-i);
	}
}
//////////////////////////////////////////////////////
        Tank tank = new Tank();
        tank.goForward(-10);
        tank.printPosition();
        tank.printPosition();
        tank.goForward(50);
        tank.goForward(20);
        tank.printPosition();
        tank.goBackward(100);
        tank.printPosition();
    }
    

}
