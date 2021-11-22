package module4.wav;

public class PersonalID {
    String name;
    String surname;
    static String sex;
    int age;
    int height;
    int weight;

    public PersonalID() {
        name = "Маша";
        age = 27;
        sex = "женский";

    }

    public PersonalID(String name, String surname, String sex, int age, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public void printID() {
        System.out.println("\nИмя: " + name + "\nФамилия: " + surname + "\nПол: " + sex + "\nВозраст: " + age + "\nРост: " + height + "\nВес: " + weight);
    }
}
