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
    public void test_That_We_Can_Add_Item_Entry_ToDiary() {
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("correctPassword");
        assertFalse(diary.isLocked());
        diary.createEntry("Title1", "Ola to School");
        assertEquals(1, diary.getNumberOfEntry());
    }
}
