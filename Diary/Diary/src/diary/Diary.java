package diary;

public class Diary {
    private boolean isLocked = false;
    private String password;
    private int numberOFEntry = 0;

    public Diary(String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock(String password) {
        if(password.equals(this.password)) isLocked = false;
    }

    public void createEntry(String title, String body) {
        numberOFEntry++;
    }


    public int getNumberOfEntry() {
        return numberOFEntry;
    }
}
