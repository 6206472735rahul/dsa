package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueues {
    //define data members
    Queue<Integer> q= new LinkedList<>();
    int size;

    //create a constructor
    public StackUsingQueues(){
        q= new LinkedList<>();
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
    public void push(int x){
        q.add(x);
        size++;
    }
    //create a function for top
    public int top(){ // 1 2 3 4
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.poll());
        }
        //4 3 2 1
        int val= q.peek(); // 4
        q.add(q.poll());
        return  val;
    }
    //CREATE A function for pop()
    public int pop(){
        for(int i=1;i<=q.size()-1;i++){ //1 2 3 4
            q.add(q.poll());
        }
        int val= q.poll(); // 4   -->res= 1 2 3
        return  val;
    }

    public static void main(String[] args) {
        Queue<Integer> st= new LinkedList<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st.peek());
        //System.out.println(st.poll());
        System.out.println(st.size());

    }
}
