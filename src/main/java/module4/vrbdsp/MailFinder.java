package module4.vrbdsp;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailFinder {

    public static String[] getMails(String testString) {
        String[] mails = new String[0];
        int numMail = 0;

        Pattern pattern = Pattern.compile(
                "([0-9A-Za-z]{1,}\\.){0,}" +
                "[0-9A-Za-z]{1,}@" +
                "([0-9A-Za-z]{1,}\\.){0,}" +
                "[0-9A-Za-z]{2,}");
        Matcher matcher = pattern.matcher(testString);

        while (matcher.find()) {
            String[] newArray;
            int start = matcher.start();
            int end = matcher.end();
            newArray = new String[++numMail];
            if (numMail > 1)
                newArray = Arrays.copyOf(mails, numMail);
            mails = newArray;
            mails[numMail - 1] = testString.substring(start, end);
        }
        return mails;
    }

}