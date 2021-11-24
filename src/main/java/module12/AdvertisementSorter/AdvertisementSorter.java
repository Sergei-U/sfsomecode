package module12.AdvertisementSorter;

import java.util.Set;
import java.util.TreeSet;

public class AdvertisementSorter {
    private Set<Advertisement> apartments;
    private TreeSet<Advertisement> sortedAdvertisements;

    public AdvertisementSorter(Set<Advertisement> apartments) {
        this.apartments = apartments;
    }

    public void sortByRoomNumber(){
        RoomNumberComparator rNumComp = new RoomNumberComparator();
        sortedAdvertisements = new TreeSet<>(rNumComp);
        sortedAdvertisements.addAll(apartments);
        for (Advertisement ad : sortedAdvertisements){
            System.out.println(ad.getApartment());
        }
    }

    public void sortByPrice(){
        PriceComparator priceComp = new PriceComparator();
        sortedAdvertisements = new TreeSet<>(priceComp);
        sortedAdvertisements.addAll(apartments);
        for (Advertisement ad : sortedAdvertisements) {
            System.out.println(ad.getApartment());
        }
    }

    public void sortByAddedDate(){
        AddedDateComparator addedDateComp = new AddedDateComparator();
        sortedAdvertisements = new TreeSet<>(addedDateComp);
        sortedAdvertisements.addAll(apartments);
        for (Advertisement ad : sortedAdvertisements) {
            System.out.println(ad.getApartment());
        }
    }
}
