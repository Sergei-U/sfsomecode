package module14.kuryat;

import java.util.Random;

public class Truck <T>{
    private T type;
    private int size;

    public Truck() {
        type = randomiseType();
        size = randomiseSize();
    }

    private T randomiseType(){
        Random random = new Random();
        switch (random.nextInt(3)){
            case 0 :
                return (T) new Food();
            case 1 :
                return (T) new Material();
            case 2 :
                return (T) new Other();
            default:
                return null;
        }
    }

    public int getSize() {
        return size;
    }

    private int randomiseSize(){
        Random random = new Random();
        int number = random.nextInt(10);
        if(number == 0){
            return 1;
        } else return number;
    }
    public T getType() {
        return  ((T) type.getClass().getSimpleName());
    }

}

