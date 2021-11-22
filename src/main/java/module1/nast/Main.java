package module1.nast;

class Main {
  public static void main(String[] args) {
    printHello();
    printSpace();
    printWorld();
  }
  private static void printHello() {
    System.out.print("Hello");
  }
  private static void printWorld() {
    System.out.print(" ");
  }
  private static void printSpace() {
    System.out.print("World!");
  }
}