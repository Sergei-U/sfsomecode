package pechenkin;

public class Stair {
    int lengthOfStair;
    int hightOfStair;
    int numberOfSteps;
    int hightOfStep;
    int lengthOfStep;
    int middleStep;

    public Stair(int hightOfStair) {
        this.lengthOfStep = 300;
        this.hightOfStair = hightOfStair;
        this.numberOfSteps = hightOfStair / 150;
        this.lengthOfStair = this.numberOfSteps * this.lengthOfStep;
        this.hightOfStep = this.hightOfStair / this.numberOfSteps;
        this.middleStep = 2 * this.hightOfStep + this.lengthOfStep;
    }

    String getInfoOfStair() {
        return "Параметры лестницы. Высота=" + this.hightOfStair + "мм, длина=" + this.lengthOfStair + "мм, кол-во ступеней="
                + this.numberOfSteps + "шт., высота ступени=" + this.hightOfStep + "мм, длина ступени="
                + this.lengthOfStep + "мм, Средний шаг=" + this.middleStep + "мм.";
    }

    void changeLength(int delta) {
        this.lengthOfStair += delta;
        this.lengthOfStep = this.lengthOfStair / this.numberOfSteps;
        this.middleStep = 2 * this.hightOfStep + this.lengthOfStep;
    }

    void changeNumberOfSteps(int delta) {
        this.numberOfSteps += delta;
        this.hightOfStep = this.hightOfStair / this.numberOfSteps;
        this.lengthOfStep = this.lengthOfStair / this.numberOfSteps;
        this.middleStep = 2 * this.hightOfStep + this.lengthOfStep;
    }
}


class Main {
    public static void main(String[] args) {
        Stair st1 = new Stair(3000);
        System.out.println(st1.getInfoOfStair());
        st1.changeLength(-500);
        System.out.println(st1.getInfoOfStair());
        st1.changeNumberOfSteps(-2);
        System.out.println(st1.getInfoOfStair());
        st1.changeNumberOfSteps(1);
        System.out.println(st1.getInfoOfStair());
    }
}


