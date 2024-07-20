package DSA.Queue1;

import java.util.LinkedList;
import java.util.Queue;

// Represents a print job
class PrintJob {
    private String document;

    public PrintJob(String document) {
        this.document = document;
    }

    public String getDocument() {
        return document;
    }
}

// Represents a print queue
class PrintQueue {
    private Queue<PrintJob> queue;

    public PrintQueue() {
        this.queue = new LinkedList<>();
    }

    // Enqueue: Add a print job to the queue
    public void enqueue(PrintJob job) {
        queue.offer(job);
        System.out.println("Added print job: " + job.getDocument() + " to the queue.");
    }

    // Dequeue: Remove a print job from the queue
    public PrintJob dequeue() {
        PrintJob job = queue.poll();
        if (job != null) {
            System.out.println("Processed print job: " + job.getDocument());
        } else {
            System.out.println("No print job in the queue.");
        }
        return job;
    }

    // Peek: View the next print job in the queue without removing it
    public PrintJob peek() {
        PrintJob job = queue.peek();
        if (job != null) {
            System.out.println("Next print job in the queue: " + job.getDocument());
        } else {
            System.out.println("No print job in the queue.");
        }
        return job;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

class Main {
    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();

        // Add print jobs to the queue
        printQueue.enqueue(new PrintJob("Document1"));
        printQueue.enqueue(new PrintJob("Document2"));
        printQueue.enqueue(new PrintJob("Document3"));

        // Process print jobs from the queue
        while (!printQueue.isEmpty()) {
            printQueue.dequeue();
        }
    }
}
