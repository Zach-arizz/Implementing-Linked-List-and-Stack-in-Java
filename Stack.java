public class Stack {
    private LinkedList list; // The underlying data structure

    public Stack() {
        this.list = new LinkedList();
    }
    
    // Push: Add an item to the top of the stack
    public void push(int data) {
        list.addFirst(data);
        System.out.println("Pushed: " + data);
    }

    // Pop: Remove an item from the top of the stack
    public int pop() {
        int data = list.removeFirst();
        System.out.println("Popped: " + data);
        return data;
    }

    // isEmpty: Check if the stack is empty
    public boolean isEmpty() {
        return (list.head == null);
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(100);
        myStack.push(200);
        myStack.push(300);

        System.out.println("\nCurrent Stack State:");
        myStack.list.displayList();

        System.out.println("\nStarting to pop...");
        myStack.pop();
        myStack.list.displayList();

        myStack.pop();
        myStack.list.displayList();

        myStack.pop();
        myStack.list.displayList();
    }
}
