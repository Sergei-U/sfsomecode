package module7.bebeshkon;

public class ProgrammStart {

    public static void main(String[] args) {

        Daten konto1 = new Konto1();
        Daten konto2 = new Konto2();
        Daten konto3 = new Konto2();
        konto1.inhaber();
        konto1.institut();
        konto1.guthaben();
        konto2.inhaber();
        konto2.institut();
        konto2.guthaben();
        System.out.println(konto1.inhaber());
        System.out.println(konto1.institut());
        System.out.println(konto1.guthaben());
        System.out.println(konto2.inhaber());
        System.out.println(konto2.institut());
        System.out.println(konto2.guthaben());
    }
}

class Konto1 implements Daten {

    private String inhaber = "Tom Tom";
    private String institut = "Deutsche Bank";
    private double guthaben = 3106.24;

    @Override
    public String inhaber() {

        return inhaber;
    }

    @Override
    public String institut() {

        return institut;
    }

    @Override
    public double guthaben() {

        return guthaben;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public void setInstitut(String institut) {
        this.institut = institut;
    }

    public void setGuthaben(double guthaben) {
        this.guthaben = guthaben;
    }

}

class Konto2 implements Daten {

    private String inhaber = "Max Max";
    private String institut = "Sparkasse";
    private double guthaben = 31566.24;

    @Override
    public String inhaber() {

        return inhaber;
    }

    @Override
    public String institut() {

        return institut;
    }

    @Override
    public double guthaben() {

        return guthaben;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public void setInstitut(String institut) {
        this.institut = institut;
    }

    public void setGuthaben(double guthaben) {
        this.guthaben = guthaben;
    }

}

interface Daten {
    public String inhaber();

    public String institut();

    public double guthaben();

}