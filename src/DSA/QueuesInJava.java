package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesInJava {
    public static void main(String[] args) {
        Queue<Person> supermarket= new LinkedList<>();
        supermarket.add(new Person("Yafet", 8));
        supermarket.add(new Person("Yemar", 5));
        supermarket.add(new Person("Mami", 30));

        System.out.println(supermarket);
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());

        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }
    record Person(String name, int age){

    }
}
