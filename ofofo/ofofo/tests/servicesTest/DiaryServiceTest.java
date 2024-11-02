package servicesTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.DiaryServices;
import services.DiaryServicesImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryServiceTest {
    private DiaryServices diaryServices;
    @BeforeEach
    public void setUp() {
        diaryServices = new DiaryServicesImpl();
    }
    @Test
    public void testThatTheresNo_RegisteredDiary_No_Of_RegisteredDiaryIsZero() {
        assertEquals(0, diaryServices.numberOfRegisteredDiaries());
    }

    @Test
    public void testToRegisterADiary_No_Of_RegisteredDiaryIsOne() {
        String feedback = diaryServices.registerDiary("firstUser", "firstUserPassword");
        assertEquals("diary registered successfully...", feedback);
        assertEquals(1, diaryServices.numberOfRegisteredDiaries());
    }

    @Test
    public void testToRegisterTwoDiary_No_Of_RegisteredDiaryIsTwo() {
        String firstFeedBack = diaryServices.registerDiary("firstUser", "firstUserPassword");
        String SecondFeedBack = diaryServices.registerDiary("secondUser", "secondUserPassword");
        assertEquals("diary registered successfully...", firstFeedBack);
        assertEquals("diary registered successfully...", SecondFeedBack);
        assertEquals(2, diaryServices.numberOfRegisteredDiaries());
    }

    @Test
    public void testToRegisterDiaryWithSameUserName_No_Of_RegisteredDiaryIsOne() {
        String feedback = diaryServices.registerDiary("firstUser", "firstUserPassword");
        String secondFeedBack = diaryServices.registerDiary("firstUser", "secondUserPassword");
        assertEquals("diary registered successfully...", feedback);
        assertEquals("registration failed. username exists...", secondFeedBack);
        assertEquals(1, diaryServices.numberOfRegisteredDiaries());
    }

    @Test
    public void testToRegisterThreeDiaryWithSameUserName_No_Of_RegisteredDiaryIsOne() {
        String feedback = diaryServices.registerDiary("firstUser", "firstUserPassword");
        String secondFeedBack = diaryServices.registerDiary("firstUser", "secondUserPassword");
        String thirdFeedBack = diaryServices.registerDiary("firstUser", "secondUserPassword");
        assertEquals("diary registered successfully...", feedback);
        assertEquals("registration failed. username exists...", secondFeedBack);
        assertEquals("registration failed. username exists...", thirdFeedBack);
        assertEquals(1, diaryServices.numberOfRegisteredDiaries());
    }


//    @Test
//    public void testT    // this is where i am
//    @Test
//    public void testForDiaryToCreateEntryWhenDiaryIsNotLoggedIn() {
//        String feedback = diaryServices.registerDiary("firstUser", "firstUserPassword");
//        assertEquals("diary registered successfully...", feedback);
//        assertThrows(IllegalAccessException.class, ()-> f)
//    }

}
