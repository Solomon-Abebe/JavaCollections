package AlgorithmDSA.Sorting.Exercises.MergeSort;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListMerge {
    public static ListNode mergeTwoLinkedLists(ListNode list1, ListNode list2){
        ListNode head = new ListNode(-1);
        ListNode current = head;


        while (list1 !=null && list2 !=null){
            if (list1.data< list2.data) {
                current.next = list1;
                list1 = list1.next;
            }
            else {
                current.next=list2;
                list2=list2.next;
            }
            current =current.next;
        }
        if (list1!=null){
            current.next =list1;
        }else {
            current.next=list2;
        }
        return head.next;
    }
    public static void addData(ListNode head, int data) {
        ListNode newNode = new ListNode(data); // Create a new node

        if (head == null) {
            head = newNode; // If the list is empty, the new node becomes the head
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next; // Traverse to the end of the list
        }
        current.next = newNode; // Attach the new node to the last node
    }


    public static void main(String[] args) {
        ListNode list1 =new ListNode(1);
        addData(list1,3);
        addData(list1,5);
        addData(list1,7);

list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        list1.next.next.next =new ListNode(7)
;

        ListNode list2 = new ListNode(2);
        addData(list2,3);
        addData(list2,4);
        addData(list2,6);
        addData(list2,8);

        ListNode mergedList = mergeTwoLinkedLists(list1,list2);
        while (mergedList!=null) {
            System.out.print(mergedList.data+ " ");
            mergedList = mergedList.next;
        }

    }
}
