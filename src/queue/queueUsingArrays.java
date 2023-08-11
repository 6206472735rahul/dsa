package queue;

public class queueUsingArrays {
private    int arr[];
private    int front;// index of the element of front of queue
private    int rear;// index of the element of end of the queue
  private  int size;

//create a constructor
    public queueUsingArrays(){
        this.arr= new int[5];
        front=-1;
        rear=-1;
        size=0;
    }
    //create a constructor
    public queueUsingArrays(int capacity){
        this.arr= new int [capacity];
        front=-1;
        rear=-1;
        this.size=0;
    }

    //create a function for size
    public int size(){
        return size;
    }

    //create a function for isEmpty
    public boolean isEmpty(){
        return size==0;
    }
    //create a function for enqueue
    public void enqueue(int elem){
        if(size==arr.length){// my arrays is full that get fullexcetionQueue
            //create a object for queuefullException
           // queueFullException q= new queueFullException();
           // throw  new queueFullException();
            doubleCapacity();
        }
        if(size==0){
            front=0;
        }
        //rear++;
        //using the concept of circular queue
//        if(rear==arr.length){
//            rear=0;
//        }
        //or
        rear=(rear+1)% arr.length;
        arr[rear]=elem;
        size++;


    }
//create a function for doublecapacity
    private void doubleCapacity() {
        int temp[]= arr;
        arr= new int[2*temp.length];
        int index=0;
        for(int i=front;i<temp.length;i++){
            arr[index++]=temp[i];
        }
        for(int i=0;i<front-1;i++){
            arr[index++]=temp[i];
        }
        front=0;
        rear=temp.length-1;
    }

    //create a function for front
    public int front() throws frontException {
if(size==0){
//create a object of frontException
//    frontException f= new frontException();
//    throw f;
    throw new frontException();

}
return arr[front];
    }
    //create a function for dequeue
    public int  dequeue() throws frontException {
        if(size==0){
//create a object of dequeueException
//            frontException d= new frontException();
//            throw d;
            throw new frontException();

        }
        int temp= arr[front];
        //front++;
        //using the concept of circular queue
//        if(front==arr.length){
//            front=0;
//        }
        //or
        front=(front+1)% arr.length;
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return temp;

    }
}
