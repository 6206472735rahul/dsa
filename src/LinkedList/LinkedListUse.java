package LinkedList;

public class LinkedListUse {
    public static void main(String[] args) {
        //object
        Node n1= new Node(10);
        Node n2= new Node(20);
        System.out.println(n1);// n1-->reference,-->LinkedList.Node@7b23ec81
        System.out.println(n1.data);//10
        System.out.println(n1.next);// null
        System.out.println(n2);// n1-->reference,-->LinkedList.Node@6acbcfc0
        System.out.println(n2.data);//20
        System.out.println(n2.next);// null
    }
}

//2nd method


