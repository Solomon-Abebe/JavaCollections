package DSA;

class QueueNode {
    int data;
    QueueNode next;

    public QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private QueueNode front;
    private QueueNode rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; // Return a sentinel value indicating failure
        }
        int dequeuedValue = front.data;
        front = front.next;
        if (front == null) {
            rear = null; // If front becomes null, rear should also be null
        }
        return dequeuedValue;
    }

    public boolean isEmpty() {
        return front == null;
    }

    // Method to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        QueueNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Queue elements:");
        queue.display(); // Output: 1 2 3 4

        System.out.println("Dequeued element: " + queue.dequeue()); // Output: 1
        System.out.println("Front element after dequeue: " + queue.front.data); // Output: 2
    }
}