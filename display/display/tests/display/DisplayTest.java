package display;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class DisplayTest {
    @Test
    public void test_That_Display_Function_Exists() {
        assertNotNull(new Display());
    }

    @Test
    @DisplayName("test that display returns a three by three array")
    public void test_That_Display_Function_Can_Receive_An_Array_And_Return_An_Array() {
        int[][] arrayOfNumbers = {{1, 0, 0}, {0, 0, 0}, {0, 1, 0}};
        String[][] resultOfDisplay = {{"*", " ", " "}, {" ", " ", " "}, {" ", "*", " "}};
        assertArrayEquals(resultOfDisplay, Display.display(arrayOfNumbers));
    }

    @Test
    @DisplayName("display takes in an array and return * for 1 and blank for 0")
    public void test_Display_Takes_Array_Of_Numbers_And_Returns_Array_Of_String() {
        int[][] arrayOfNumbers = {{1, 0, 0}, {0, 0, 0}, {0, 1, 0}};
        String[][] resultOfDisplay = Display.display(arrayOfNumbers);
        assertEquals("*", resultOfDisplay[0][0]);
        assertEquals(" ", resultOfDisplay[0][1]);
        assertEquals(" ", resultOfDisplay[0][2]);
        assertEquals(" ", resultOfDisplay[1][0]);
        assertEquals(" ", resultOfDisplay[1][1]);
        assertEquals(" ", resultOfDisplay[1][2]);
        assertEquals(" ", resultOfDisplay[2][0]);
        assertEquals("*", resultOfDisplay[2][1]);
        assertEquals(" ", resultOfDisplay[2][2]);


    }
    @Test
    @DisplayName("test that input array length is three")
    public void test_That_Input_Array_Length_Is_Three() {
        int[][] arrayOfNumbers = {{1, 0, 0}, {0, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        assertThrows(IllegalArgumentException.class, ()-> Display.display(arrayOfNumbers));
    }
}