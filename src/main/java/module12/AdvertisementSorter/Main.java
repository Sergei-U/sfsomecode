package module12.AdvertisementSorter;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        AdvertisementSetMaker adSetMaker = new AdvertisementSetMaker(new File("src//Apartments.txt"));

        AdvertisementSorter adSorter = new AdvertisementSorter(adSetMaker.makeSet());
        adSorter.sortByAddedDate();
        System.out.println("");
        adSorter.sortByPrice();
        System.out.println("");
        adSorter.sortByRoomNumber();
    }
}
