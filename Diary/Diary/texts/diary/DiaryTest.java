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
    @Test
    public void test_To_AddEntryAndCheck_The_Total_NumberOfEntries() {
        diary.lock();
        diary.unlock("correctPassword");
        diary.createEntry("Title1", "Ola to School");
        assertEquals(1, diary.getNumberOfEntry());
        diary.createEntry("Title2", "Ola to church");
        assertEquals(2, diary.getNumberOfEntry());
    }

    @Test
    public void test_ToAdd_One_Entry_And_Find_The_Entry() {
        diary.lock();
        diary.unlock("correctPassword");
        diary.createEntry("Title1", "Ola to School");
        Entry savedEntry = diary.findEntryById(1);
        assertEquals("Title1: Ola to School", savedEntry.toString());
    }

    @Test
    public void test_To_Add_Two_Entries_And_FindEntries_By_Id() {
        diary.lock();
        diary.unlock("correctPassword");
        diary.createEntry("title1", "Ola to School");
        diary.createEntry("title2", "Eze goes to church");

        Entry savedEntry = diary.findEntryById(1);
        assertEquals("title1: Ola to School", savedEntry.toString());

        Entry savedEntryTwo = diary.findEntryById(2);
        assertEquals("title2: Eze goes to church", savedEntryTwo.toString());
    }

    @Test
    public void testTo_Find_Entry_That_Does_Not_Exist() {
        diary.lock();
        diary.unlock("correctPassword");
        diary.createEntry("title1", "Ola to School");
        Entry savedEntry = diary.findEntryById(2);
        assertNull(savedEntry);
    }

    @Test
    public void test_That_Entry_Can_Be_Updated() {
        diary.lock();
        diary.unlock("correctPassword");
        diary.createEntry("title1", "Ola to School");
        Entry savedEntry = diary.findEntryById(1);
        assertEquals("title1: Ola to School", savedEntry.toString());
        diary.update(1, "newTitle", "The burning grass");
        Entry newSavedEntry = diary.findEntryById(1);
        assertEquals("newTitle: The burning grass", newSavedEntry.toString());

    }
//    @Test
//    public void testToDeleteEntryWhenDiaryIsEmpty() {
//        diary.lock();
//        diary.unlock("correctPassword");
//        assertTrue(diary.isEmpty());
//        diary.deleteEntry(id);
//        assertThrows( NullPointerException.class, () -> diary.findEntryById(1));
//    }


}
