package DSA.PracticesExtra;

import java.util.LinkedList;
import java.util.Stack;

public class Node {
    int data;
    Node next;
}
class Main{
    public static void main(String[] args) {
        LinkedList<String> linkedListStack = new LinkedList<>();
        // Stack
        linkedListStack.push("A");
        linkedListStack.push("B");
        linkedListStack.push("C");
        linkedListStack.push("D");
        linkedListStack.push("F");

        System.out.println(linkedListStack);

        linkedListStack.pop();
        //linkedListStack.push("G");
        linkedListStack.add(2,"H");
        linkedListStack.remove(3);
        System.out.println(linkedListStack);

        LinkedList<Integer> linkedListQueue = new LinkedList<>();
        linkedListQueue.offer(1);
        linkedListQueue.offer(2);
        linkedListQueue.offer(2);
        linkedListQueue.offer(3);
        linkedListQueue.offer(42);
        linkedListQueue.offer(52);

        System.out.println(linkedListQueue);
        linkedListQueue.poll();
        System.out.println(linkedListQueue);
        Stack stck = new Stack<>();

    }
}