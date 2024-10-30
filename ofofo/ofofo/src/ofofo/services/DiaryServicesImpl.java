package services;

import models.Diary;
import repositories.DiaryRepository;
import repositories.RepositoryForDiary;

public class DiaryServicesImpl implements DiaryServices {
    private final DiaryRepository diaryRepository = new RepositoryForDiary();
    private long numberOfRegisteredDiaries;

    @Override
    public String registerDiary(String userName, String password) {
        if(userNameDoesNotExist(userName)) {
            saveAndIncrementNumberOfRegisteredDiary(userName, password);
            return "diary registered successfully...";
        };
        return "registration failed. username exists...";
    }

    private void saveAndIncrementNumberOfRegisteredDiary(String userName, String password) {
        diaryRepository.save(diaryRepository.createDiary(userName, password));
        numberOfRegisteredDiaries++;
    }

    private boolean userNameDoesNotExist(String userName) {
        for (Diary diary : diaryRepository.findAll()) {
            boolean diaryUserNameExists = diary.getUserName().equals(userName);
            if (diaryUserNameExists) {
                return false;
            }
        }
        return true;
    }


    @Override
    public String loginDiary(String userName, String password) {
        return "";
    }

    @Override
    public String logoutDiary() {
        return "";
    }

    @Override
    public void createEntry(String title, String body) {

    }

    @Override
    public String findEntry(int entryId) {
        return "";
    }

    @Override
    public String viewAllEntry() {
        return "";
    }

    @Override
    public void updateEntry(String title, String body) {

    }

    @Override
    public String deleteEntry(int id) {
        return "";
    }

    @Override
    public long numberOfRegisteredDiaries() {
        return numberOfRegisteredDiaries;
    }
}
