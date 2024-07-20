package DSA.Interview;

public class ArrayQueue {
    private int[] queue;
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int capacity; // Maximum capacity of the queue
    private int size; // Current size of the queue

    // Constructor to initialize the queue
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    // Method to remove an element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a sentinel value indicating failure
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Method to get the element at the front of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return a sentinel value indicating failure
        }
        return queue[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek()); // Output: 1

        queue.dequeue();

        System.out.println("Front element after dequeue: " + queue.peek()); // Output: 2

        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: false
    }
}
