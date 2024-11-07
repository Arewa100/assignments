package services;

import data.models.Diary;
import data.models.Entry;

import java.util.List;

public interface DiaryServies {
    Diary registerUser(String username, String password);
    Diary loginUser(String username, String password);
    String logoutUser();
    List<Entry> findAllById(String entryId)
    void CreateEntry(String title, String body);
    Entry ReadEntry(String entryId);
    void UpdateEntry(String entryId, String title, String body);
    void DeleteById(String entryId);
}
