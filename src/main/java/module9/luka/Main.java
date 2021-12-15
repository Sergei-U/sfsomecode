package module9.luka;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Andrey", "Slava", "Some text");
        System.out.println(message.toString());
        message.formatDate(message.getDate());
        System.out.println(message.toString());
    }
}
