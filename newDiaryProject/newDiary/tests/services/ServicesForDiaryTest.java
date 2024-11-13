package services;

import data.models.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicesForDiaryTest {
    private DiaryServices diaryServices;
    @BeforeEach
    public void setUp() {
        diaryServices = new ServicesForDiary();
    }
    @Test
    public void testToRegisterUser_Diary_is_Created(){
        diaryServices.registerUser("Sarah", "password");
        assertEquals(1, diaryServices.countNumberOfDiaries());

    }

    @Test
    public void testToRegisterUserThatExists_UserExistException_Thrown() {
        diaryServices.registerUser("Sarah", "password");
        assertThrows(DiaryExceptions.class, ()-> diaryServices.registerUser("Sarah", "password"));
        assertEquals(1, diaryServices.countNumberOfDiaries());
    }

    @Test
    public void testToCreateEntryWhenDiaryIsNotLoggedIn() {
        diaryServices.registerUser("Sarah", "password");
        assertEquals(1, diaryServices.countNumberOfDiaries());
        assertThrows(DiaryExceptions.class, ()-> diaryServices.createEntry("Sarah", "titleOne", "bodyOne"));
    }

    @Test
    public void testToLoginDiary() {
        diaryServices.registerUser("Sarah", "password");
        assertEquals("login successful", diaryServices.loginUser("Sarah", "password"));
    }

    @Test
    public void testThatDiaryCanLogoutWhenItIsLoggedIn() {
        diaryServices.registerUser("Sarah", "password");
        assertEquals("login successful", diaryServices.loginUser("Sarah", "password"));
        assertEquals("logout successful", diaryServices.logoutUser("Sarah"));
    }

    @Test
    public void testToRegisterOneDiaryAndFindDiaryByUserName_DiaryIsReturned() {
        diaryServices.registerUser("Sarah", "password");
        assertEquals("Sarah", diaryServices.findDiaryById("Sarah").getUserName());
    }

    @Test
    public void testToRegisterTwoDiaryAndFindByUserName_DiaryIsReturned() {
        diaryServices.registerUser("Sarah", "password");
        diaryServices.registerUser("Victor", "password");
        assertEquals("Sarah", diaryServices.findDiaryById("Sarah").getUserName());
        assertEquals("Victor", diaryServices.findDiaryById("Victor").getUserName());
    }
    @Test
    public void testThatToCreateEntryWhenDiaryIsLoggedIn() {
        diaryServices.registerUser("Sarah", "password");
        assertEquals("login successful", diaryServices.loginUser("Sarah", "password"));
        assertEquals(0, diaryServices.findDiaryById("Sarah").getLastEntryCount());
        diaryServices.createEntry("Sarah", "titleOne", "bodyOne");
        assertEquals(1, diaryServices.findDiaryById("Sarah").getLastEntryCount());
    }

    @Test
    public void testToCreateEntryWhenDiaryIsLoggedOut() {
        diaryServices.registerUser("Sarah", "password");
        assertEquals("login successful", diaryServices.loginUser("Sarah", "password"));
        assertEquals(0, diaryServices.findDiaryById("Sarah").getLastEntryCount());
        assertEquals("entry created successfully", diaryServices.createEntry("Sarah", "titleOne", "bodyOne"));
        assertEquals(1, diaryServices.findDiaryById("Sarah").getLastEntryCount());
        assertEquals("logout successful", diaryServices.logoutUser("Sarah"));
        assertThrows(DiaryExceptions.class, ()-> diaryServices.createEntry("Sarah", "titleOne", "bodyOne"));
    }

    @Test
    public void testToCreateThreeEntries_LastEntryCountIsThree() {
        diaryServices.registerUser("Sarah", "password");
        assertEquals("login successful", diaryServices.loginUser("Sarah", "password"));
        diaryServices.createEntry("Sarah", "titleOne", "bodyOne");
        diaryServices.createEntry("Sarah", "titleTwo", "bodyTwo");
        diaryServices.createEntry("Sarah", "titleThree", "bodyThree");
        assertEquals(3, diaryServices.findDiaryById("Sarah").getLastEntryCount());
    }

    @Test
    public void testToCreateDiary_And_DeleteTheDiary_DiaryDeletedSuccessfully() {
        diaryServices.registerUser("Sarah", "password");
        assertEquals(1, diaryServices.countNumberOfDiaries());
        assertEquals("Sarah", diaryServices.findDiaryById("Sarah").getUserName());
        assertEquals("diary deleted successfully", diaryServices.deleteDiaryById("Sarah"));
        assertThrows(DiaryExceptions.class, ()-> diaryServices.findDiaryById("Sarah"));
        assertEquals(0, diaryServices.countNumberOfDiaries());
    }

    @Test
    public void test_to_Delete_A_DiaryThatDoesNotExist() {
        diaryServices.registerUser("Sarah", "password");
        assertEquals(1, diaryServices.countNumberOfDiaries());
        assertThrows(DiaryExceptions.class, ()-> diaryServices.deleteDiaryById("Micheal"));
    }
}