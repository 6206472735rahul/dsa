package stack;

import java.util.LinkedList;

public class stack1 {
   private   int[] arr;
   private   int topIndex;

    //create a constructor
//    public stack1(){
//        arr= new int[1];
//        topIndex=-1;
//    }
    public stack1(int size){
        arr= new int[size];
        topIndex=-1;
    }

    //create a push function
    public  void push(int el){
        //if stack full
        if(topIndex==arr.length-1){
            doubleCapacity();
        }
        arr[topIndex]=el;
        topIndex++;
    }

    private void doubleCapacity() {
        int temp[]= arr;
        arr= new int[2*temp.length-1];
        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
    }

    //create a function for size
    public  int size(){
        return  topIndex++;
    }

    //create a function for isEmpty
    public  boolean isEmpty(){
        return topIndex==0;
    }
    //create a function for top
    public  int top() throws stack2EmptyException{
        if(topIndex==-1){
            stack2EmptyException empty= new stack2EmptyException();
            throw  empty;
        }
        return arr[topIndex];
    }

    //create a function for pop
    public  int pop(int i) throws stack2FullException {
        if(topIndex==-1){
            stack2FullException exception= new stack2FullException();
            throw exception;
        }
     int temp= arr[topIndex];
     topIndex--;
     return temp;
    }


    public static void main(String[] args) throws stack2EmptyException, stack2FullException, StackEmptyExcetion {
        //its used for linkedlist
        StackUsingLinkedList<Integer> stack= new StackUsingLinkedList<>();
       // int arr[]={10,20,30,40,50};
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
