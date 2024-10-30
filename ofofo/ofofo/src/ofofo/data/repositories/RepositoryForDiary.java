package repositories;

import models.Diary;

import java.util.ArrayList;
import java.util.List;

public class RepositoryForDiary implements DiaryRepository{
    private int count = 0;
    private final List<Diary> diaries = new ArrayList<>();

    @Override
    public void save(Diary diary) {
        diaries.add(diary);
        count++;
    }

    @Override
    public Diary findById(String userName) {
        for (Diary diary : diaries) {
            if(userNameAndIdIsEqual(diary, userName)) return diary;
        }
        return null;
    }

    private boolean userNameAndIdIsEqual(Diary diary, String userName) {
        return  (diary.getUserName().equals(userName));
    }

    @Override
    public void delete(Diary diary) {
        for (int index = 0; index < diaries.size(); index++) {
            Diary currentdDiary = diaries.get(index);
            if(diaryIsEqualToDiary(currentdDiary, diary)) diaries.remove(diary);
            count--;
        }
    }

    private boolean diaryIsEqualToDiary(Diary currentDiary, Diary diary) {
        return currentDiary.getUserName().equals(diary.getUserName());
    }

    @Override
    public void delete(String id) {
        for (int index = 0; index < diaries.size(); index++) {
            Diary diary = diaries.get(index);
            if(userNameAndIdIsEqual(diary, id)) diaries.remove(diary);
            count--;
        }
    }

    @Override
    public long count() {
        return count;
    }
}
