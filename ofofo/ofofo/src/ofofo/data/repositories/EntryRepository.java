package repositories;
import models.Entry;
import java.time.LocalDate;
import java.util.List;

public interface EntryRepository {

    void save(Entry entry);
    Entry findById(String diaryId, int id);
    Entry findByTitle(String diaryId, String title);
    List<Entry> findAll(String diaryId);
    void delete(String diaryId, int entryId);
    LocalDate getDate(int entryId);
    void update(String diaryId, int entryId, String title, String body);
    long countNumberOfEntries();
}