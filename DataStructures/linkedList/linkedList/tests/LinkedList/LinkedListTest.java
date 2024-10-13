package LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private LinkedList linkedList;
    @BeforeEach
    public void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    public void test_That_LinkedList_Is_Empty() {
        assertTrue(linkedList.isEmpty());
    }
    @Test
    public void test_That_Data_Can_Be_Added_To_A_LinkedList() {
        linkedList.insert(20);
        assertEquals(20, linkedList.front().getData());
    }

    @Test
    public void test_To_Insert_2_Data_To_A_LinkedList() {
        linkedList.insert(20);
        assertEquals(20, linkedList.front().getData());
        linkedList.insert(30);
        assertEquals(30, linkedList.back().getData());
    }

    @Test
    public void test_To_Insert_Two_Data_To_A_List_And_Confirm_If_The_First_Node_Contains_Address_Of_The_Second_Node() {
        linkedList.insert(20);
        linkedList.insert(30);
        assertEquals(30, linkedList.front().getLinkedNode().getData());
    }

    @Test
    public void test_To_Insert_Three_Data_To_A_List_And_Confirm_If_The_Each_Node_Contains_Address_Of_The_Next_Node() {
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        assertEquals(40, linkedList.front().getLinkedNode().getLinkedNode().getData());
    }

    @Test
    public void test_To_Check_The_Number_Of_Item_In_A_Linked_List() {
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        assertEquals(3, linkedList.size());
    }
    @Test
    public void test_To_insert_Data_To_List_At_A_Required_Address() {
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        assertEquals(3, linkedList.size());
        linkedList.insertAt(1, 71);
        assertEquals(4, linkedList.size());

    }

    @Test
    public void test_To_Add_Three_Item_Delete_1_Item_And_Expecting_Two() {
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        assertEquals(3, linkedList.size());
        linkedList.deleteNode(1);
        assertEquals(2, linkedList.size());
    }

    @Test
    public void test_To_Add_Three_Item_Delete_2_Items_And_Expecting_Two() {
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        assertEquals(3, linkedList.size());
        linkedList.deleteNode(1);
        assertEquals(2, linkedList.size());
    }

    @Test
    public void test_To_Insert_Node_At_Start() {
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insertAtStart(50);
        assertEquals(50, linkedList.front().getData());
    }

    @Test
    public void test_To_Destroy_Linked_List() {
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        assertEquals(3, linkedList.size());
        linkedList.destroyList();
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void test_To_Display_Data_Of_Component_In_A_linked_List() {
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        String expectedList = "[20, 30, 40]";
        String listResult = linkedList.display();
        assertEquals(expectedList, listResult);
    }

    @Test
    public void test_To_Search_If_An_Item_Is_In_A_Linked_List() {
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(33);
        linkedList.insert(18);
        linkedList.insert(10);
        assertTrue(linkedList.search(18));

    }

    @Test
    public void test_To_Search_If_An_Item_Is_not_In_A_Linked_List() {
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(33);
        linkedList.insert(18);
        linkedList.insert(10);
        assertFalse(linkedList.search(5));

    }

}
