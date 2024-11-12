package services;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ServicesForEntryTest {
    private EntryServices entryServices;

    @BeforeEach
    public void setUp() {
        entryServices = new ServicesForEntry();
    }
    @Test
    public void test_ToCheckNumberOfEntryCreated() {
        assertEquals(0, entryServices.countNumberOfEntries());
    }

    @Test
    public void test_To_CreateEntry_EntryCountIs_One() {
        entryServices.createEntry("Miracle", "title", "body", 1);
        assertEquals(1, entryServices.countNumberOfEntries());
    }

    @Test
    public void test_To_CreateTwoEntry_EntryCountIs_Two() {
        entryServices.createEntry("Miracle", "title", "body", 1);
        entryServices.createEntry("Miracle", "title", "body", 2);
        assertEquals(2, entryServices.countNumberOfEntries());
    }

    @Test
    public void test_To_CreateEntryWithAnExistingId_EntryIsUpdated_EntryCountIs_One() {
        entryServices.createEntry("Miracle", "title", "body", 1);
        assertEquals(1, entryServices.countNumberOfEntries());
        entryServices.createEntry("Miracle", "title", "body", 1);
        assertEquals(1, entryServices.countNumberOfEntries());
    }

    @Test
    public void test_To_CreateEntryAndFindEntryById() {
        entryServices.createEntry("Miracle", "titleOne", "body", 1);
        assertEquals(1, entryServices.countNumberOfEntries());
        assertEquals("titleOne", entryServices.findEntryById("Miracle", 1).getTitle());
    }

    @Test
    public void test_ToCreateEntries_FindTheir_Entries_By_Id() {
        entryServices.createEntry("Miracle", "titleOne", "body", 1);
        entryServices.createEntry("Miracle", "titleTwo", "body", 2);
        entryServices.createEntry("Sarah", "titleOne", "body", 1);
        entryServices.createEntry("Sarah", "titleTwo", "body", 2);
        assertEquals(4, entryServices.countNumberOfEntries());
        assertEquals("titleOne", entryServices.findEntryById("Miracle", 1).getTitle());
        assertEquals("titleOne", entryServices.findEntryById("Sarah", 1).getTitle());
    }

    @Test
    public void test_ToCreateEntriesAnd_FindAllEntryThatBelongToA_ParticularId() {
        entryServices.createEntry("Miracle", "titleOne", "body", 1);
        entryServices.createEntry("Miracle", "titleTwo", "body", 2);
        entryServices.createEntry("Sarah", "titleOne", "body", 1);
        entryServices.createEntry("Sarah", "titleTwo", "body", 2);
        assertEquals(4, entryServices.countNumberOfEntries());
        assertEquals(2 , entryServices.findAllentryById("Sarah").size());
    }

    @Test
    public void test_To_Create_EntryAndUpdate_TheEntryIfItExists() {
        entryServices.createEntry("Miracle", "titleOne", "body", 1);
        entryServices.createEntry("Miracle", "titleTwo", "body", 2);
        entryServices.updateEntry("Miracle", 1,"newTitle", "newBody");
        assertEquals("newTitle", entryServices.findEntryById("Miracle", 1).getTitle());
        assertEquals(2, entryServices.countNumberOfEntries());
    }

    @Test
    public void test_ToCreate_EntryAndDeleteById() {
        entryServices.createEntry("Miracle", "titleOne", "body", 1);
        assertEquals(1, entryServices.countNumberOfEntries());
        assertEquals("entry deleted successfully", entryServices.deleteById("Miracle", 1));
        assertEquals(0, entryServices.countNumberOfEntries());
    }

    @Test
    public void test_To_DeleteAndEntryThatDoesNotExist_EntryNotFound() {
        entryServices.createEntry("Miracle", "titleOne", "body", 1);
        assertEquals(1, entryServices.countNumberOfEntries());
        assertThrows(EntryException.class, ()-> entryServices.deleteById("Sarah", 1));
    }

    @Test
    public void testToCreateEntriesAndDeleteAllEntries() {
        entryServices.createEntry("Miracle", "titleOne", "body", 1);
        entryServices.createEntry("Miracle", "titleTwo", "body", 2);
        entryServices.createEntry("Sarah", "titleOne", "body", 1);
        entryServices.createEntry("Sarah", "titleTwo", "body", 2);
        assertEquals(4, entryServices.countNumberOfEntries());
        assertEquals("entries deleted successfully", entryServices.deleteAllEntriesFor("Sarah"));
        assertEquals(2, entryServices.countNumberOfEntries());
    }


}