package repositories;

import models.Entry;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RepositoryForEntry implements EntryRepository {
    private final List<Entry> entries = new ArrayList<>();
    private int entryCounter = 0;

    @Override
    public void save(Entry entry) {
        entries.add(entry);
        entryCounter++;
    }

    @Override
    public Entry findById(String diaryId, int entryId) {
        for (Entry entry : entries) {
            if (diaryIdAndEntryIdIsValid(diaryId, entryId, entry)) {
                return entry;
            }
        }
        return null;
    }
    private boolean diaryIdAndEntryIdIsValid(String diaryId, int entryId, Entry entry) {
        return entry.getDiaryId().equals(diaryId) && entry.getId() == entryId;
    }


    @Override
    public Entry findByTitle(String diaryId, String title) {
        for (Entry entry : entries) {
            if (diaryIdAndTitleIsValid(diaryId, title, entry)) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public List<Entry> findAll(String diaryId) {
        List<Entry> listOfFoundEntries = new ArrayList<>();
        for (Entry entry : entries) {
            if (diaryIdIsFound(diaryId, entry)) {
                listOfFoundEntries.add(entry);
            }
        }
        return listOfFoundEntries;
    }

    private boolean diaryIdIsFound(String diaryId, Entry entry) {
        return diaryId.equals(entry.getDiaryId());
    }

    private boolean diaryIdAndTitleIsValid(String diaryId, String title, Entry entry) {
        return entry.getDiaryId().equals(diaryId) && entry.getTitle().equals(title);
    }

    @Override
    public void delete(String diaryId, int entryId) {
        for(int index = 0; index < entries.size(); index++) {
            Entry entry = entries.get(index);
            if(diaryIdAndEntryIdIsValid(diaryId, entryId, entry)) {
                entries.remove(entry);
                entryCounter--;
            };
        }
    }

    @Override
    public LocalDate getDate(int entryId) {
        return null;
    }

    @Override
    public void update(String diaryId, int entryId, String title, String body) {
        for (Entry entry : entries) {
            if (diaryIdAndEntryIdIsValid(diaryId, entryId, entry)) {
                entry.setTitle(title);
                entry.setBody(body);
            }
        }
    }

    @Override
    public long countNumberOfEntries() {
        return entryCounter;
    }
}
