package module15.vvvaleo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail {
   String name;
   String phonenum;
   String email;

   public NamePhoneEmail(String n, String p, String e) {
       name = n;
       phonenum = p;
       email = e;
   }
}

class NamePhone {
   String name;
   String phonenum;

   public NamePhone(String n, String p) {
       name = n;
       phonenum = p;
   }
}

public class StreamHW {
   public static void main(String[] args) {
       ArrayList<NamePhoneEmail> list = new ArrayList<>();
       list.add(new NamePhoneEmail("Лариса", "13-846-658", "lariska@sasiska.ru"));
       list.add(new NamePhoneEmail("Боря", "+371-65-896", "botja1912@studentki.ru"));
       list.add(new NamePhoneEmail("Кузьмич", "112-113-114", "onsamij@ribalka-ohota.ru"));

       System.out.println("Исходные элементы в коллекции:");
       list
               .stream()
               .forEach(a -> System.out.println(a.name + ": " + a.phonenum + " / " + a.email));

       System.out.println();

       Stream<NamePhone> namePhoneStream = list
               .stream()
               .map(a -> new NamePhone(a.name, a.phonenum));

       System.out.println("Только имена и номера телефонов в List:");
       List<NamePhone> namePhoneList = namePhoneStream.collect(Collectors.toList());
       namePhoneList
               .stream()
               .forEach(a -> System.out.println(a.name + ": " + a.phonenum));

       namePhoneStream = list
               .stream()
               .map(a -> new NamePhone(a.name, a.phonenum));
       System.out.println();
      
       System.out.println("Только имена и номера телефонов в Set:");
       Set<NamePhone> namePhoneSet = namePhoneStream.collect(Collectors.toSet());
       namePhoneSet
               .stream()
               .forEach(a -> System.out.println(a.name + ": " + a.phonenum));
   }
}

