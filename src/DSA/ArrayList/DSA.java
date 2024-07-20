package DSA.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DSA {
    public static void main(String[] args) {
        List<Integer> l1 = new  ArrayList<>();
        l1.add(0,1);
        l1.add(1,2);
        l1.add(2,5);
        l1.add(10);
        l1.add(3,13);
        System.out.println(l1);
        List<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(8);
        l2.add(3);
        System.out.println(l2);
        l1.addAll(1,l2);

        System.out.println(l1);
        l2.addAll(2,l1);
        System.out.println(l2);
        l1.set(0,-9);
        System.out.println(l1);
        l1.remove(1);
        System.out.println(l1);

        l1.remove(4);// remove by index
        l1.add(2);//remove by object
        System.out.println(l1);
        System.out.println(l2.get(3));// accessing by index

        System.out.println("Last Occurrence of 2: "+ l1.lastIndexOf(2));
        System.out.println("First Occurrence of 2: "+ l1.indexOf(2));

        System.out.println("Check if it contains 10: "+l1.contains(10));

        System.out.println("USING FOR LOOP FOR ITERATION");
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
        System.out.println(" USING FOR EACH LOOP");
        for (int j:l2) {
            System.out.print(j+" ");

        }
        System.out.println();
        System.out.println(" HashCode value of l1: "+ l1.hashCode());

        List<Integer> l3 = new ArrayList<>(3);
        // add elements beyond the initial capacity of the list
        l3.add(15);
        l3.add(17);
        l3.add(18);
        l3.add(21);
        l3.add(22);
        System.out.println("Elements in l3: "+l3);

        List<Integer> s1 = new Stack<>();
        int n =5;
        for (int i = 1; i <=n ; i++) {
            s1.add(i);
        }
        s1.add(2,8);
        s1.add(6);
       // s1.push(19); use this when the class List is explicitly defined as Stack<Integer> s1 = new Stack<>()
        System.out.println("Elements in the stack: "+s1);
       // s1.remove(3);

        for (int i = 0; i < s1.size() ; i++) {
            System.out.print(s1.get(i)+" ");

        }
        int m=5;
        List<Integer> ll1 = new LinkedList<>();

        for (int i=1; i<=m; i++){
            ll1.add(i);
        }
        System.out.println();
        ll1.add(2,8);
        System.out.println("Elements in the LinkedList: "+ll1);

        //ll1.remove(2);
        for (int i = 0; i < ll1.size(); i++) {
            System.out.print(ll1.get(i)+" ");

        }

    }
}
