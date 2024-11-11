package services;

import data.models.Entry;

import java.util.List;

public interface EntryServices {
    void createEntry(String username, String title, String body, long entryId);
    Entry findEntryById(String username, long entryId);
    List<Entry> findAllentryById(String username);
    void UpdateEntry(String username, long entryId, String title, String body);
    void DeleteById(String username, long entryId);
    long countNumberOfEntries();
}
;