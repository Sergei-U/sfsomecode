package module4.dz2;

public class Auto {
    int mileage;
    double price;
    int condition;
    int year;
    String brand;

    public Auto() {
        this(0, 10000, 2010, "just car");
    }

    public Auto(int mil, double pr, int year, String br) {
        this.mileage = mil;
        this.price = pr;
        this.year = year;
        checkCondition();
        this.brand = br;
    }

    private void checkCondition() {
        if (this.mileage < 20000) this.condition = 0;
        else if (this.mileage < 50000) {
            this.condition = 1;
            this.price = price * 0.95;
        } else {
            this.condition = 2;
            this.price = price * 0.80;
        }
    }

    public void goTestdrive(int i) {
        mileage += i;
        checkCondition();
        System.out.println("The " + brand + "car got testdrive!");
    }

    public void printInfo() {
        System.out.println("The " + brand + " car configuration:");
        System.out.println(" Mileage: " + mileage);
        System.out.println(" Price: " + price);
        if (condition == 0) {
            System.out.println(" Condition: New");
        } else if (condition == 1) {
            System.out.println(" Condition: Used");
        } else {
            System.out.println(" Condition: Big Mileage");
        }
    }

    public static void main(String[] args) {
        Auto FirstCar = new Auto();
        Auto SecondCar = new Auto(49500, 25000, 2015, "Audi");

        FirstCar.printInfo();
        SecondCar.printInfo();
        SecondCar.goTestdrive(1000);
        SecondCar.printInfo();
    }

}



