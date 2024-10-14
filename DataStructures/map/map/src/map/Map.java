package map;

import java.util.Arrays;

public class Map<T> {
    private final String[] key;
    private final T[] value;
    private int capacity;
    private int size;



    public Map(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.key = new String[capacity];
        this.value = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void insert(String key, T value) {
        insertWhenMapDoesNotContainKey(key, value);
    }

    private void insertWhenMapDoesNotContainKey(String key, T value) {
        if(mapDoesNotContainKey(key)) {
            int index = this.key.length - capacity;
            this.key[index] = key;
            this.value[index] = value;
            capacity = capacity - 1;
            size++;
        }
    }

    private boolean mapDoesNotContainKey(String key) {
        return !contains(key);
    }

    public T get(String key) {
        int indexOfTheKey = getKeyIndex(key);
        return this.value[indexOfTheKey];
    }

    private int getKeyIndex(String key) {
        for (int index = 0; index < this.key.length; index++) {
            if (this.key[index] == key) {
                return index;
            }
        }
        return 0;
    }
    public boolean contains(String key) {
        if(keyIsInMap(key)) return true;
        return false;
    }

    private boolean keyIsInMap(String key) {
        for (int index = 0; index < this.key.length; index++) {
            if (this.key[index] == key) {
                return true;
            }
        }
        return false;
    }

    public void update(String key, T value) {
        int indexOfTheKey = getKeyIndex(key);
        this.value[indexOfTheKey] = value;
    }

    public void delete(String key) {
        deleteTheByUsingKey(key);
    }

    private void deleteTheByUsingKey(String key) {
        int indexOfTheKey = getKeyIndex(key);
        iterateThroughKeyArray(indexOfTheKey);
        iterateThroughValueError(indexOfTheKey);
        decreaseSize();
        increaseCapacity();
    }

    private void decreaseSize() {
        size = size - 1;
    }

    private void increaseCapacity() {
        capacity = capacity + 1;
    }

    private void iterateThroughValueError(int indexOfTheKey) {
        for (int index = 0; index < this.key.length; index++) {
            if (indexOfTheKey == index) {
                pushTheNextValueToPositionOfTheDeletedValue(index);
                pushTheValueAfterThePreviousPushedValueToPositionOfPreviousPushedValue(index);
                turnValueInPositionOfCurrentPushedValueToNull(index);
            } else {
                T value = this.value[index];
                insertNextValue(index, value);
            }
        }
    }
    private void insertNextValue(int index, T value) {
        this.value[index] = value;
    }
    private void pushTheNextValueToPositionOfTheDeletedValue(int index) {
        this.value[index] = this.value[index + 1];
    }
    private void pushTheValueAfterThePreviousPushedValueToPositionOfPreviousPushedValue(int index) {
        this.value[index + 1] = this.value[index + 2];
    }

    private void turnValueInPositionOfCurrentPushedValueToNull(int index) {
        this.value[index + 2] = null;
    }

    private void insertNextKey(int index, String key) {
        this.key[index] = key;
    }
    private void pushTheNextKeyToPositionOfTheDeletedKey(int index) {
        this.key[index] = this.key[index + 1];
    }
    private void pushTheKeyAfterThePreviousPushedKeyToPositionOfPreviousPushedKey(int index) {
        this.key[index + 1] = this.key[index + 2];
    }

    private void turnKeyInPositionOfCurrentPushedKeyToNull(int index) {
        this.key[index + 2] = null;
    }
    private void iterateThroughKeyArray(int indexOfTheKey) {
        for (int index = 0; index < this.key.length; index++) {
            if (indexOfTheKey == index) {
                pushTheNextKeyToPositionOfTheDeletedKey(index);
                pushTheKeyAfterThePreviousPushedKeyToPositionOfPreviousPushedKey(index);
                turnKeyInPositionOfCurrentPushedKeyToNull(index);

            } else {
                String value = this.key[index];
                insertNextKey(index, value);
            }
        }
    }

    private void increaseCapacityWhenFull() {
        if (capacity == 0) capacity = size * 2;
    }
    @Override
    public String toString() {
        String map = "";
        for(int index = 0; index < this.key.length; index++) {
            String newValue = String.valueOf(value[index]);
            map = map + String.format("%s: %s", this.key[index], newValue) + ", ";

        }
        return "{ " + map + " }";
    }

}
