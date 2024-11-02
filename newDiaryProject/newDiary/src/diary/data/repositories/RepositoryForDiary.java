package data.repositories;

import data.models.Diary;

import java.util.ArrayList;
import java.util.List;

public class RepositoryForDiary implements DiaryRepository {
    private final List<Diary> diaries = new ArrayList<>();

    @Override
    public void save(Diary diary) {
        diaries.add(diary);
    }

    @Override
    public boolean existsById(String id) {
        for (Diary diary : diaries) {
          if(diaryExists(diary, id)) return true;
        }
        return false;
    }

    private boolean diaryExists(Diary diary, String diaryId) {
        return diary.getUserName().equals(diaryId);
    }

    @Override
    public Diary findById(String id) {
        for(Diary diary : diaries) {
            if(diaryExists(diary, id)) return diary;
        }
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void delete(Diary diary) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public long count() {
        return diaries.size();
    }
}
