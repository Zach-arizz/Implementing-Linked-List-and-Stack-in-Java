public class LinkedList {
    Node head; // The first node in the list. Also called the head.

    // Constructor
    public LinkedList() {
        this.head = null;
    }

    // Method to remove the first node and return its data
    public int removeFirst() {
        // Check if the list is empty
        if (head == null) {
            throw new RuntimeException("Cannot remove from an empty list.");
        }
        // 1. Store the data of the head node
        int data = this.head.data;
        // 2. Move the head pointer to the next node
        this.head = this.head.next;
        // 3. Return the stored data
        return data;
    }

    // Method to add a node at the beginning of the list
    public void addFirst(int data) {
        // 1. Create a new node with the given data
        Node newNode = new Node(data);
        // 2. Set the new node's next reference to the current head
        newNode.next = this.head;
        // 3. Update the list's head to be the new node
        this.head = newNode;
    }

    // Method to display all the nodes in the list
    public void displayList() {
        System.out.print("List (head -> tail): ");
        Node current = this.head; // Start traversal from the head

        // Loop until we reach the end of the list (where current becomes null)
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        System.out.println("Adding 30 to the front...");
        myList.addFirst(30);
        myList.displayList();

        System.out.println("Adding 20 to the front...");
        myList.addFirst(20);
        myList.displayList();

        System.out.println("Adding 10 to the front...");
        myList.addFirst(10);
        myList.displayList();
    }
}
