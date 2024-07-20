package DSA.Linkedlist;

import java.util.LinkedList;
public class BuiltInApproach {

        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();

            // Adding elements to the LinkedList
            list.add(1);
            list.add(2);
            list.add(3);

            list.remove(1);
            list.addLast(6);
            list.addFirst(7);
            list.add(0,5);

            // Displaying the elements of the LinkedList
            System.out.print("LinkedList: ");
            for (Integer element : list) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
