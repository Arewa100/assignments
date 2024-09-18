package inheritance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeDetailTest {
    private EmployeeDetail employeeDetail;

    @BeforeEach
    public void setUp() {
        employeeDetail = new EmployeeDetail();
    }

    @Test
    public void test_That_Employee_Detail_Exists() {
        assertNotNull(new EmployeeDetail());
    }

    @Test
    @DisplayName("testing to set employees name")
    public void test_to_set_name_of_Employee_and_get_the_name_of_Employee() {
        employeeDetail.setName("Faith", "Chuks");
        assertEquals("Faith Chuks", employeeDetail.getName());
    }

    @Test
    @DisplayName("test to set phone number")
    public void test_To_Set_Phone_Number_Of_Employee() {
        employeeDetail.setName("Ola", "Jerry");
        assertEquals("Ola Jerry", employeeDetail.getName());
        employeeDetail.setPhoneNumber("09086112541");
        assertEquals("09086112541", employeeDetail.getContact());
    }

    @Test
    @DisplayName("test to set gender")
    public void test_To_Set_Gender_Of_Employee() {
        employeeDetail.setName("Miracle", "Olasoyin");
        assertEquals("Miracle Olasoyin", employeeDetail.getName());
        employeeDetail.setPhoneNumber("09086112841");
        assertEquals("09086112841", employeeDetail.getContact());
        employeeDetail.setGender("male");
        assertEquals("male", employeeDetail.getGender());
    }
    @Test
    @DisplayName("test toString method")
    public void test_toStringMethod() {
        employeeDetail.setName("Bola", "Fredrick");
        employeeDetail.setPhoneNumber("09086112841");
        employeeDetail.setGender("male");
        assertEquals("Name: Bola Fredrick, PhoneNumber: 09086112841, Gender: male", employeeDetail.toString());
    }
}