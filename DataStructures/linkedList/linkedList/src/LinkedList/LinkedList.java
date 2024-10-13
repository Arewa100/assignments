package LinkedList;

public class LinkedList {
    private Node head;
    private Node last;
    private int size;


    public LinkedList() {
        head = null;
        last = null;
        size = 0;
    }
    public void insert(int data) {
        if(headIsNotEmpty()) insertDataIfHeadIsNotEmpty(data);
        if(headIsEmpty()) insertDataIfHeadIsNull(data);
    }

    private void insertDataIfHeadIsNull(int data) {
            Node newNode = new Node(data);
            head = newNode;
            last = newNode;
    }

    private void insertDataIfHeadIsNotEmpty(int data) {
            Node newNode = new Node(data);
            last.insertCurrentNodeAtAddress(newNode);
            last = newNode;
    }

    private boolean headIsNotEmpty() {
        return head != null;
    }
    private boolean headIsEmpty() {
        return head == null;
    }

    public Node back() {
        return last;
    }

    public Node front() {
        return head;
    }

    public int size() {
        size = 0;
        Node currentNode = head;
        iterateThroughNodeAddresses(currentNode);
       return size;
    }

    private void iterateThroughNodeAddresses(Node currentNode) {
        while(currentNode != null) {
            size++;
            currentNode = currentNode.getLinkedNode();
        }
    }
    public void insertAt(int nodeIndex, int data) {
        insertAtGivenIndex(nodeIndex, data);
    }

    private void insertAtGivenIndex(int nodeIndex, int data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        int indexCount = 0;
        while(currentNode != null) {
            if(indexCount == nodeIndex) {
                newNode.insertCurrentNodeAtAddress(currentNode.getLinkedNode());
                currentNode.insertCurrentNodeAtAddress(newNode);
            }
            indexCount = indexCount + 1;
            currentNode = currentNode.getLinkedNode();
        }
    }

    public void deleteNode(int nodeIndex) {
        deleteAtGivenIndex(nodeIndex);
    }

    private void deleteAtGivenIndex(int nodeIndex) {
        Node currentNode = head;
        int indexCount = 0;
        int previousNodeIndex = nodeIndex - 1;
        while(currentNode != null) {
            if(indexCount == previousNodeIndex) {
                currentNode.insertCurrentNodeAtAddress(currentNode.getLinkedNode().getLinkedNode());
            }
            indexCount = indexCount + 1;
            currentNode = currentNode.getLinkedNode();
        }
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.insertCurrentNodeAtAddress(head);
        head = newNode;
    }


    public boolean isEmpty() {
        return headIsEmpty();
    }

    public void destroyList() {
        head = null;
    }
}
