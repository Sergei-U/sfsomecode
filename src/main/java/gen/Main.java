package gen;

import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Collection<? super String> collection = new LinkedList<>(); // 2
        collection.add("Hello"); // 3
        System.out.println(collection.size());
    }
}
