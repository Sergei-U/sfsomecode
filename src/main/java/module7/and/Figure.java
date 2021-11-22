package module7.and;

public abstract  class Figure {
   private float x;
   private float y;

   Figure(float x, float y){

       this.x=x;
       this.y=y;
   }
   public abstract float getPerimeter();

   public abstract float getArea();
}
class Main {
   public static void main(String[] args) {
       Rectangle obj = new Rectangle(4,10,15,25);
       System.out.println(obj.getPerimeter());
       System.out.println(obj.getArea());
   }
}


class Rectangle extends Figure
{
   private float width;
   private float height;

   Rectangle(float x, float y, float width, float height){

       super(x,y);
       this.width = width;
       this.height = height;
   }

   public float getPerimeter(){

       return width * 2 + height * 2;
   }

   public float getArea(){

       return width * height;
   }
}

