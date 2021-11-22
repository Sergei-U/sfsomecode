package module6.kovalyovop;

public class Animal {

    private int years;
    private String name;

    public void findFood() {
        System.out.println("Animals find food");
    }

    public void getEat() {
        System.out.println("Animals feeds");
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public String getName() {
        return name;
    }
}

class HerbivorousAnimal extends Animal {

    @Override
    public void findFood() {
        System.out.println("Herbivores look for plants");
    }

    @Override
    public void getEat() {
        System.out.println("Herbivores eat plants");
    }

}

class PredatoryAnimal extends Animal {

    @Override
    public void findFood() {
        System.out.println("Predatory animals look for other animals");
    }

    @Override
    public void getEat() {
        System.out.println("Predatory animals eat meat");
    }

}

class Main{
    public static void main(String[] args) {

        System.out.println("Selected animal:" + "\n");
        PredatoryAnimal cat = new PredatoryAnimal();
        cat.setName("Сaesar");
        cat.setYears(5);
        System.out.println("Name: " + cat.getName() + "\n" + "Age: " + cat.getYears());
        cat.findFood();
        cat.getEat();
        System.out.println();
        System.out.println("Selected animal:" + "\n");
        HerbivorousAnimal cow = new HerbivorousAnimal();
        cow.setName("Сleopatra");
        cow.setYears(7);
        System.out.println("Name: " + cow.getName() + "\n" + "Age: " + cow.getYears());
        cow.findFood();
        cow.getEat();
    }
}