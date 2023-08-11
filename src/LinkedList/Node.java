package LinkedList;

//public class Node {
//    int data;
//    Node next;
//
//    //create a constructor
//    public Node(int data){
//        this.data=data;
//    //  this.next=next;//Value 'next' is always 'null'
//        next=null;   //Variable 'next' is assigned to itself
//    }
//}
// first method this method only print integer value

//2nd method it will print any type of data using generic method like Node<T>
public class Node<T> {
    T data;
    Node<T> next;

    //create a constructor
    public Node(T data){
        this.data=data;
        //  this.next=next; Value 'next' is always 'null'
       // next=null;   //Variable 'next' is assigned to itself
    }
}