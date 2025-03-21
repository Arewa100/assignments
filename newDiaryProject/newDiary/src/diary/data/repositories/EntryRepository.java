package data.repositories;

import data.models.Entry;

import java.time.LocalDate;
import java.util.List;

public interface EntryRepository {
    void save(Entry entry);
    boolean existsById(String diaryId, long id);
    Entry findById(String diaryId, long id);
    void deleteById(String diaryId, long id);
    void delete(Entry entry);
    void deleteAll(String diaryId);
    Entry findByTitle(String diaryId, String title);
    List<Entry> findAll(String diaryId);
    LocalDate getDate(long entryId);
    long count();
}
