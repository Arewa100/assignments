package controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.DiaryExceptions;

import static org.junit.jupiter.api.Assertions.*;

    public class DiaryControllersTest {
        private DiaryControllers diaryControllers;

        @BeforeEach
        public void seTup() {
            diaryControllers = new DiaryControllers();
        }
        @Test
        public void testThatDiaryControllerCanRegisterADiary() {
            assertEquals("diary registered successfully", diaryControllers.register("miracle", "password"));
        }

        @Test
        public void testToRegisterAnExistingDiary_ExceptionIsThrown() {
            assertEquals("diary registered successfully", diaryControllers.register("miracle", "password"));
            assertThrows(DiaryExceptions.class, ()->diaryControllers.register("miracle", "password"));
        }

        @Test
        public void testToRegisterTwoDiaryAndDeleteOne_Result_Is_DiaryDeletedSuccessfully() {
            diaryControllers.register("Miracle", "password");
            diaryControllers.register("Sarah", "password");
            assertEquals(2, diaryControllers.getNumberOfRegisteredDiaries());
            assertEquals("diary deleted successfully" , diaryControllers.deleteDiary("Miracle"));
            assertEquals(1, diaryControllers.getNumberOfRegisteredDiaries());
        }

        @Test
        public void testToDeleteADiaryThatDoesNotExist_ExceptionIsThrown() {
            diaryControllers.register("Miracle", "password");
            diaryControllers.register("Sarah", "password");
            assertEquals(2, diaryControllers.getNumberOfRegisteredDiaries());
            assertEquals("diary deleted successfully" , diaryControllers.deleteDiary("Miracle"));
            assertEquals(1, diaryControllers.getNumberOfRegisteredDiaries());
            assertThrows(DiaryExceptions.class, ()-> diaryControllers.deleteDiary("Miracle"));
        }

        @Test
        public void testToCreateEntryWhenUserIsNotLoggedIn_ExceptionThrown() {
            diaryControllers.register("Miracle", "password");
            assertThrows(DiaryExceptions.class, ()-> diaryControllers.createEntry("Miracle", "newTitle", "newBody"));
        }

        @Test
        public void testToLoginDiary_DiaryLoggedInSuccessfully() {
            diaryControllers.register("Miracle", "password");
            assertEquals("login successful", diaryControllers.login("Miracle", "password"));
        }

        @Test
        public void testThatToCreateEntryWhenDiaryIsLoggedIn_Entry_Created_successfully() {
            diaryControllers.register("Miracle", "password");
            assertEquals("login successful", diaryControllers.login("Miracle", "password"));
            assertEquals("entry created successfully" , diaryControllers.createEntry("Miracle", "newTitle", "newBody"));
        }

        @Test
        public void testToLogoutDiaryWhenDiaryIsNotLoggedIn_DiaryLoggedInSuccessfully() {
            diaryControllers.register("Miracle", "password");
            assertThrows(DiaryExceptions.class, ()-> diaryControllers.logout("Miracle"));
        }

        @Test
        public void test_To_log_In_DiaryAnd_logoutDiary_diaryLoggedOutSuccessfully() {
            diaryControllers.register("Miracle", "password");
            assertEquals("login successful", diaryControllers.login("Miracle", "password"));
            assertEquals("logout successful", diaryControllers.logout("Miracle"));
        }

}