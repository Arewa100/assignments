package models;

import java.time.LocalDate;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDate dateOfCreation;
    private String diaryId;


    public Entry(String diaryId, int id, String title, String body) {
        this.diaryId = diaryId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateOfCreation = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(String diaryId) {
        this.diaryId = diaryId;
    }
}
