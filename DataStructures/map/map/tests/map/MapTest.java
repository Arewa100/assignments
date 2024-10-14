package map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {
    @Test
    public void test_That_Map_Is_Empty() {
         Map<String> map = new Map<>(10);
         assertEquals(0, map.size());
    }
    @Test
    public void test_That_To_Insert_Key_Value_Pair_To_Empty_Map() {
        Map<String> map = new Map<>(10);
        assertEquals(0, map.size());
         map.insert("firstName", "Arewaking");
        assertEquals(1, map.size());
    }

    @Test
    public void test_To_Add_Two_Pairs_In_The_Map_And_Get_A_Particular_Value_By_Key() {
        Map<String> map = new Map<>(10);
        map.insert("North", "Kogi");
        map.insert("West", "lagos");
        assertEquals(2, map.size());
        assertEquals("lagos", map.get("West"));
    }

    @Test
    public void test_That_Key_Is_Present_In_The_Map() {
        Map<String> map = new Map<>(10);
        map.insert("North", "Kogi");
        map.insert("West", "lagos");
        assertTrue(map.contains("North"));
        assertEquals(2, map.size());
    }

    @Test
    public void test_That_Key_Is_Not_Present_In_The_Map() {
        Map<String> map = new Map<>(10);
        map.insert("North", "Kogi");
        map.insert("West", "lagos");
        assertFalse(map.contains("East"));
        assertEquals(2, map.size());
    }

    @Test
    public void test_To_Get_Value_Stored_In_A_Key() {
        Map<String> map = new Map<>(10);
        map.insert("North", "Kogi");
        map.insert("West", "lagos");
        map.insert("Name", "Arewaking");
        assertEquals("Arewaking", map.get("Name"));
    }

    @Test
    public void test_To_Insert_Pair_Of_Same_Key_To_Map_One_Pair_Should_Only_Be_Inserted() {
        Map<String> map = new Map<>(10);
        map.insert("North", "Kogi");
        map.insert("North", "Nasarrawa");
        assertEquals(1, map.size());
    }
    @Test
    public void test_To_UpDate_Value_Associated_With_A_Key() {
        Map<String> map = new Map<>(10);
        map.insert("North", "Kogi");
        map.insert("West", "Lagos");
        map.update("North", "Kastina");
        assertEquals("Kastina", map.get("North"));
        assertEquals(2, map.size());
    }

    @Test
    public void test_To_Delete_Key_Value_Pair_Of_A_Map() {
        Map<String> map = new Map<>(10);
        map.insert("North", "Kogi");
        map.insert("West", "lagos");
        map.insert("king", "Arewaking");
        map.insert("queen", "Jenifer");
        map.insert("prince", "Caleb");
        map.delete("queen");
        assertEquals(4, map.size());
    }

    @Test
    public void test_To_Delete_Key_Value_Pair_And_Get_The_Value_Of_A_Pair() {
        Map<String> map = new Map<>(10);
        map.insert("North", "Kogi");
        map.insert("West", "lagos");
        map.insert("king", "Arewaking");
        map.delete("West");
        assertEquals("Arewaking", map.get("king"));

    }

//    @Test
//    public void test_That_Map_Expands_Size_When_It_Is_Full() {
//        Map<String> map = new Map<>(10);
//        for (int index = 1; index <= 10; index++) {
//            map.insert("key"+index, "Kogi");
//        }
//        assertEquals(10, map.size());
//        map.insert("newKey", "football");
//        assertEquals("football", map.get("newKey"));
//    }

}
