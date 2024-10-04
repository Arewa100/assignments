package things;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThingsTest {
    @Test
    public void testToConfirmIfThingsSize() {
        Things things = new Things();
        assertEquals(0, things.size());
    }

    @Test
    public void test_To_Confirm_That_Livings_Things_Have_A_Size() {
        LivingThings livingThings = new LivingThings();
        assertEquals(0, livingThings.size());
    }

    @Test
    public void test_To_Confirm_That_Non_Livings_Thing_Have_A_Size() {
        NonLivingThings nonlivingThings = new NonLivingThings();
        assertEquals(0, nonlivingThings.size());
    }
    @Test
    public void test_To_Confirm_That_Animal_Have_A_Size() {
        Animal animal = new Animal();
        assertEquals(0, animal.size());
    }
    @Test
    public void test_To_Confirm_That_Non_Animal_Have_A_Size() {
        Vertebrate vertebrate = new Vertebrate();
        assertEquals(0, vertebrate.size());
    }
    @Test
    public void test_That_Invertebrate_Have_A_Size() {
        Invertebrate invertebrate = new Invertebrate();
        assertEquals(0, invertebrate.size());
    }
    @Test
    public void test_That_Mammals_Have_A_Size() {
       Mammals mammals = new Mammals();
        assertEquals(0, mammals.size());
    }
    @Test
    public void test_That_Aves_Have_A_Size() {
        Aves aves = new Aves();
        assertEquals(0, aves.size());
    }
    @Test
    public void test_That_Reptiles_Have_A_Size() {
        Reptiles reptiles = new Reptiles();
        assertEquals(0, reptiles.size());
    }
    @Test
    public void test_That_Amphibians_Have_A_Size() {
        Amphibians amphibians = new Amphibians();
        assertEquals(0, amphibians.size());
    }
    @Test
    public void test_That_Pisces_Have_A_Size() {
        Pisces pisces = new Pisces();
        assertEquals(0, pisces.size());
    }

}
