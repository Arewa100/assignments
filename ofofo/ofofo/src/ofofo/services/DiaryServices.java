package services;

public interface DiaryServices {
    String registerDiary(String userName, String password);
    String loginDiary(String userName, String password);
    String logoutDiary();
    void createEntry(String title, String body);
    String findEntry(int entryId);
    String viewAllEntry();
    void updateEntry(String title, String body);
    String deleteEntry(int id);
    long numberOfRegisteredDiaries();

}
