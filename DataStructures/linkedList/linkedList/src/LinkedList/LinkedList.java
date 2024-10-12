package LinkedList;

public class LinkedList {
    private Node head;
    private Node last;


    public LinkedList() {
        head = null;
        last = null;
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
            System.out.println(newNode.getData());
            last.insertCurrentNodeAtAddress(newNode);
            System.out.println("this is the data " + last.getLinkedNode().getData());
            last = newNode;
    }

    private boolean headIsNotEmpty() {
        return head != null;
    }
    private boolean headIsEmpty() {
        return head == null;
    }

    public int getLastData() {
        return last.getData();
    }

    public Node getLastNode() {
        return head;
    }
}
