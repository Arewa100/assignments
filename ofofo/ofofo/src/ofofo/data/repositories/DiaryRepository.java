package repositories;

import models.Diary;

import java.util.List;

public interface DiaryRepository {
    void save(Diary diary);
    Diary findById(String userName);
    List<Diary> findAll();
    void delete(Diary diary);
    void delete(String diaryId);
    long count();
    Diary createDiary(String username, String password);
}

