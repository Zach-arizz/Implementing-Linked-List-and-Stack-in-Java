public class Node {
    int data; // The data value stored in the node
    Node next; // A reference to the next node in the list

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null; // By default, the next node is null
    }
}