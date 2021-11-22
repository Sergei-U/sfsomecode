package module6.machikhin;

//public class Main {
//   public static void main(String[] args) {
//       Rio rio  = new Rio();
//       rio.price();
//       rio.getP("167 kW");
//   }
//}
//
//
////Модификатор доступа
//class Kia {
//
//   //Модификатор доступа
//    boolean petrol;
//   //Модификатор доступа
//    String fill;
//
//   //Модификатор доступа
//    Kia(){
//       System.out.println("Special offer Rio!");
//   }
//
//   public Kia(boolean combustible, String fuel){
//       this.petrol = combustible;
//       this.fill = fuel;
//   }
//
//   public void price(){
//   }
//
//   public boolean isPetrol() {
//       return petrol;
//   }
//
//   public String getFill() {
//       return fill;
//   }
//}
//
//
//class Rio extends Kia{
//  /* Добавить гетер
//Добавить сетер */
//   private int P;
//
//   public void price(){
//      ("Starting 13 165 $");
//   }
//}


//Ответ для самопроверки:

public class Main {
   public static void main(String[] args) {
       Rio rio  = new Rio();
       rio.price();
       rio.getP("167 kW");
   }
}

class Kia {

   private boolean petrol;
   private String fill;

   public Kia(){
       System.out.println("Special offer Rio!");
   }

   public Kia(boolean combustible, String fuel){
       this.petrol = combustible;
       this.fill = fuel;
   }

   public void price(){
   }

   public boolean isPetrol() {
       return petrol;
   }

   public String getFill() {
       return fill;
   }
}

class Rio extends Kia{

   public int getP(String s) {
       return P;
   }

   public void setP(int p) {
       P = p;
   }

   private int P;

   public void price(){
       System.out.println("Starting 13 165 $");
   }
}
