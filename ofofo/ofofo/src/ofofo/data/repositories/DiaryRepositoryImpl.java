package repositories;

import models.Diary;

import java.util.List;

public interface DiaryRepositoryImpl {
    void save(Diary diary);
    List<Diary> findByiId(String userName);
    List<Diary> findByTitle(String title);
    void delete(Diary diary);
    void delete(int id);
    int count();
}

