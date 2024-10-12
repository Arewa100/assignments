package LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LinkedListTest {

    @Test
    public void test_That_Data_Can_Be_Added_To_A_LinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        assertEquals(20, linkedList.getLastData());
    }

    @Test
    public void test_That_Add_2_Data_To_A_LinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        assertEquals(20, linkedList.getLastData());
        linkedList.insert(30);
        assertEquals(30, linkedList.getLastData());
    }

    @Test
    public void test_To_Add_Two_Data_To_A_List_And_Confirm_If_The_First_Node_Contains_Address_Of_The_Second_Node() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        linkedList.insert(30);
        assertEquals(30, linkedList.getLastNode().getLinkedNode().getData());
    }

    

}
