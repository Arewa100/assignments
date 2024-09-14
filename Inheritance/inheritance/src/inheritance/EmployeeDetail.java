package inheritance;

public class EmployeeDetail {
    protected String name;
    private String phoneNumber;
    private String gender;

    public void setName(String firstName, String secondName) {
        name = firstName + " " + secondName;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String number) {
        phoneNumber = number;
    }

    public String getContact() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return String.format("Name: %s, PhoneNumber: %s, Gender: %s", name, phoneNumber, gender);
    }
}
