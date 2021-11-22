package module4.wav;

public class Main {
    public static void main(String[] args) {
        PersonalID petya = new PersonalID(
                "Петя",
                "Петров",
                "мужской",
                25,
                180,
                70);
        PersonalID masha = new PersonalID();

        switch (PersonalID.sex) {
            case "женский":
                masha.surname = petya.surname + "a";
                masha.printID();
            case "мужской":
                petya.printID();
        }
    }
}
