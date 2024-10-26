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
    public void test_To_Add_Diary_To_Repository_Number_Of_Diary_Saved_Is_One() {
        Diary diary = new Diary("Miracle", "correctPassword");
        diaryRepository.save(diary);
        assertEquals(1, diaryRepository.count());
    }



}
