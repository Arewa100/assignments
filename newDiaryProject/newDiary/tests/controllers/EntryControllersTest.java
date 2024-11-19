package controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.DiaryExceptions;
import services.EntryException;

import static org.junit.jupiter.api.Assertions.*;

public class EntryControllersTest {
    private EntryControllers entryControllers;

    @BeforeEach
    public void seTup() {
        entryControllers = new EntryControllers();
    }

    @Test
    public void testThatControllerCanCreateEntry_NumberOfCreatedEntryIsOne() {
        String feedback = entryControllers.createEntry("Sarah", "title", "body", 1);
        assertEquals("entry created successfully", feedback);
        assertEquals(1, entryControllers.getNumberOfCreatedEntries());
    }
    @Test
    public void testToCreateAndExistingEntry_NumberOfCreatedEntryRemainsOne() {
        String feedback = entryControllers.createEntry("Sarah", "title", "body", 1);
        assertEquals("entry created successfully", feedback);
        assertEquals(1, entryControllers.getNumberOfCreatedEntries());
        entryControllers.createEntry("Sarah", "title2", "body2", 1);
        assertEquals(1, entryControllers.getNumberOfCreatedEntries());
    }

    @Test
    public void testToCreateTwoEntries_NumberOfCreatedEntryIsTwo() {
        String feedback = entryControllers.createEntry("Sarah", "title", "body", 1);
        assertEquals("entry created successfully", feedback);
        String feedbackTwo = entryControllers.createEntry("Micheal", "title", "body", 1);
        assertEquals("entry created successfully", feedbackTwo);
        assertEquals(2, entryControllers.getNumberOfCreatedEntries());
    }

    @Test
    public void testThatEntryControllerCanFindEmtry() {
       entryControllers.createEntry("Sarah", "title", "body", 1);
       entryControllers.createEntry("Micheal", "michealTitle", "body2", 1);
       assertEquals("michealTitle", entryControllers.findEntryBhyId("Micheal", 1).getTitle());
    }

    @Test
    public void testFindAnEntryThatDoesNotExist() {
        entryControllers.createEntry("Sarah", "title", "body", 1);
        entryControllers.createEntry("Micheal", "michealTitle", "body2", 1);
        assertThrows(EntryException.class, () -> entryControllers.findEntryBhyId("ruth", 2));
    }

    @Test
    public void t // this iswhere i am
 }