package module6.Ann_G;

public class Duet {
    final static private int MAXnumberOfInstruments = 2;
    Object[] instruments;
    private int i = 0;

    Duet() {
        instruments = new Object[MAXnumberOfInstruments];
    }

    void addInstrument(StringInstrument instrument) {
        if (i < MAXnumberOfInstruments) {
            instruments[i++] = instrument;
        } else {
            System.out.println("No more instruments");
            print();
        }
    }

    void print() {
        System.out.println("Duet consist of:");
        for (Object instrument : instruments) {
            System.out.println(instrument);
        }
    }
}
