package module6.Ann_G;

public class Main {
    public static void main(String[] args) {
        Duet duet = new Duet();
        Violin violin = new Violin("Stradivarius", false, "5th");

        duet.addInstrument(violin);
        duet.addInstrument(new DoubleBass("Double bass", false, "4th"));
        duet.addInstrument(new Violin("Violin 2", false, "5th"));

        violin.sound();
        System.out.println(violin.getTunedIn());
        System.out.println(violin.getName());
    }
}
