package main.java.ALXNDR95.Collection;

import java.util.ArrayList;
import java.util.List;

public class TransportMain {
    public static void main(String[] args) {
        List<Transport> transportList = new ArrayList<>();

        transportList.add(new Transport("Train", "diesel fuel", 574.7));
        transportList.add(new Transport("Plane", "jet fuel", 800.0));
        transportList.add(new Transport("Passenger ship", "diesel fuel", 80.0));
        transportList.add(new Transport("Car", "gas", 120.0));

        System.out.println("Not sorted :");
        for (Transport t : transportList) {
            System.out.println(t);
        }

        TransportComparator transportComparator = new TransportComparator();
        transportList.sort(transportComparator);

        System.out.println("Sorted :");
        for (Transport t : transportList) {
            System.out.println(t);
        }

            /*Set<Transport> transportSet = new TreeSet<>(transportList);
            System.out.println("\nСортировка по скорости:");
            System.out.println(transportSet);*/
    }
}
