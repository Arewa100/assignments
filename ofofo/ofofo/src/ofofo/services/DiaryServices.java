package services;

public interface DiaryServices {
    String registerUser(String userName, String password);
    String loginUser(String userName, String password);
    String logoutUser();
    void createEntry(String title, String body);
    String findEntry(int entryId);
    String viewAllEntry();
    void updateEntry(String title, String body);
    String deleteEntry(int id);

}
