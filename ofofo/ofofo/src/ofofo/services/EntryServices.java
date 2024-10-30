package services;

import java.time.LocalDate;
import java.util.List;

public interface EntryServices {
    String createEntry(String title, String body);
    String findById(int id);
    String findByTitle(String title);
    List<String> findAll(String diaryId);
    void delete(int entryId);
    LocalDate getDate(int entryId);
    void update(String title, String body);
    long numberOfCreatedEntry();
}
