package queue;

import java.util.Arrays;

public class Queue<T> {
    private final T[] queueElements;
    private int capacity;
    private int numberOfElements;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.queueElements = (T[]) new Object[capacity];
        this.numberOfElements = 0;
    }

    public boolean isEmptyQueue() {
        return thereIsNoElementInTheQueue();
    }

    private boolean thereIsNoElementInTheQueue() {
        return numberOfElements == 0;
    }
    public boolean isFullQueue() {
        return capacity == 0;
    }

    public void enQueue(T element) {
        throwExceptionWhenCapacityIsFull();
        int index = queueElements.length - capacity;
        queueElements[index] = element;
        numberOfElements++;
        capacity = capacity - 1;
    }

    public T front() {
        return queueElements[0];
    }

    public void deQueue() {
        removeElement();
        decreaseNumberOfElement();
        increaseCapacity();
    }

    private void removeElement() {
        for(int index = 0; index < numberOfElements; index++) {
            boolean indexIsEqualToTheLastIndex = (index == numberOfElements - 1);
            if(indexIsEqualToTheLastIndex) {
                queueElements[index] = null;
            }else {
                queueElements[index] = queueElements[index + 1];
            }
        }
    }
    private void increaseCapacity() {
        capacity = capacity + 1;
    }
    private void decreaseNumberOfElement() {
        numberOfElements = numberOfElements - 1;
    }
    public T back() {
        return queueElements[numberOfElements - 1];
    }

    private void throwExceptionWhenCapacityIsFull() {
        if(isFullQueue()) throw new ArrayIndexOutOfBoundsException("Queue is full");
    }
}
