package module12.AdvertisementSorter;

import java.util.Calendar;
import java.util.Comparator;

public class AddedDateComparator implements Comparator <Advertisement> {

    @Override
    public int compare(Advertisement a1, Advertisement a2){
        String[] tokens1 = a1.getDate().split("\\.");
        Calendar calendarA1 = Calendar.getInstance();
        calendarA1.set(Integer.parseInt(tokens1[2]), Integer.parseInt(tokens1[1]), Integer.parseInt(tokens1[0]));

        String[] tokens2 = a2.getDate().split("\\.");
        Calendar calendarA2 = Calendar.getInstance();
        calendarA2.set(Integer.parseInt(tokens2[2]), Integer.parseInt(tokens2[1]), Integer.parseInt(tokens2[0]));

        return calendarA1.compareTo(calendarA2);
    }
}
