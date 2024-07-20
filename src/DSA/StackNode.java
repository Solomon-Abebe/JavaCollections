package DSA;

class StackNode {
    int data;
    StackNode next;

    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private StackNode top;

    public Stack() {
        this.top = null;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // Return a sentinel value indicating failure
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // Return a sentinel value indicating failure
        }
        return top.data;
    }

    // Method to display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        StackNode temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack elements:");
        stack.display(); // Output: 4 3 2 1

        System.out.println("Popped element: " + stack.pop()); // Output: 4
        System.out.println("Top element after pop: " + stack.peek()); // Output: 3
    }
}