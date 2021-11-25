package practicleweek2.wokr5;

public class Human {
     String name;
     int age;
     int weight;
     String address;
     String work;
    
    public Human(String name, int age) {
        this(name, age, 50, "no address", "no work");
    }

    public Human(String name, String address) {
        this(name, 10, 50, address, "no work");
    }

    public Human(String name, int age, int weight) {
        this(name, age, weight, "no address", "no work");
    }

    public Human(String name, int age, String work) {
        this(name, age, 50, "no address", work);
    }

    public Human(int age, int weight, String address, String work) {
        this("no name", age, weight, address, work);
    }
    
    private Human(String name, int age, int weight, String address, String work) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }


}