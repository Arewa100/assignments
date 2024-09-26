package heartrates;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRatesTest {
    private HeartRate heartRate;

    @BeforeEach
    public void setUp() {
        heartRate = new HeartRate("sola", "John", 3, 12, 2019, 2024);
    }
    @Test
    public void test_That_Heart_Rate_Calculator_Exists() {
        HeartRate heartRate = new HeartRate("sola", "John", 3, 12, 2019, 2024);
    }
    @Test
    @DisplayName("test that heart rate calculator can initialise attributes and get name")
    public void test_that_Heart_Rate_Calculator_Can_initialise_the_Attributes() {
        HeartRate heartRate = new HeartRate("Sola", "John", 3,15, 2012, 2024);
        assertEquals("Sola John", heartRate.getName());
    }
    @Test
    @DisplayName("test to get dates")
    public void test_get_dates() {
        assertEquals("3:12:2019", heartRate.getDate());
    }
    @Test
    @DisplayName("test to get the maximum heart rate")
    public void test_get_maximum_heart_rate() {
        heartRate = new HeartRate("Sola", "John", 3, 12, 2019, 2024);
        assertEquals(215, heartRate.getMaximumHeartRate());
    }
    @Test
    @DisplayName("test to get the target heart rate")
    public void test_get_target_heart_rate() {
        heartRate = new HeartRate("Sola", "John", 3, 12, 2019, 2024);
        assertEquals(215, heartRate.getMaximumHeartRate());
        assertEquals(118, heartRate.targetHeartRate(55));
    }
}
