package module14.igr;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        Thread remover = new Thread(new Remover(myList));
        Thread changer = new Thread(new Changer(myList));
        remover.start();
        changer.start();
    }
}
