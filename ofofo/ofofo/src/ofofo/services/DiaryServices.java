package services;

public interface DiaryServices {
    String registerUser(String userName, String password);
    String loginUser(String userName, String password);
    String logoutUser();
    void createEntry(String userName, String password);



}
