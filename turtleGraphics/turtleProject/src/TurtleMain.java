import turtlegraphics.Turtle;

public class TurtleMain {
    public static void main(String[] args) {
        System.out.println("WELCOME FRIEND>>>");
        Turtle turtle = new Turtle();
        turtle.createPen("biro");

        //drawing s
        turtle.setPosition(10, 2);
        turtle.movePenDown();
        turtle.draw(4);
        turtle.turnLeft();
        turtle.draw(4);
        turtle.turnLeft();
        turtle.draw(4);
        turtle.turnRight();
        turtle.draw(3);
        turtle.turnRight();
        turtle.draw(4);

        //drawing u
        turtle.setPosition(2, 8);
        turtle.turnRight();
        turtle.draw(8);
        turtle.turnLeft();
        turtle.draw(4);
        turtle.turnLeft();
        turtle.draw(8);

        //draw C
        turtle.setPosition(9, 17);
        turtle.turnLeft();
        turtle.draw(4);
        turtle.turnRight();
        turtle.draw(6);
        turtle.turnRight();
        turtle.draw(4);

        //drawing second c
        turtle.setPosition(9, 22);
        turtle.turnRight();
        turtle.turnRight();
        turtle.draw(4);
        turtle.turnRight();
        turtle.draw(6);
        turtle.turnRight();
        turtle.draw(4);


        //drawing e
        turtle.setPosition(2, 28);
        turtle.turnRight();
        turtle.turnRight();
        turtle.draw(4);
        turtle.turnLeft();
        turtle.draw(4);
        turtle.turnLeft();
        turtle.draw(4);
        turtle.setPosition(9, 28);
        turtle.movePenUp();
        turtle.turnRight();
//        turtle.turnRight();
        turtle.draw(4);
        turtle.movePenDown();
        turtle.turnRight();
        turtle.draw(4);
        turtle.turnRight();
        turtle.draw(4);

        //second s
        turtle.setPosition(10, 30);
        turtle.turnRight();
        turtle.draw(4);
        turtle.turnLeft();
        turtle.draw(4);
        turtle.turnLeft();
        turtle.draw(4);
        turtle.turnRight();
        turtle.draw(3);
        turtle.turnRight();
        turtle.draw(4);

        //draw 3 s
        turtle.setPosition(10, 35);
        turtle.draw(4);
        turtle.turnLeft();
        turtle.draw(4);
        turtle.turnLeft();
        turtle.draw(4);
        turtle.turnRight();
        turtle.draw(3);
        turtle.turnRight();
        turtle.draw(4);

        turtle.display();
    }
}
