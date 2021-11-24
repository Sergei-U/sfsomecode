package module12.AdvertisementSorter;

import java.util.Comparator;

public class RoomNumberComparator implements Comparator <Advertisement> {
    @Override
    public int compare(Advertisement a1, Advertisement a2) {
        return a1.getApartment().getRooms() - a2.getApartment().getRooms();
    }
}
