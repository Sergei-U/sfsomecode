package module12.AdvertisementSorter;

import java.util.Comparator;

public class PriceComparator implements Comparator <Advertisement> {
    @Override
    public int compare(Advertisement a1, Advertisement a2){
        return a1.getApartment().getPrice() - a2.getApartment().getPrice();
    }
}
