package module14.igr;

public class Remover implements Runnable {
    private MyList myList;

    public Remover(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        while (!myList.intsArr.isEmpty()) {
            myList.delete();
        }
    }
}
