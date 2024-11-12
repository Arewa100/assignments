package services;

import data.models.Entry;

import java.util.List;

public interface EntryServices {
    String createEntry(String username, String title, String body, long entryId);
    Entry findEntryById(String username, long entryId);
    List<Entry> findAllentryById(String username);
    String updateEntry(String username, long entryId, String title, String body);
    String deleteById(String username, long entryId);
    long countNumberOfEntries();
    String  deleteAllEntriesFor(String sarah);
}
;