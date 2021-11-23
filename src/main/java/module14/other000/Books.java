package module14.other000;

import java.util.ArrayList;
import java.util.List;

public  final class Books {


    String genre;
    private final int counts;
    private final List<String> authors;

    public Books(String genre, int counts, List<String> authors) {
        this.genre = genre;
        this.counts = counts;
        this.authors = authors;
    }


    public String getGenre() {
        return genre;
    }

    public int getCountss() {
        return counts;
    }

    public List<String> getAuthors() {
        return new ArrayList<>(authors);
    }
}

