package module9.luka;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private String sender;
    private String receiver;
    private String text;
    private Date date;
    private String dateFormatted;

    public Message(String sender, String receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
        this.dateFormatted = "";
    }

    @Override
    public String toString() {
        if (this.dateFormatted.equals("")) {
            return "From: " + this.sender + "\nTo: " + this.receiver + "\nOn: " +
                    this.date + "\nText: " + this.text;
        } else return "From: " + this.sender + "\nTo: " + this.receiver + "\nOn: " +
                this.dateFormatted + "\nText: " + this.text;
    }

    public Date getDate() {
        return date;
    }

    public void setDateFormatted(String dateFormatted) {
        this.dateFormatted = dateFormatted;
    }

    public void formatDate(Date date) {
        DateFormat format = new SimpleDateFormat("dd.MM.YY HH:mm");
        setDateFormatted(format.format(this.date));

    }

}