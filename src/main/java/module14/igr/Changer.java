package module14.igr;

public class Changer implements Runnable {
    private MyList myList;
    private int positionChange = 0;

    public Changer(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        while (!myList.intsArr.isEmpty() && positionChange < myList.intsArr.size()) {
            myList.change(positionChange);
            positionChange++;
        }
    }
}
