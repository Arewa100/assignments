package controllers;

import data.models.Entry;
import services.EntryServices;
import services.ServicesForEntry;

public class EntryControllers {
    private EntryServices entryServices = new ServicesForEntry();

    public String createEntry(String username, String title, String body, long entryId) {
        return entryServices.createEntry(username, title, body, entryId);
    }

    public long getNumberOfCreatedEntries() {
        return entryServices.countNumberOfEntries();
    }

    public Entry findEntryBhyId(String micheal, long entryId) {
        return entryServices.findEntryById(micheal, entryId);
    }
}
