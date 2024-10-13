package queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue<Integer> queue;
    @BeforeEach
    public void setUp() {
        queue = new Queue<>(10);
    }
    @Test
    public void test_That_Queue_Is_Empty() {
        assertTrue(queue.isEmptyQueue());
    }

    @Test
    public void test_That_Queue_Is_Full() {
        assertFalse(queue.isFullQueue());

    }
    @Test
    public void test_That_To_Add_One_Element_To_The_Queue() {
        queue.enQueue(5);
        assertFalse(queue.isEmptyQueue());
    }
    @Test
    public void test_To_Add_10_Element_To_The_Queue_And_Check_If_It_Is_Full() {
        for(int index = 1; index <= 10; index++) {
            queue.enQueue(index);
        }
        assertTrue(queue.isFullQueue());
    }

    @Test
    public void test_That_To_peek_One_Element_At_Front_The_Queue() {
        queue.enQueue(5);
        queue.enQueue(3);
        queue.enQueue(2);
        assertEquals(5, queue.front());
    }
    @Test
    public void test_That_To_Remove_One_Element_From_The_Queue() {
        queue.enQueue(5);
        queue.enQueue(10);
        queue.enQueue(15);
        assertEquals(5, queue.front());
        assertFalse(queue.isFullQueue());
        queue.deQueue();
        assertEquals(10, queue.front());
    }

    @Test
    public void test_That_To_View_Last_In_The_Queue() {
        queue.enQueue(5);
        queue.enQueue(3);
        queue.enQueue(2);
        assertEquals(2, queue.back());
    }
    @Test
    public void test_That_New_Element_Can_Not_Be_Added_To_The_Queue_When_It_Is_Full() {
        for(int index = 1; index <=10; index++) {
            queue.enQueue(index);
        }
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->  queue.enQueue(2));
    }

    @Test
    public void test_To_Delete_Element_When_Queue_Is_Full() {
        for(int index = 1; index <=10; index++) {
            queue.enQueue(index);
        }
        queue.deQueue();
        assertFalse(queue.isFullQueue());
        assertEquals(10, queue.back());
    }

}
