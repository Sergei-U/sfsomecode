package CollectionComparator;

import java.util.Comparator;

public class TransportComparator implements Comparator<Transport> {
    @Override
    public int compare(Transport t1, Transport t2) {
        if (t1.getSpeed() == t2.getSpeed()) {
            return 0;
        }
        if (t1.getSpeed() > t2.getSpeed()) {
            return 1;
        } else {
            return -1;
        }
    }
}
