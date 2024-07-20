package DSA.Queue1;

public class TeluskoQueue {
    int[] queue = new int [6];// Array created
    int rear;// we can initialize these variables explicitly to zero or the compiler
    // can initialize them to the default value when object is created
    int front;
    int size;// here size and queue.size() are different. queue.size() is the size of the array
    // while size is the actual number of elements added to the queue
    public void enQueue(int data){
        if (!isFull()){
            queue[rear]=data;
            rear = (rear+1)%queue.length;// rear initializes here
            size++;
        } else {
            System.out.println("Queue is full");
        }
    }
    public int deQueue(){
        int data = queue[front];
        if (!isEmpty()){
            front = (front+1)%queue.length;// front initializes here
            size--;
        }else {
            System.out.println("Queue is Empty");
        }

        return data;
    }
    public int getSize(){
        return size;
    }
    public boolean isFull(){
        return getSize()==queue.length;
    }
    public boolean isEmpty(){
        return getSize()==0;
    }
    public void show(){
        for (int i = 0; i <size ; i++) {
            System.out.print(queue[(front+i)%queue.length]+ " ");

        }
//        System.out.println();
//        for (int n:queue) {
//            System.out.print(n+" ");
//        }
    }

    public static void main(String[] args) {
        TeluskoQueue tq = new TeluskoQueue();
        tq.enQueue(5);
        tq.enQueue(9);
        tq.enQueue(12);
        tq.enQueue(7);
        tq.enQueue(20);
        //tq.enQueue(22);


        tq.show();
        System.out.println(" The deQueued data"+ tq.deQueue());

//        tq.deQueue();
//        tq.deQueue();
//        tq.deQueue();

        tq.show();

    }
}
