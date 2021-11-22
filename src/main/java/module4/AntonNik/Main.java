package module4.AntonNik;

public class Main {
   public static void main(String[] args) {

       Doggo bread = new Doggo();
       bread.height = 40;
       bread.weight = 45;
       Doggo cookie = new Doggo();
       System.out.println("Bread's height is " + bread.height);
       System.out.println("Cookie's height is " + cookie.height);
       System.out.println("Bread's weight is " + bread.weight);
       System.out.println("Cookie's height is " + cookie.weight);
       bread.voice("Cookie");
       cookie.wasSup("Bread");
       bread.rnNumber1();

       }
   }
class Doggo {
   int x = 0;
   int y = 10;
   public int height = 30;
   public int weight = 25;

   public Doggo() {
   }
   //Собакам надо поздороваться
   public void voice(String name) {
       System.out.println("Woof, " + name);
   }
   public void wasSup(String question) {
       System.out.println("Hello, " + question + ", how are you?");
   }

   //Испытаем удачу на прогулке - полезет собака в лужу или нет. От 0 до 5 - нет, от 5 до 10 - полезет.
   public void rnNumber1() {
       int random_number = x + (int) (Math.random() * y);
       System.out.println(random_number); //просто посмотрим, что нарандомилось
       if (random_number < 5)
           System.out.println("It's okay");
       else
           System.out.println("Bread need to wash, go home");

   }
}


