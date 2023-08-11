package LinkedList;

public class Node1<T> {
    T data;
    Node1<T> next;

    public Node1(T data) {
        this.data=data;

    }
    public static Node1<Integer>createLinkedList(){
        Node1 n1= new Node1(1);
        Node1 n2= new Node1(2);
        Node1 n3= new Node1(3);
        Node1 n4= new Node1(4);
        Node1 n5= new Node1(5);
        Node1 n6= new Node1(6);
        //connect
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        return  n1;

    }
    //print
    public static void print(Node1<Integer>head){
        Node1<Integer>temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    //find the length of linked list
    public static int findLength(Node1<Integer>head){
        int count=0;
        Node1<Integer>temp=head;
        while(temp!=null){
            count++;
          //  System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        return count;
    }

    //Increment Every Element In LL

    public static void increment(Node1<Integer>head){
        Node1<Integer>temp=head;
        while(temp!=null){
            temp.data++;
            temp=temp.next;
        }
        System.out.println();
    }

    //insert the element in linked list
    public static Node1<Integer> insert(Node1<Integer>head,int pos,int data){
        Node1<Integer>temp=head;
        //base case
        if(temp==null){
            return null;
        }
        //small calculation
        if(pos==0){
             Node1<Integer> newNode= new Node1<>(data);
             newNode.next=head;
             head=newNode;
             return head;

        }
        //recursive call
     head.next= insert(head.next,pos-1,data);
       return head;

    }
    //delete the node in linkedlist


    public static void main(String[] args) {
     Node1<Integer>head= createLinkedList();
        //System.out.println(findLength(head));
        //increment(head);
        System.out.println(insert(head,2,100));
        print(head);


    }

}

