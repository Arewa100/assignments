import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new ConcreteObserver("observer 1");
        Observer observer2 = new ConcreteObserver("observer 2");
        subject.addObserver(observer);
        subject.addObserver(observer2);
        while(true){
            subject.setState(input("enter update: "));
        }

    }


    public static String input(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}