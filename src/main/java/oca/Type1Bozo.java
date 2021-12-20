package oca;

public class Type1Bozo implements Bozo {
    public Type1Bozo() {
     int   type = 1;
    }

    public void jump() {
        System.out.println("jumping..." + type);
    }

    public static void main(String[] args) {
        Bozo b = new Type1Bozo();
        b.jump();

        String abc = "";
        abc.concat("abc");
        abc.concat("def");
        System.out.print("abc"+abc);
    }
}