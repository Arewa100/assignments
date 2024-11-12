package services;

import data.models.Entry;
import data.repositories.EntryRepository;
import data.repositories.RepositoryForEntry;

import java.time.LocalDate;
import java.util.List;

public class ServicesForEntry implements EntryServices{
    private final EntryRepository entryRepository = new RepositoryForEntry();

    @Override
    public String createEntry(String username, String title, String body, long entryId) {
        Entry entry = new Entry();
        entry.setTitle(title);
        entry.setBody(body);
        entry.setEntryId(entryId);
        entry.setDiaryId(username);
        entry.setDateOfCreation(LocalDate.now());
        entryRepository.save(entry);
        entryRepository.count();
        return "entry created successfully";
    }

    @Override
    public Entry findEntryById(String username, long entryId) {
        checkIfEntryExists(username, entryId);
        return entryRepository.findById(username, entryId);
    }

    @Override
    public List<Entry> findAllentryById(String username) {
        return entryRepository.findAll(username);
    }

    @Override
    public String updateEntry(String username, long entryId, String title, String body) {
        checkIfEntryExists(username, entryId);
        Entry entry = new Entry();
        entry.setTitle(title);
        entry.setBody(body);
        entry.setEntryId(entryId);
        entry.setDiaryId(username);
        entryRepository.save(entry);
        return "entry updated";
    }

    @Override
    public String deleteById(String username, long entryId) {
        checkIfEntryExists(username, entryId);
        entryRepository.deleteById(username, entryId);
        return "entry deleted successfully";
    }

    private void checkIfEntryExists(String username, long entryId) {
        if(entryRepository.findById(username, entryId) == null) throw new EntryException("entry not found");
    }
    @Override
    public long countNumberOfEntries() {
        return entryRepository.count();
    }

    @Override
    public String deleteAllEntriesFor(String username) {
        if (findAllentryById(username) == null) throw new EntryException("user not found");
        entryRepository.deleteAll(username);
        return "entries deleted successfully";
    }

}
