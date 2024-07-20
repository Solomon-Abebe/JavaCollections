package DSA;

public class LinkedList {
    Node head;
    public void insertAtStart(int data){
        // create node object
        Node node = new Node();
        node.data=data;
        node.next=null;// this is default value even if not written
        if (head==null){
            head=node;
        }
        else {
            Node n=head;
            while (n.next!=null){
                n=n.next;
         }
            n.next=node;

        }
    }
    public void show(){
        Node node=head;
        while(node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
    public void insertAtPosition(int index, int data){
        Node  node = new Node();
        node.data = data;
        node.next = null;

        if (index==0){
            insertAtStart(data);
        }else {
            Node current = head;
            for (int i = 0; i <index-1 ; i++) {
                current = current.next;

            }
            node.next = current.next;
            current.next = node;
        }
    }
    public void removeAtPosition(int index){
        if (head == null){
            System.out.println("List is empty");
        }
        if (index == 0){
            head = head.next;
        }else {
            Node current = head;
            Node previous = null;
            for (int i = 0;current!=null && i < index; i++) {// no need to add the condition 'current!=null'
                previous = current;
                current = current.next;

            }
            if (current == null){
                System.out.println("Index out of bound");
            }
            // assert previous != null;// these assertions are for maintenance and readability
           // assert current != null;
            previous.next = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(18);
        list.insertAtStart(45);
        list.insertAtStart(12);
        list.insertAtStart(25);

        list.show();
        System.out.println("After insert at position");
        list.insertAtPosition(2,39);
        list.removeAtPosition(4);
        list.show();
    }
}
