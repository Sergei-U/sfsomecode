package main.java;

public class StarSystem {
    private String starName;
    private int quantityOfPlanets;
    private Long age;



    public StarSystem(String starName, int quantityOfPlanets, Long age) {
        this.starName = starName;
        this.quantityOfPlanets = quantityOfPlanets;
        this.age = age;
    }

    public String getInfo(String starName, int quantityOfPlanets, Long age) {
        return starName+" "+quantityOfPlanets+" "+age;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public int getQuantityOfPlanets() {
        return quantityOfPlanets;
    }

    public void setQuantityOfPlanets(int quantityOfPlanets) {
        this.quantityOfPlanets = quantityOfPlanets;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
