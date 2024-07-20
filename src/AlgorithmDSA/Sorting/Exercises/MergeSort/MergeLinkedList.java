package AlgorithmDSA.Sorting.Exercises.MergeSort;

class ListNode0 {
    int val;
    ListNode0 next;

    ListNode0(int val) {
        this.val = val;
        this.next = null;
    }
}

class MergeSortLinkedList {

    public ListNode0 mergeSort(ListNode0 head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Split the linked list into two halves
        ListNode0 middle = findMiddle(head);
        ListNode0 nextToMiddle = middle.next;
        middle.next = null;

        // Recursively sort the two halves
        ListNode0 leftHalf = mergeSort(head);
        ListNode0 rightHalf = mergeSort(nextToMiddle);

        // Merge the sorted halves
        return merge(leftHalf, rightHalf);
    }

    private ListNode0 merge(ListNode0 left, ListNode0 right) {
        ListNode0 dummy = new ListNode0(0);
        ListNode0 current = dummy;

        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }

        return dummy.next;
    }

    private ListNode0 findMiddle(ListNode0 head) {
        ListNode0 slow = head;
        ListNode0 fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
//    int count = 0;
//    ListNode0 current = head;
//
//    // Count the number of nodes in the linked list
//    while (current != null) {
//        count++;
//        current = current.next;
//    }
//
//    // Traverse to the middle node
//    current = head;
//    for (int i = 0; i < count / 2; i++) {
//        current = current.next;
//    }
//
//    return current;
//}

    public void printList(ListNode0 head) {
        ListNode0 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSortLinkedList sorter = new MergeSortLinkedList();

        ListNode0 head = new ListNode0(4);
        head.next = new ListNode0(2);
        head.next.next = new ListNode0(1);
        head.next.next.next = new ListNode0(3);

        System.out.println("Original list:");
        sorter.printList(head);

        head = sorter.mergeSort(head);

        System.out.println("Sorted list:");
        sorter.printList(head);
    }
}
