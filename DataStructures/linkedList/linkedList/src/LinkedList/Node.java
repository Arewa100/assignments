package LinkedList;

public class Node {
    private  final int data;
    private  Node addressOfNextNode;

    public Node(int data) {
        this.data = data;
        this.addressOfNextNode = null;
    }

    public int getData() {
        return data;
    }

    public Node getLinkedNode() {
        return addressOfNextNode;
    }

    public void insertCurrentNodeAtAddress(Node newNode) {
        addressOfNextNode = newNode;
    }
}
