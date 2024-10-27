package models;

import java.time.LocalDate;
import java.util.Date;

public class Entry {
    private String title;
    private String body;
    private int Id;
    private LocalDate date;

    public Entry(String title, String body, int Id) {
        this.title = title;
        this.body = body;
        this.Id = Id;
        this.date = LocalDate.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
