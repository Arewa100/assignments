package ofofoTest;

import models.Diary;
import org.junit.jupiter.api.Test;
import repositories.DiaryRepository;
import repositories.DiaryRepositoryImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {
    private final DiaryRepository diaryRepository = new DiaryRepository();

    @Test
    public void testThDiaryRepositoryIsEmpty() {
        assertEquals(0, diaryRepository.count());
    }

    @Test
    public void test_That_When_WeAddTo_Diary_It_Is_Not_Empty() {
        assertEquals(0, diaryRepository.count());
        Diary diary = new Diary();
        diaryRepository.add(diary);
        assertEquals(1, diaryRepository.count());

    }
}
