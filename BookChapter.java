package Hafiz2;

import java.awt.print.Book;

public class BookChapter extends Text {
    protected String title;
    protected int chapterNumber;

    public BookChapter(String title, int chapterNumber, String content){
        this.title = title;
        this.chapterNumber = chapterNumber;
        this.para[currentPara] = content;
        currentPara ++;
    }

    @Override
    public String toString() {
        String book = "Title: " + title +
                "\n Chapter Number: " + chapterNumber +
                "\n Contents: \n";

        for (int i = 0; i < getCurrentPara(); i++) {
            book += para[i] + "\n";
        }

        return book;
    }
}