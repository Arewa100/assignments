package models;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked = true;


    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

//    public List<Entry> getEntries() {
//        return entries;
//    }
//
//    public void setEntries(List<Entry> entries) {
//        this.entries = entries;
//    }
}

