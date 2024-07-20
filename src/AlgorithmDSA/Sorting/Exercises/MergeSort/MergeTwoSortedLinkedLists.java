package AlgorithmDSA.Sorting.Exercises.MergeSort;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeTwoSortedLinkedLists {
    private Node head;
    // Function to merge two sorted linked lists
    public void mergeLists(Node head1, Node head2) {
        Node mergedHead = null;// pointer
        Node current = null; // pointer

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                // Append head1 node to the merged list
                if (mergedHead == null) {
                    mergedHead =  head1;
                    current = head1;
                } else {
                    current.next = head1;
                    current = current.next;
                }
                head1 = head1.next;
            } else {
                // Append head2 node to the merged list
                if (mergedHead == null) {
                    mergedHead = current = head2;
                } else {
                    current.next = head2;
                    current = current.next;
                }
                head2 = head2.next;
            }
        }

        // Append remaining nodes of head1 or head2, if any
        if (current != null) {
            if (head1 != null){
                current.next=head1;

            }else {
                current.next=head2;
            }
           // current.next = (head1 != null) ? head1 : head2;
        } else {
            // Handle the case where both lists were empty
            /*
            if(head1 !=null){
            mergedHead = head1
            } else{
            mergedHead = head2
            }
             */
            mergedHead = (head1 != null) ? head1 : head2;
        }

        // No need to return a value as modifications are made on the original lists
        head = mergedHead; // Update head of the first list to point to the merged list
    }
    // Method to add a new element at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeTwoSortedLinkedLists list1 = new MergeTwoSortedLinkedLists();
        MergeTwoSortedLinkedLists list2 = new MergeTwoSortedLinkedLists();

        // Create sample linked lists using the add method
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        System.out.println("Original lists:");
        list1.printList();
        list2.printList();

        MergeTwoSortedLinkedLists list = new MergeTwoSortedLinkedLists();// for clarity and readability

        list.mergeLists(list1.head, list2.head);  // No need to assign the result
        System.out.println("\nMerged list:");
        list.printList();
    }
}
