package queue;

import java.util.Stack;

public class queueUsingTwoStack {
//define data members
    Stack<Integer>stack= new Stack<>();
    Stack<Integer>extra= new Stack<>();
    int size;

    //implement a constructor
    public queueUsingTwoStack(){
        stack= new Stack<>();
        extra=new Stack<>();
        int size=0;
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
    public void push(int x){
        stack.push(x);
        size++;
    }

    //create a function for pop
    public int pop(){
        while(stack.size()>1){
            extra.push(stack.pop());
        }
        int val= stack.pop();
        while (extra.size()>0){
            stack.push(extra.pop());
        }
        return  val;
      }
      //create a function for top
    public int top(){
        if(stack.size()>1){
            extra.push(stack.pop());
        }
        int val= stack.peek();
        while(extra.size()>0){
            stack.push(extra.pop());
        }
        return val;

    }

    public static void main(String[] args) {
        queueUsingTwoStack obj= new queueUsingTwoStack();
        obj.push(2);
        obj.push(3);
        obj.push(5);
        obj.top();
        obj.pop();
        obj.push(6);
        obj.pop();
        obj.pop();
        obj.top();
        System.out.println(obj.size);
        //System.out.println(obj.pop());


    }

}
