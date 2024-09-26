package heartrates;

public class HeartRate {
    private final String name;
    private final String date;
    private final int currentYear;
    private final int yearOfBirth;


    public HeartRate(String firstName, String secondName, int month, int day, int yearOfBirth, int currentYear) {
        this.name = firstName + " " + secondName;
        this.date = month + ":" + day + ":" + yearOfBirth;
        this.currentYear = currentYear;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
    public int getAge() {
        return currentYear - yearOfBirth;
    }

    public int getMaximumHeartRate() {
        int age = getAge();
        return 220 - age;
    }

    public int targetHeartRate(int targetRange) {
        double percentage = targetRange / 100.0;
        return (int) (getMaximumHeartRate() * percentage);
    }
}
