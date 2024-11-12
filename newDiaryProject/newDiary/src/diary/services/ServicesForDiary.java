package services;

import data.models.Diary;
import data.models.Entry;
import data.repositories.DiaryRepository;
import data.repositories.RepositoryForDiary;

import java.util.List;

public class ServicesForDiary implements DiaryServices {
    private final DiaryRepository diaryRepository = new RepositoryForDiary();
    private  EntryServices entryServices=  new ServicesForEntry();
    private long numberOfRegisteredDiary;

    @Override
    public String registerUser(String username, String password) {
        if (diaryRepository.existsById(username)) throw new DiaryExceptions("registration failed. user exists...");
        createNewDiary(username, password);
        return "diary registered successfully";
    }


    private Diary createNewDiary(String username, String password) {
        Diary diary = new Diary();
        diary.setUserName(username);
        diary.setPassword(password);
        diaryRepository.save(diary);
        numberOfRegisteredDiary++;
        return diary;
    }

    @Override
    public String loginUser(String username, String password) {
        findDiaryById(username).setLocked(false);
        return "login successful";
    }

    @Override
    public String logoutUser(String username) {
        findDiaryById(username).setLocked(true);
        return "logout successful";
    }

    @Override
    public Diary findDiaryById(String username) {
        if(diaryRepository.findById(username) == null ) throw new DiaryExceptions("diary not found");
        return diaryRepository.findById(username);
    }

    @Override
    public void createEntry(String username, String title, String body) {
        validateIfUserExists(username);
        validateIfDiaryIsLoggedIn(username);
        entryServices.createEntry(username, title, body,generateEntryCount(username) + 1);
        diaryRepository.findById(username).setLastEntryCount(generateEntryCount(username) + 1);
    }

    @Override
    public String deleteDiaryById(String username) {
        if(diaryRepository.findById(username) == null ) throw new DiaryExceptions("diary not found");
        diaryRepository.deleteById(username);
        numberOfRegisteredDiary--;
        return "diary deleted successfully";
    }

    private long generateEntryCount(String username) {
        return diaryRepository.findById(username).getLastEntryCount();
    }

    private void validateIfUserExists(String username) {
        if(!diaryRepository.existsById(username)) throw new DiaryExceptions("creation failed. user does not exist...");
    }

    private void validateIfDiaryIsLoggedIn(String username) {
        if(diaryRepository.findById(username).isLocked()) throw new DiaryExceptions("cannot create entry, login");
    }

    @Override
    public long countNumberOfDiaries() {
        return numberOfRegisteredDiary;
    }

}
