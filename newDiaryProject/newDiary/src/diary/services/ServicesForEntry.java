package services;

import data.models.Entry;
import data.repositories.EntryRepository;
import data.repositories.RepositoryForEntry;

import java.time.LocalDate;
import java.util.List;

public class ServicesForEntry implements EntryServices{
    private final EntryRepository entryRepository = new RepositoryForEntry();

    @Override
    public void createEntry(String username, String title, String body, long entryId) {
        Entry entry = new Entry();
        entry.setTitle(title);
        entry.setBody(body);
        entry.setEntryId(entryId);
        entry.setDiaryId(username);
        entry.setDateOfCreation(LocalDate.now());
        entryRepository.save(entry);
    }

    @Override
    public Entry findEntryById(String username, long entryId) {
        return null;
    }

    @Override
    public List<Entry> findAllentryById(String username) {
        return List.of();
    }

    @Override
    public void UpdateEntry(String username, long entryId, String title, String body) {

    }

    @Override
    public void DeleteById(String username, long entryId) {

    }

    @Override
    public long countNumberOfEntries() {
        return 0;
    }
}
