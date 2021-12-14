package practicleweek.w1;


public class Balance {
    int r = 0;
    int l = 0;

    public void addRight(int n) {
        r += n;
    }

    public void addLeft(int n) {
        l += n;
    }

    public String getSituation() {
        if (r == l) return "=";
        else if (r > l) return "r";
        else return "l";
    }
}
