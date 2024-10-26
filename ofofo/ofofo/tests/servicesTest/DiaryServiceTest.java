package servicesTest;

import models.Diary;
import org.junit.jupiter.api.Test;
import services.DiaryServices;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryServiceTest {

    @Test
    public void testThatDiaryServiceCanRegister_A_User() {
        DiaryServices diaryServices = new DiaryServices();
        String message = diaryServices.registerUser("Shola", "correctPassword");
        assertEquals("user registered successfully...", message);
    }

    @Test
    public void testThatDiaryServiceCanRegister_A_Diary() {

    }
}
