package module6.Ann_G;

public class DoubleBass extends StringInstrument {

    DoubleBass(String name, boolean isFretted, String tunedIn) {
        super(name, isFretted, tunedIn);
    }

    public void sound() {
        System.out.println("Double bass makes low notes");
    }

    void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "double bass";
    }
}
