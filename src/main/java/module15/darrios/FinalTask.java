package module15.darrios;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FinalTask {

   public static class Person {
       private String last_name;
       private String first_name;
       private int age;
       private String citizenship;

       public Person(String last_name, String first_name, int age, String citizenship) {
           this.last_name = last_name;
           this.first_name = first_name;
           this.age = age;
           this.citizenship = citizenship;
       }

       @Override
       public String toString() {
           return "Person{" +
                   "last_name='" + last_name + '\'' +
                   ", first_name='" + first_name + '\'' +
                   ", age=" + age +
                   ", citizenship='" + citizenship + '\'' +
                   '}';
       }
   }

   public static void main(String[] args) {
       List<Person> persons = new ArrayList<>();
       persons.add(new Person("Bolat", "Saken", 15, "KZ"));
       persons.add(new Person("Kim", "Artem", 16, "RU"));
       persons.add(new Person("Tom", "Cruise", 17, "UK"));
       persons.add(new Person("Belly", "Berry", 18, "KG"));
       persons.add(new Person("Kelly", "Rowland", 19, "UZ"));
       persons.add(new Person("Dawson", "Jack", 21, "BG"));
       persons.add(new Person("Rose", "Dawson", 22, "US"));
       persons.add(new Person("Belly", "Dance", 30, "EU"));

       List<Person> collect = persons.stream()
               .filter(p -> p.age >= 18)
               .sorted(Comparator.comparing(p -> p.first_name))
               .sorted(Comparator.comparing(p -> p.last_name))
               .collect(Collectors.toList());
       System.out.println(collect);

       // save to file
       savePersonsListToFile(collect, "./persons.txt");

       Optional<Person> user = findUser(persons, "rose", "dawson");
       System.out.println(user.isPresent());

   }

   public static void savePersonsListToFile(List<Person> persons, String filePath) {
       Path path = Paths.get(filePath);
       try {
           Files.createFile(path);
           try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, Charset.defaultCharset())) {
               bufferedWriter.write("Last Name, First Name, Age, Citizenship\n");
               for (Person person : persons) {
                   bufferedWriter.write(person.last_name + ", " + person.first_name + ", " + person.age +  ", " + person.citizenship + "\n");
               }
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

   public static Optional<Person> findUser(List<Person> persons, String last_name, String first_name) {
       Optional<Person> optional = persons.stream()
               .filter(p -> p.last_name.equalsIgnoreCase(last_name) && p.first_name.equalsIgnoreCase(first_name))
               .findFirst();

       return optional;
   }
}

