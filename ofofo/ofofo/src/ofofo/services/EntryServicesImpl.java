package services;

import java.time.LocalDate;
import java.util.List;

public class EntryServicesImpl implements EntryServices {
    private long numberOfCreatedEntries = 0;


    @Override
    public String createEntry(String title, String body) {
        numberOfCreatedEntries++;
        return "Entry created successfully...";
    }

    @Override
    public String findById(int id) {
        return "";
    }

    @Override
    public String findByTitle(String title) {
        return "";
    }

    @Override
    public List<String> findAll(String diaryId) {
        return List.of();
    }

    @Override
    public void delete(int entryId) {

    }

    @Override
    public LocalDate getDate(int entryId) {
        return null;
    }

    @Override
    public void update(String title, String body) {

    }

    @Override
    public long numberOfCreatedEntry() {
        return numberOfCreatedEntries;
    }
}
