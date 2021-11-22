package module6.Ann_G;


public class Violin extends StringInstrument {

    Violin(String name, boolean isFretted, String tunedIn) {
        super(name, isFretted, tunedIn);
    }

    public void sound() {
        System.out.println("Violin makes high notes");
    }

    void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "violin";
    }
}
