package repositories;

import models.Entry;

import java.time.LocalDate;
import java.util.List;

public interface EntryRepository {
    void save(Entry entry);
    Entry findById(int id);
    Entry findByTitle(String title);
    void delete(String title);
    void delete(int id);
    LocalDate getDate(int id);
    long count();
}
