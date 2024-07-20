package DSA.Linkedlist;
// Traditional Approach (Custom Implementation)
class Node {
    int data; // Data of the node
    Node next; // Reference to the next node

    public Node(int data) {
        this.data = data;
        this.next = null; // By default, the next reference is null
    }
}

class LinkedList {
    Node head; // Reference to the first node in the list

    public LinkedList() {
        this.head = null; // Initially, the list is empty
    }

    // Method to add a new node to the end of the list
    public void addData(int data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) {
            head = newNode; // If the list is empty, the new node becomes the head
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next; // Traverse to the end of the list
        }
        current.next = newNode; // Attach the new node to the last node
    }


    // Method to display the elements of the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();// this is to display multiple lists separately
    }
}

 class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addData(1);
        list.addData(2);
        list.addData(3);
        list.addData(5);
        list.addData(7);

        list.display(); // Output: 1 2 3
    }
}
