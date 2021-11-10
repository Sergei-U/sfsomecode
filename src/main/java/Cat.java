package main.java;


public class Cat {
    private String name;
    private int age;
    private String owner;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }

    public Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String toString() {
        String catToString = "The cat " + getName() + " is already " + getAge() + ". Her master " + getOwner() + " takes care of her.";
        return catToString;
    }

    public void eat() {

    }

    public void run() {

    }

    public class PedigreeCat extends Cat {
        private String breed;
        Cat barsik = new Cat("Barsik", 100, "Vasya");
        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public PedigreeCat (String name, int age, String owner, String breed) {
            super(name, age, owner);
            this.breed = breed;
        }

        public String toString() {
            String catToString = "The cat" + name + " is very beautiful, although she is now " + age + ", she belongs to the breed " + breed + "," +
                    " and her owner " + owner + " is very proud of her.";
            return catToString;

            //return "The cat" + this.getName() + "is very beautiful, although she is now" + this.getAge + ", she belongs to the breed" + breed + ",
            // and her owner" + this.getOwner() + "is very proud of her.";
        }

    }
}