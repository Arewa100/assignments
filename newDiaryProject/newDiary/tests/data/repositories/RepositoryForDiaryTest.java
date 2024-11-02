package data.repositories;

import data.models.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RepositoryForDiaryTest {
    private DiaryRepository diaryRepository;

    @BeforeEach
    public void setUp() {
        diaryRepository = new RepositoryForDiary();
    }

    @Test
    public void testThatDiaryRepositoryIsEmpty_Count_Is_Zero() {
        assertEquals(0, diaryRepository.count());
    }

    @Test
    public void testToAddOneDiaryToRepository_Count_Is_One() {
        Diary diary = new Diary();
        assertEquals(0, diaryRepository.count());
        diaryRepository.save(diary);
        assertEquals(1, diaryRepository.count());

    }
    @Test
    public void testToAddOneDiaryToRepository_Count_Is_Two() {
        Diary diary = new Diary();
        diaryRepository.save(diary);
        Diary diaryTwo = new Diary();
        diaryRepository.save(diaryTwo);
        assertEquals(2, diaryRepository.count());
    }

    @Test
    public void testToAddDiaryToRepository_AndCheckIf_It_Exists_ById_Result_Is_True() {
        Diary diary = new Diary();
        diary.setUserName("Sarah");
        diary.setPassword("password");
        Diary diaryTwo = new Diary();
        diaryTwo.setUserName("Micheal");
        diaryTwo.setPassword("password");
        diaryRepository.save(diary);
        diaryRepository.save(diaryTwo);
        assertEquals(2, diaryRepository.count());
        assertTrue(diaryRepository.existsById("Sarah"));
    }

    @Test
    public void testToAdd_2_Diaries_And_Search_A_Diary_That_IsNotAdded_Result_Is_False() {
        Diary diary = new Diary();
        diary.setUserName("Sarah");
        diary.setPassword("password");
        Diary diaryTwo = new Diary();
        diaryTwo.setUserName("Micheal");
        diaryTwo.setPassword("password");
        diaryRepository.save(diary);
        diaryRepository.save(diaryTwo);
        assertEquals(2, diaryRepository.count());
        assertFalse(diaryRepository.existsById("gift"));
    }

    @Test
    public void testToAdd_2_DiaryAndFindDiaryById() {
        Diary diary = new Diary();
        diary.setUserName("Sarah");
        diary.setPassword("password");
        Diary diaryTwo = new Diary();
        diaryTwo.setUserName("Micheal");
        diaryTwo.setPassword("password");
        diaryRepository.save(diary);
        diaryRepository.save(diaryTwo);
        assertEquals(2, diaryRepository.count());
        Diary foundDiary = diaryRepository.findById("Sarah");
        assertEquals("Sarah", foundDiary.getUserName());
    }
    @Test
    public void testToAdd_2_DiaryAndFindSecond_DiaryById() {
        Diary diary = new Diary();
        diary.setUserName("Sarah");
        diary.setPassword("password");
        Diary diaryTwo = new Diary();
        diaryTwo.setUserName("Micheal");
        diaryTwo.setPassword("password");
        diaryRepository.save(diary);
        diaryRepository.save(diaryTwo);
        assertEquals(2, diaryRepository.count());
        Diary foundDiary = diaryRepository.findById("Micheal");
        assertEquals("Micheal", foundDiary.getUserName());
    }

    @Test
    public void testToFindADiaryThatDoesNotExist_Result_Is_Null() {
        Diary diary = new Diary();
        diary.setUserName("Sarah");
        diary.setPassword("password");
        diaryRepository.save(diary);
        assertEquals(1, diaryRepository.count());
        assertNull(diaryRepository.findById("Micheal"));
    }

    


}