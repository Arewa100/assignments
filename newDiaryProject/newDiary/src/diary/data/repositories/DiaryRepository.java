package data.repositories;

import data.models.Diary;

public interface DiaryRepository {
    void save(Diary diary);
    boolean existsById(String id);
    Diary findById(String id);
    void deleteById(String id);
    void delete(Diary diary);
    void deleteAll();
    long count();
}
