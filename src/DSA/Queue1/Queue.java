package DSA.Queue1;

public class Queue {
    int length=5;
    int[] queue = new int[5];
    int rear;
    int front;
    int size;

    public void enQueue(int data){
        if (!isFull()) {
            queue[rear] = data;
            rear++;
            size++;
        }
        else {
            System.out.println(" Queue is Full");
        }
    }
    public int deQueue() {
        int data = queue[front];
        if (!isEmpty()) {
                front++;
                size--;
        } else {
            System.out.println(" Queue is Empty");
        }
        return data;
    }
    public boolean isFull(){
        return getSize()==length;
    }
    public boolean isEmpty(){
        return getSize()==0;
    }

    public int getSize(){
        return size;
    }

    public void show(){
        System.out.print(" Elements in the queue : ");
        for (int i = 0; i < size; i++)
            System.out.print(queue[(front+i)] + " ");

        System.out.println();
        System.out.println("* Elements Initially Added to the Queue");
        for(int n: queue){
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Queue qObject = new Queue();
        qObject.enQueue(5);
        qObject.enQueue(15);
        qObject.enQueue(11);
        qObject.enQueue(9);
        qObject.enQueue(2);
//        qObject.enQueue(4);
//        qObject.enQueue(8);

        System.out.println("# Dequeued Element: "+ qObject.deQueue());

//        qObject.deQueue();
//        qObject.deQueue();
//        qObject.deQueue();
//        qObject.deQueue();

        System.out.println("Size is: "+ qObject.getSize());
        qObject.show();
    }
}
