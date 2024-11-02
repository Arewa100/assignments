package data.repositories;

import data.models.Entry;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RepositoryForEntry implements EntryRepository{
    private final List<Entry> entries = new ArrayList<>();
    private long numberOfEntries;


    @Override
    public void save(Entry entry) {
        entries.add(entry);
        numberOfEntries++;
    }

    @Override
    public boolean existsById(String diaryId, int id) {
        for(Entry entry : entries){
            if(entryExists(diaryId, id, entry)) return true;
        }
        return false;
    }

    private boolean entryExists(String diaryId, int entryId, Entry entry) {
        return entry.getDiaryId().equals(diaryId) && entry.getEntryId() == entryId;
    }

    @Override
    public Entry findById(String diaryId, int id) {
        for(Entry entry : entries){
            if(entryExists(diaryId, id, entry)) return entry;
        }
        return null;
    }

    @Override
    public void deleteById(String diaryId, int id) {

    }

    @Override
    public void delete(Entry entry) {

    }

    @Override
    public void deleteAll(String diaryId) {

    }

    @Override
    public Entry findByTitle(String diaryId, String title) {
        return null;
    }

    @Override
    public List<Entry> findAll(String diaryId) {
        return List.of();
    }

    @Override
    public LocalDate getDate(int entryId) {
        return null;
    }

    @Override
    public long count() {
        return numberOfEntries;
    }
}
