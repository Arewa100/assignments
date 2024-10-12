package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    public void test_That_LinkedList_Is_Empty() {
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.isEmpty());
    }
    @Test
    public void test_That_Data_Can_Be_Added_To_A_LinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        assertEquals(20, linkedList.front().getData());
    }

    @Test
    public void test_To_Insert_2_Data_To_A_LinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        assertEquals(20, linkedList.front().getData());
        linkedList.insert(30);
        assertEquals(30, linkedList.back().getData());
    }

    @Test
    public void test_To_Insert_Two_Data_To_A_List_And_Confirm_If_The_First_Node_Contains_Address_Of_The_Second_Node() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        linkedList.insert(30);
        assertEquals(30, linkedList.front().getLinkedNode().getData());
    }

    @Test
    public void test_To_Insert_Three_Data_To_A_List_And_Confirm_If_The_Each_Node_Contains_Address_Of_The_Next_Node() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        assertEquals(40, linkedList.front().getLinkedNode().getLinkedNode().getData());
    }

    @Test
    public void test_To_Check_The_Number_Of_Item_In_A_Linked_List() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        assertEquals(3, linkedList.size());
    }
    @Test
    public void test_To_insert_Data_To_List_At_A_Required_Address() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        assertEquals(3, linkedList.size());
        linkedList.insertAt(1, 71);
        assertEquals(4, linkedList.size());

    }

    @Test
    public void test_To_Add_Three_Item_Delete_1_Item_And_Expecting_Two() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        assertEquals(3, linkedList.size());
        linkedList.deleteNode(1);
        assertEquals(2, linkedList.size());
    }

    @Test
    public void test_To_Add_Three_Item_Delete_2_Items_And_Expecting_Two() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        assertEquals(3, linkedList.size());
        linkedList.deleteNode(1);
        assertEquals(2, linkedList.size());
    }

    @Test
    public void test_To_Insert_Node_At_Start() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insertAtStart(50);
        assertEquals(50, linkedList.front().getData());
    }

    @Test
    public void test_To_Destroy_Linked_List() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        assertEquals(3, linkedList.size());
        linkedList.destroyList();
        assertTrue(linkedList.isEmpty());
    }


}
