package module6.a6cat;

public class Cat {
    private String name;
    private int age;
    private String owner;

    public Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "The cat " +name+" is already "+age+". Her master "+owner+" takes care of her.";
    }
}
