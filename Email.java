package Hafiz2;

public class Email extends Text{
    protected EmailAddress from;
    protected EmailAddress to;
    protected String subject;

    public Email(EmailAddress from, EmailAddress to, String subject, String message){
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.para[currentPara] = message;
        currentPara ++;
    }
    @Override
    public String toString() {
        String email =  "From: " + from +
                         "\n To: "+ to +
                        "\n Subject: " + subject +
                        "\n Message: ";
        for (int i = 0; i < getCurrentPara(); i++) {
            email += para[i] + "\n";
        }

        return email;
    }
}
