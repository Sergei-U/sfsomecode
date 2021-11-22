package module6.AntonNik;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Animal animal;

       System.out.println("What animal do you want?");
       System.out.println("1 - cat, 2 - dog");
       int choice = scanner.nextInt();

       if (choice == 1){
           animal = new Cat();
           animal.speak();
       } else if (choice == 2){
           animal = new Dog();
           animal.speak();
       } else {
           animal = new Animal();
           System.out.println("Invalid choice");
           animal.speak();
       }
   }
}



class Animal {
   public void speak(){
       System.out.println("animals go brrrr");
   }
}


class Cat extends Animal{

   @Override
   public void speak(){
       System.out.println("cat goes 'meow'");
   }
}


class Dog extends Animal{

   @Override
   public void speak(){
       System.out.println("dog goes 'bark'");
   }
}

