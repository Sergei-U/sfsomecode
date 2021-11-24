package module12.AdvertisementSorter;

import java.util.Objects;

public class Advertisement {
    private int ID;
    private Apartment apartment;
    private String date;

    public Advertisement(int ID, Apartment apartment, String date) {
        this.ID = ID;
        this.apartment = apartment;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisement advert = (Advertisement) o;
        return ID == advert.getID();
    }

    @Override
    public int hashCode(){
        return Objects.hash(ID);
    }
}
