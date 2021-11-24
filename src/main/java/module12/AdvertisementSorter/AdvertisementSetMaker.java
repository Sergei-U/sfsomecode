package module12.AdvertisementSorter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class AdvertisementSetMaker {
    private File file;

    public AdvertisementSetMaker(File file){
        this.file = file;
    }

    public HashSet<Advertisement> makeSet (){
        HashSet<Advertisement> advertisements = new HashSet<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                String[] values = line.split("/");
                Apartment apartment = new Apartment(values[1], Integer.parseInt(values[2]), Integer.parseInt(values[3]), Float.parseFloat(values[4]));
                advertisements.add(new Advertisement(Integer.parseInt(values[0]), apartment, values[5]));
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return advertisements;
    }
}
