package repositories;

import models.Entry;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RepositoryForEntry implements EntryRepository{
    private final List<Entry> entries = new ArrayList<>();
    private long count = 0;

    @Override
    public void save(Entry entry) {
        entries.add(entry);
        count++;

    }

    @Override
    public Entry findById(int id) {
        for (int index = 0; index < entries.size(); index++) {;
            Entry entry = entries.get(index);
            if (entryIdMatchesGivenId(entry, id)) {
                return entry;
            }
        }
        return null;
    }

    private boolean entryIdMatchesGivenId(Entry entry, int id) {
        return entry.getId() == id;
    }

    @Override
    public Entry findByTitle(String title) {
        for(Entry entry : entries) {
            if (titleMatchesGivenTitle(entry, title)) {
                return entry;
            }
        }
        return null;
    }

    private boolean titleMatchesGivenTitle(Entry entry, String title) {
        return entry.getTitle().equals(title);
    }

    @Override
    public void delete(String title) {
        for (int index = 0; index < entries.size(); index++) {
            Entry entry = entries.get(index);
            if(titleMatchesGivenTitle(entry, title)) {
                entries.remove(entry);
            }
            count--;
        }
    }

    @Override
    public void delete(int id) {
        for (int index = 0; index < entries.size(); index++) {
            Entry entry = entries.get(index);
            if (entryIdMatchesGivenId(entry, id)) {
                entries.remove(entry);
            }
        }
        count--;
    }

    @Override
    public LocalDate getDate(int id) {
        return findById(id).getDate();
    }

    @Override
    public void update(int id, String title, String body) {
        for (int index = 0; index < entries.size(); index++) {;
            Entry entry = entries.get(index);
            if (entryIdMatchesGivenId(entry, id)) {
                entry.setTitle(title);
                entry.setBody(body);
            }
        }
    }

    @Override
    public long count() {
        return count;
    }
}
