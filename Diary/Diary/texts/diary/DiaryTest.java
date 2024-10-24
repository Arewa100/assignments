package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;
    @BeforeEach
    public void setUp() {
        diary = new Diary("correctPassword");
    }
    @Test
    public void test_That_Diary_IsUnLocked() {
        assertFalse(diary.isLocked());
    }

    @Test
    public void test_That_Diary_CanBeLocked() {
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }

    @Test
    public void test_That_Diary_CanBeUnlocked() {
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("correctPassword");
        assertFalse(diary.isLocked());
    }

    @Test
    public void test_That_Diary_CanNotUnlocked_WithAWrongPassword() {
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("wrongPassword");
        assertTrue(diary.isLocked());
    }

    @Test
    public void test_That_Diary_IsEmpty() {
        diary.lock();
        diary.unlock("correctPassword");
        assertTrue(diary.isEmpty());
    }

    @Test
    public void test_That_When_WeAddItemToDiary_It_Is_Not_Empty() {
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("correctPassword");
        assertFalse(diary.isLocked());
        diary.createEntry("Title1", "Ola to School");
        assertFalse(diary.isEmpty());
    }

    @Test
    public void test_That_Entries_CanNotBeAddedToDiaryWhenItIsLocked() {
        diary.lock();
        assertTrue(diary.isLocked());
        diary.createEntry("Title1", "Ola to School");
        assertTrue(diary.isEmpty());
    }
}
