package module6.Ann_G;

public abstract class StringInstrument {
    private String name;
    private boolean isFretted;
    private String tunedIn;


    /* getters*/
    public String getName() {
        return name;
    }

    public boolean isFretted() {
        return isFretted;
    }

    public String getTunedIn() {
        return tunedIn;
    }

    public StringInstrument(String name, boolean isFretted, String tunedIn) {
        this.name = name;
        this.isFretted = isFretted;
        this.tunedIn = tunedIn;
    }

    public void sound() {
        System.out.println("Some sound");
    }

}
