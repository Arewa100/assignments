package repositories;

import models.Diary;

import java.util.List;

public class DiaryRepository implements DiaryRepositoryImpl {
    private int count = 0;

    @Override
    public void save(Diary diary) {
        count++;
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
    public int count() {
        return count;
    }
}
