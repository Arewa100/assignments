package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FacultyOfArtsTest {

    @Test
    public void test_That_Faculty_Of_Arts_Exists() {
        assertNotNull(new FacultyOfArts());
    }

    @Test
    public void test_That_Faculty_Of_Arts_Inherits_From_EmployeeDetail() {
       FacultyOfArts facultyOfArts = new FacultyOfArts();
       facultyOfArts.setPhoneNumber("999");
       assertEquals("999", facultyOfArts.getContact());
    }
}
