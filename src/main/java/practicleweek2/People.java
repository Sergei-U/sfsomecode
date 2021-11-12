package practicleweek2;

public abstract class People {
    String name, profession;
    int age;

    public People(String name, int age, String profession) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }
}
