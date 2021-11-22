package module6.bebeshkon;

public class Main {
   public static void main(String[] args) {
       Shape[] arr = new Shape[]{new Circle(), new Square(), new Triangle()};
       for (int i = 0; i < arr.length; i++)

           arr[i].draw();

   }
}
class Shape {
   public void draw(){}
}

class Circle extends Shape{
    @Override
   public void draw() {
   System.out.println("Circle: \u25CF");
   }
}
class Square extends Shape{
    @Override
   public void draw(){
       System.out.println("Square: \u25FC");
   }
}
class Triangle extends Shape {
    @Override
   public void draw(){
       System.out.println("Triangel: \u25B2");
   }
}
