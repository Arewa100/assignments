package repositories;

import models.Diary;

import java.util.List;

public class DiaryRepository implements DiaryRepositoryImpl {
    @Override
    public Diary add(Diary diary) {
        return null;
    }

    @Override
    public List<Diary> findByiId(String userName) {
        return List.of();
    }

    @Override
    public List<Diary> findByTitle(String title) {
        return List.of();
    }

    @Override
    public void delete(Diary diary) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public long count() {
        return 0;
    }
}
