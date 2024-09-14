package inheritance;

public class FacultyOfArts extends EmployeeDetail{
    private String facultyNumber;
    private String phoneNumber;

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String getContact() {
        return phoneNumber;
    }
}
