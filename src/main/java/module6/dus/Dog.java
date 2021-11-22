package module6.dus;

public class Dog {
   private String name;
   private int age;
   private String address;

   public Dog(String name, int age, String address) {
       this.name = name;
       this.age = age;
       this.address = address;
   }
   public String toString(){
       return "The dog " + name + " is already " + age + " years old. Her address is " + address;
   }

   public String getName() {
       return name;
   }

   public int getAge() {
       return age;
   }

   public String getAddress() {
       return address;
   }

   public void setName(String name) {
       this.name = name;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public void setAddress(String address) {
       this.address = address;
   }
   public void bark(){}
   public void defend(){}
}

class PuppyDog extends Dog {

       private int size = 25;

       public PuppyDog(String name, int age, String address,int size){
           super("Bob", 1, "Moscow city");
           this.size = size;
       }



       public int getSize () {
           return size;
       }
       public void setSize ( int size){
           this.size = size;
       }
       public String toString () {
           return "The puppy dog " + this.getName() + " is already " + this.getAge() + " years old, and she is " + size + " centimeters long. Her address is " + this.getAddress();
       }
   }

