//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new ConcreteObserver("observer 1");
        Observer observer2 = new ConcreteObserver("observer 2");
        subject.addObserver(observer);
        subject.addObserver(observer2);

        subject.setState("this is working");

    }
}