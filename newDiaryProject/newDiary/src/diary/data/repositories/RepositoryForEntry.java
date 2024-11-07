package data.repositories;

import data.models.Entry;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepositoryForEntry implements EntryRepository{
    private final List<Entry> entries = new ArrayList<>();


    @Override
    public void save(Entry givenEntry) {
        Entry entry = findById(givenEntry.getDiaryId(), givenEntry.getEntryId());
        if(entry != null && entryIdIsSame(entry, givenEntry)) {
            entry.setTitle(givenEntry.getTitle());
            entry.setBody(givenEntry.getBody());
        } else {
            entries.add(givenEntry);
        }
    }

    private boolean entryIdIsSame(Entry entry, Entry givenEntry) {
        return entry.getEntryId() == (givenEntry.getEntryId());
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
        for(int index= 0; index < entries.size(); index++){
            if(entryExists(diaryId, id, entries.get(index))) return entries.get(index);
        }
        return null;
    }

    @Override
    public void deleteById(String diaryId, int id) {
        for(int index= 0; index < entries.size(); index++){
            if(entryExists(diaryId, id, entries.get(index))) entries.remove(entries.get(index));
        }
    }

    @Override
    public void delete(Entry entry) {
        for(int index= 0; index < entries.size(); index++){
            if(entryExists(entry.getDiaryId(), entry.getEntryId(), entries.get(index))) entries.remove(entries.get(index));
        }
    }

    @Override
    public void deleteAll(String diaryId) {
        entries.removeIf(entry -> entry.getDiaryId().equals(diaryId));
    }

    @Override
    public Entry findByTitle(String diaryId, String title) {
        for(Entry entry : entries){
            if(titleExists(diaryId, title, entry)) return entry;
        }
        return null;
    }

    private boolean titleExists(String diaryId, String title, Entry entry) {
        return entry.getDiaryId().equals(diaryId) && entry.getTitle().equals(title);
    }

    @Override
    public List<Entry> findAll(String diaryId) {
        List<Entry> foundEntries = new ArrayList<>();
        for(Entry entry : entries) {
            if(entry.getDiaryId().equals(diaryId)) foundEntries.add(entry);
        }
        return foundEntries;
    }

    @Override
    public LocalDate getDate(int entryId) {
        return null;
    }

    @Override
    public long count() {
        return entries.size();
    }
}
