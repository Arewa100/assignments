package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked = false;
    private final String password;
    private final List<Entry> listOfEntries = new ArrayList<>();


    public Diary(String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lock() {
        isLocked = true;
    }

    public boolean isEmpty() {
        return listOfEntries.isEmpty();
    }

    public void unlock(String password) {
        if(password.equals(this.password)) isLocked = false;
    }

    public void createEntry(String title, String body) {
        if(!isLocked) {
            createANewEntry(title, body);
        }
    }

    private void createANewEntry(String title, String body) {
        Entry entry = new Entry(title, body, listOfEntries.size() + 1);
        listOfEntries.add(entry);
    }

    public int getNumberOfEntry() {
        return listOfEntries.size();
    }

    public Entry findEntryById(int entryId) {
        return findEntry(entryId);
    }

    public void update(int id, String newTitle, String newBody) {
        Entry entry = findEntryById(id);
        entry.setTitle(newTitle);
        entry.setBody(newBody);
    }

    private Entry findEntry(int entryId) {
        for(Entry entry: listOfEntries) {
            if(entry.getId() == entryId) return entry;
        }
        return null;
    }
}
