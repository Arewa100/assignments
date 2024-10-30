package ofofoTest;

import models.Diary;
import org.junit.jupiter.api.Test;
import repositories.DiaryRepository;
import repositories.RepositoryForDiary;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DiaryTest {
    private final DiaryRepository diaryRepository = new RepositoryForDiary();

    @Test
    public void testThatDiaryRepositoryIsEmpty() {
        assertEquals(0, diaryRepository.count());
    }

    @Test
    public void test_To_Save_Diary_To_Repository_Number_Of_Diary_Saved_Is_One() {
        Diary diary = new Diary("Miracle", "correctPassword");
        diaryRepository.save(diary);
        assertEquals(1, diaryRepository.count());
    }
    @Test
    public void test_To_Save_Diary_To_Repository_Number_Of_Diary_Saved_Is_Two() {
        Diary diary = new Diary("Miracle", "correctPassword");
        Diary secondDiary = new Diary("Gabriel", "correctPassword");
        diaryRepository.save(diary);
        diaryRepository.save(secondDiary);
        assertEquals(2, diaryRepository.count());
    }

    @Test
    public void test_To_Save_To_Diary_Repository_And_Find_Diary_By_UserName() {
        Diary diary = new Diary("Miracle", "correctPassword");
        diaryRepository.save(diary);
        assertEquals(1, diaryRepository.count());
        Diary foundDiary = diaryRepository.findById("Miracle");
        assertEquals("Miracle", foundDiary.getUserName());
    }

    @Test
    public void test_To_Save_ThreeDiaryAndGetOneByUserName() {
        Diary diary = new Diary("Miracle", "correctPassword");
        Diary secondDiary = new Diary("Gabriel", "correctPassword");
        Diary thirdDiary = new Diary("Joseph", "correctPassword");
        diaryRepository.save(diary);
        diaryRepository.save(secondDiary);
        diaryRepository.save(thirdDiary);
        assertEquals(3, diaryRepository.count());
        Diary foundDiary = diaryRepository.findById("Joseph");
        assertEquals("Joseph", foundDiary.getUserName());
    }

    @Test
    public void test_To_SearchForADiaryThatDoesNotExist_OutPut_IsNull() {
        Diary diary = new Diary("Miracle", "correctPassword");
        diaryRepository.save(diary);
        assertNull(diaryRepository.findById("Mike"));
    }

    @Test
    public void test_That_Diary_Can_Be_Deleted_By_UserName() {
        Diary diary = new Diary("Miracle", "correctPassword");
        diaryRepository.save(diary);
        assertEquals(1, diaryRepository.count());
        diaryRepository.delete("Miracle");
        assertNull(diaryRepository.findById("Miracle"));
    }

    @Test
    public void test_To_Find_Deleted_Diary_By_UserName_Result_Is_Null() {
        Diary diary = new Diary("Miracle", "correctPassword");
        Diary newDiary = new Diary("John", "correctPassword");
        diaryRepository.save(diary);
        diaryRepository.save(newDiary);
        assertEquals(2, diaryRepository.count());
        diaryRepository.delete("Miracle");
        assertNull(diaryRepository.findById("Miracle"));
    }

    @Test
    public void test_That_Diary_Can_Be_Deleted_By_Diary_As_Argument() {
        Diary diary = new Diary("Miracle", "correctPassword");
        diaryRepository.save(diary);
        assertEquals(1, diaryRepository.count());
        diaryRepository.delete(diary);
        assertEquals(0, diaryRepository.count());
        assertNull(diaryRepository.findById("Miracle"));
    }
}
