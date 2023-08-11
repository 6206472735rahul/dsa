package queue;
import LinkedList2.node;
public class queueUsingLinkedList<T> {
   private  node<T> front;
    private node<T> rear;
    int size;

    //create a constructor
    public queueUsingLinkedList(){
        front=null;
        rear=null;
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

    //create a function for enqueue
    public void enqueue(T elem){

        node<T> newNode= new node<>(elem);
        size++;
if(front==null||rear==null){
    front=newNode;
    rear=newNode;
}
else{
    rear.next=newNode;
    rear=rear.next;
}
    }
    //create a function for front
    public T front() throws frontException {
        if(front==null){
            throw new frontException();
        }
        return front.data;
    }

    //create a function for dequeue
    public T dequeue()throws frontException {
            if(front==null){
                throw new frontException();
            }
            T temp= front.data;
            front=front.next;
            if(front==null){
                rear =null;
            }
            size--;
            return temp;

    }

}
