package module9.kuznetsov;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EncryptionMachine {

    public static final String ECNRYPT = "src/main/java/module9/kuznetsov/decryption.txt";
    public static final String DECRYPT = "src/main/java/module9/kuznetsov/decryption.txt";
    public static final String KEY = "src/main/java/module9/kuznetsov/keyPhrase.txt";

    private String SECRET_KEY = "";
    private String encryptionText = "";
    private String decryptionText = "";

    public void metaMethod() throws IOException {
        getValuesFromFiles();
        encrypt();
        decrypt();
        setValuesToFiles();
    }

    private void getValuesFromFiles() throws IOException {
        // getting decode word
        FileReader keyReader = new FileReader(KEY);
        int dwLength;
        StringBuilder sbDWord = new StringBuilder(SECRET_KEY);
        while ((dwLength = keyReader.read()) != -1) {
            sbDWord.append((char) dwLength);
        }
        SECRET_KEY = sbDWord.toString();
        keyReader.close();

        // working with enc file
        FileReader encReader = new FileReader(ECNRYPT);
        int encLength;
        StringBuilder sbEnc = new StringBuilder(encryptionText);
        while ((encLength = encReader.read()) != -1) {
            sbEnc.append((char) encLength);
        }
        encryptionText = sbEnc.toString();
        encReader.close();

        // working with dec file
        FileReader decReader = new FileReader(DECRYPT);
        int decLength;
        StringBuilder sbDec = new StringBuilder(decryptionText);
        while ((decLength = decReader.read()) != -1) {
            sbDec.append((char) decLength);
        }
        decryptionText = sbDec.toString();
        decReader.close();
    }

    private void encrypt() throws IOException {
        FileReader fileReader = new FileReader(ECNRYPT);
        if (fileReader.read() != -1) {
            // getting encryption time
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
            String date = dateFormat.format(calendar.getTime());
            // adding date to StringBuilder
            StringBuilder sbEnc = new StringBuilder(encryptionText);
            sbEnc.append("\n").append(date);
            // encrypting the message via loop (+++)
            for (int i = 0; i < sbEnc.length(); i++) {
                sbEnc.setCharAt(i, (char) ((int) sbEnc.charAt(i) + getKeyCode(SECRET_KEY)));
            }
            System.out.println("Message encrypted");
            encryptionText = sbEnc.toString();
        }
    }

    private void decrypt() throws IOException {
        FileReader fileReader = new FileReader(DECRYPT);
        if ((fileReader.read()) != -1) {
            StringBuilder sbDec = new StringBuilder(decryptionText);
            for (int i = 0; i < sbDec.length(); i++) {
                sbDec.setCharAt(i, (char) ((int) sbDec.charAt(i) - getKeyCode(SECRET_KEY)));
            }
            System.out.println("Message decrypted via inputted key");
            decryptionText = sbDec.toString();
        }
    }

    private void setValuesToFiles() throws IOException {
        FileWriter encWriter = new FileWriter(ECNRYPT, StandardCharsets.UTF_8);
        encWriter.write(encryptionText);
        encWriter.close();

        FileWriter decWriter = new FileWriter(DECRYPT, StandardCharsets.UTF_8);
        decWriter.write(decryptionText);
        decWriter.close();
    }

    private int getKeyCode(String key) {
        // getting the key-code
        int keyCode = 0;
        for (int i = 0; i < key.length(); i++) {
            keyCode += key.charAt(i);
        }
        return keyCode;
    }
}