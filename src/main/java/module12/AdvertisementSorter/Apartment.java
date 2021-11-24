package module12.AdvertisementSorter;

public class Apartment {
    private String address;
    private int rooms;
    private int price;
    private float area;

    public Apartment(String address, int rooms, int price, float area) {
        this.address = address;
        this.rooms = rooms;
        this.price = price;
        this.area = area;
    }
    @Override
    public String toString(){
        return address + ", " + rooms + " rooms, area: " + area + ", price: " + price;
    }

    public String getAddress() {
        return address;
    }

    public int getRooms() {
        return rooms;
    }

    public int getPrice() {
        return price;
    }

    public float getArea() {
        return area;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
