package module15.kuryat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Loader {

   public static void main(String[] args) {
       Path path = Paths.get("src\\HomeWork\\Test.txt");
       Path path2 = Paths.get("src\\HomeWork\\WrittenText.txt");
       try (BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset())){
           String line = "";
           while ((line = reader.readLine()) != null){
               String[] lineArray = line.split(" ");
               Stream<String> stream = Stream.of(lineArray)
                       .map(s -> stringReverse(s));
               List<String> resultList = stream.collect(Collectors.toCollection(ArrayList::new));

               try (Writer writer = Files.newBufferedWriter(path2)){
                   writer.write(listToWrite(resultList));
               }
           }
       } catch (IOException e){
           e.printStackTrace();
       }
   }

   public static String stringReverse(String str){
       return new StringBuffer(str).reverse().toString();
   }

   public static String listToWrite(List<String> list){
       StringBuilder stringBuilder = new StringBuilder();
       for (String s: list) {
           stringBuilder.append(s).append(" ");
       }
       return stringBuilder.toString();
   }
}

