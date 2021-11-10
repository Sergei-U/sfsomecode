package main.java.ALXNDR95.Collection;

import java.util.*;

public class Carriage implements Comparable<Carriage> {
    private final String type;
    private final String fuel;
    private double speed;

    public Carriage(String type, String fuel, double speed) {
        if (type == null || fuel == null || speed <= 0) {
            throw new IllegalArgumentException();
        }
        this.type = type;
        this.fuel = fuel;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Carriage o) {
        return (int) (this.speed - o.speed);
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "type='" + type + '\'' +
                ", fuel='" + fuel + '\'' +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        Carriage c1 = new Carriage("Train", "diesel fuel", 574.7);
        Carriage c2 = new Carriage("Plane", "jet fuel", 800.0);
        Carriage c3 = new Carriage("Passenger ship", "diesel fuel", 80.0);
        Carriage c4 = new Carriage("Car", "gas", 120.0);

        SortedSet<Carriage> carriageSet = new TreeSet<>();

        carriageSet.add(c1);
        carriageSet.add(c2);
        carriageSet.add(c3);
        carriageSet.add(c4);
        carriageSet.add(c1);

        System.out.println(carriageSet);
    }
}
