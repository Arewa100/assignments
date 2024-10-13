package datastructure;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack stack;
    @BeforeEach
    public void seTup() {
        stack = new Stack(5);
    }
    @Test
    public void testToConfirmStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }
    @Test
    public void testToAddAnItemToTheStackAndCheckIfItIsNotEmpty() {
        stack.push("comb");
        assertFalse(stack.isEmpty());
    }
    @Test
    public void testToAddItemsToTheStackAndCheckIfItIsFull() {
        assertTrue(stack.isEmpty());
        stack.push("cup");
        assertFalse(stack.isEmpty());
        stack.push("ball");
        stack.push("umbrella");
        stack.push("soap");
        stack.push("socks");
        assertTrue(stack.isFull());
    }
    @Test
    public void testToConfirmIfStackIsNotFull() {
        stack.push("cup");
        stack.push("ball");
        assertFalse(stack.isFull());
    }
    @Test
    public void testToCheckTheTopItemInTheStack() {
        assertTrue(stack.isEmpty());
        stack.push("cup");
        stack.push("ball");
        stack.push("umbrella");
        assertFalse(stack.isFull());
        assertEquals("umbrella", stack.peek());

    }
    @Test
    public void testToAddMoreItemAndCheckTheTopItem() {
        assertTrue(stack.isEmpty());
        stack.push("cup");
        stack.push("ball");
        stack.push("umbrella");
        stack.push("soap");
        assertEquals("soap", stack.peek());
    }
    @Test
    public void testToAdd_3_Item_And_Remove_1_ItemFromTheStack() {
        assertTrue(stack.isEmpty());
        stack.push("cup");
        stack.push("ball");
        stack.push("umbrella");
        stack.pop();
        assertEquals("ball", stack.peek());
    }
    @Test
    public void testToRemoveItemFromTheStackWhenItIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.pop();
        assertNull(stack.peek());
    }

    @Test
    public void testToAddMoreItemToTheStackWhenItIsFull() {
        assertTrue(stack.isEmpty());
        stack.push("cup");
        stack.push("ball");
        stack.push("umbrella");
        stack.push("soap");
        stack.push("socks");
        assertTrue(stack.isFull());
        assertEquals("socks", stack.peek());
        stack.push("plate");
        assertEquals("socks", stack.peek());
    }
    @Test
    public void testToCheckTheTopElementInTheStack() {
        assertTrue(stack.isEmpty());
        stack.push("cup");
        stack.push("ball");
        assertEquals("ball", stack.peek());

    }
    @Test
    public void testToCheckTheValidityOFPeak() {
        assertTrue(stack.isEmpty());
        stack.push("cup");
        stack.push("ball");
        assertEquals("ball", stack.peek());
        stack.push("umbrella");
        assertEquals("umbrella", stack.peek());
    }
  
}