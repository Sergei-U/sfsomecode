package module4.andru;

public class NewCar {
   private String model;
   private int year;
   private String color;
   public static int countCar = 0;

   NewCar(String model, int year, String color) {
       this.model = model;
       this.year = year;
       this.color = color;
       countCar++;

   }

   NewCar(String model, int year) {
       this(model,year,"White");
   }

   NewCar(String model) {
       this(model, 2021,"White");
   }

   public void setYear(int year) {
       this.year = year;
   }

   public void setColor(String color) {
       this.color = color;
   }


    public static void main(String[] args) {

        NewCar newCar = new NewCar("BMW",2019, "red");
        NewCar newCar1 = new NewCar("BMW");
        newCar1.setYear(2020);
        NewCar newCar2 = new NewCar("BMW",2019);
        newCar2.setColor("blue");

        System.out.println("Было создано " + newCar.countCar + " машины");

    }

}

