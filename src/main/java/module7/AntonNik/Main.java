package module7.AntonNik;

public class Main {
   public static void main(String[] args) {
       Games games = new Games();
       games.platform();
   }
}



class Games {
   Object[] objects;

   public Games() {

       objects = new Object[3];

       objects[0] = new DarkSouls();
       objects[1] = new Bloodborne();
       objects[2] = new TheLegendOfZelda();
   }

   public void print(){
       for (Object a : objects){
           System.out.println(a);
       }
   }

   public void platform(){
       for (Object a : objects){
           if (a instanceof Platform)
               ((Platform)a).platform();
       }
   }
}



abstract class FavGames {
   public void print(){
       System.out.println(this);
   }

   @Override
   public String toString(){
       return "It's a favourite game";
   }
}



class DarkSouls extends FavGames {

   public String toString() {
       return "Multiplatform";
   }

   @Override
   public void print() {
       System.out.println(this);
   }
}



class Bloodborne extends FavGames implements Platform{
   @Override
   public void platform() {
       System.out.println("PS4");
   }

   @Override
   public void print() {
       System.out.println(this);
   }
}



class TheLegendOfZelda extends FavGames implements Platform{
   @Override
   public void platform() {
       System.out.println("NintendoSwitch");
   }

   @Override
   public void print() {
       System.out.println(this);
   }
}



interface Platform {
   public void platform();
}

