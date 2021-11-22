package module4.vrbdsp;

public class Main {
    public static void main(String[] args) {
        String test = "Hello. My email is mail@com.ru Write me the letter. " +
                      "Adress my company is office.company@com.";

        for (String mail : MailFinder.getMails(test)) {
            System.out.println(mail);
        }
    }
}