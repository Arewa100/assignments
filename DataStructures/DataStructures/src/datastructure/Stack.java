package datastructure;

public class Stack {
    private int elementCount;
    private final int maximumCapacity;
    private final String[] element;

    public Stack(int size) {
        element = new String[size];
        this.maximumCapacity = element.length;
    }
    public boolean isEmpty() {
        if(elementCount == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public void push(String item) {
        if(elementCount != maximumCapacity) {
            element[elementCount] = item;
            elementCount = elementCount + 1;
        }
    }

    public boolean isFull() {
        return maximumCapacity == elementCount;
    }

    public String peek() {
        if (elementCount == 0) {
            return null;
        }else {
            return element[elementCount-1];
        }
    }

    public void pop() {
        if(elementCount > 0) {
            element[--elementCount] = null;
        }
    }
}
