package stack;

import LinkedList2.node;

public class StackUsingLinkedList<T> {
    private node<T> head;
    private int size;//track the inkedlist index position

    //create a constructor
    public StackUsingLinkedList(){
        head=null;
        size=0;
    }
    //create a function for size
    public int size(){
        return  size;
    }
    //create a function for isEmpty
    public boolean isEmpty(){
        return size==0;
    }
    //create a function for push
    public  void  push(T elem){
        node<T> newNode= new node<T>(elem);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        size++;

    }
    //create a function for top
    public T top() throws StackEmptyExcetion{
       if(head==null){
           StackEmptyExcetion empty= new StackEmptyExcetion();
           throw  empty;
       }
       return head.data;
    }

    //create a function for pop
    public T pop() throws StackEmptyExcetion{
        if(head==null){
            StackEmptyExcetion empty= new StackEmptyExcetion();
            throw  empty;
        }
      T temp= head.data;
        head=head.next;
        size--;
        return temp;


    }
}

