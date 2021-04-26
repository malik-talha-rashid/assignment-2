package Hafiz2;

public class Runner {
    public static void main(String[] args) {
        EmailAddress from = new EmailAddress("from@abc.def.com");
        EmailAddress to = new EmailAddress("to@abc.def.edu");
        String subject = "Subject of email";
        String message = "These are the contents of email";

        Email email = new Email(from, to, subject, message);

        email.addPara("This is another para that is added");
        System.out.println(email);

        BookChapter bookChapter = new BookChapter("Inheritance", 11, "Contents about inheritance");
        System.out.println(bookChapter);
    }
}
