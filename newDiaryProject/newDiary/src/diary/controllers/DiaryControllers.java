package controllers;

import services.DiaryServices;
import services.ServicesForDiary;

public class DiaryControllers {

    private DiaryServices diaryServices = new ServicesForDiary();

    public String register(String username, String password) {
        return diaryServices.registerUser(username, password);
    }

    public String login(String username, String password) {
        return diaryServices.loginUser(username, password);
    }

    public String logout(String username) {
        return diaryServices.logoutUser(username);
    }

    public String createEntry(String username, String title, String body) {
        return diaryServices.createEntry(username, title, body);
    }

    public String deleteDiary(String username) {
        return diaryServices.deleteDiaryById(username);
    }

    public long getNumberOfRegisteredDiaries() {
        return diaryServices.countNumberOfDiaries();
    }
}
