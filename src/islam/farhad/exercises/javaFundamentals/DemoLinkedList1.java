package islam.farhad.exercises.javaFundamentals;

import java.util.LinkedList;

// Efficient for insertion and deletion
public class DemoLinkedList1 {
    public static void main(String[] args) {
        //LinkedList as stack
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.push("A");
        linkedList1.push("B");
        linkedList1.push("C");
        linkedList1.push("D");
        linkedList1.push("E");

        System.out.println(linkedList1);
        linkedList1.pop();
        System.out.println(linkedList1);


        //LinkedList as queue
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.offer("A");
        linkedList2.offer("B");
        linkedList2.offer("C");
        linkedList2.offer("D");
        linkedList2.offer("E");

        System.out.println(linkedList2);
        linkedList2.poll();
        System.out.println(linkedList2);


        linkedList2.add("0");
        System.out.println(linkedList2);

        linkedList2.remove("0");
        System.out.println(linkedList2);

        linkedList2.addFirst("First Element");
        System.out.println(linkedList2);
        linkedList2.addLast("Last Element");
        System.out.println(linkedList2);

        System.out.println(linkedList2.peek());
        System.out.println(linkedList2.peekFirst());
        System.out.println(linkedList2.peekLast());


    }
}
