package LinkedList;
//write a program to print like that 10->20->30->40->50
public class LinkedListUse1 {

    //create a function for print linked list
    public static Node<Integer> CreateLinkedlist() {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        //conneting all node to each other
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }
    //print
    public static void print(Node<Integer> head) {
    //1st way

    // System.out.print(head+" ");
//        System.out.print(head.data+"-> ");
//        System.out.print(head.next.data+"-> ");
//        System.out.print(head.next.next.data+"-> ");
//        System.out.print(head.next.next.next.data+"-> ");
//        System.out.print(head.next.next.next.next.data+" ");

    // 2nd ways usin loop
//        while(head!=null) {
//            System.out.print(head.data + "->");
//            head = head.next;
//        }

    //3rd way
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
}

    //create a function for increment every element in linked list(LL)
    public static void increment(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            // System.out.println(temp.data);
            temp.data++;
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
//print createlinked list
        Node<Integer> head= CreateLinkedlist();
        increment(head);
        print(head);

    }

}
