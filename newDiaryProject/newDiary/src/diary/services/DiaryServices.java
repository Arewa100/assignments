package services;

import data.models.Diary;
import data.models.Entry;

import java.util.List;

public interface DiaryServices {
    String registerUser(String username, String password);
    String loginUser(String username, String password);
    String logoutUser(String username);
    Diary findDiaryById(String username);
    void createEntry(String username, String title, String body);
    long countNumberOfDiaries();
}