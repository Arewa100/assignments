package books;

public class stringWahala {

    public static void main(String[] args) {
        String name = "Ada";
        String herName = new String("Ada");
        String myName = new String("Ada");

        if(myName == herName) {
            System.out.println("Name is the same");
        }else {
            System.out.println("Name is not the same");
        }
    }
}
