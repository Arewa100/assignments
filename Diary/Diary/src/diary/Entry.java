package diary;

public class Entry {
    private String title;
    private String body;
    private int Id;

    public Entry(String title, String body, int id) {
        this.title = title;
        this.body = body;
        Id = id;
    }

    @Override
    public String toString() {
        return title + ": " + body;
    }

    public int getId() {
        return Id;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setBody(String newBody) {
        body = newBody;
    }

//    public void dele
}
