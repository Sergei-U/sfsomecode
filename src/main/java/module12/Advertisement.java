package main.java.module12;

class Advertisement extends Thread{
    static void show(){
       if (!Thread.currentThread().getName().equals("main"))
           System.out.println("The code for this excercise is:\nMULTITHREADING IS FUN");
       else
           System.out.println("It seems the launch was on the main thread...");
       
    }
}