public class ConcreteObserver implements Observer {
    private String message;
    public ConcreteObserver(String message) {
        this.message = message;
    }
    @Override
    public void update(String message) {
        this.message = message;
        System.out.println("update recieved: " + this.message);
    }
}
