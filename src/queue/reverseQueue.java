package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {

    public static Queue<Integer> reverse(Queue<Integer> q){
        //base case
        if(q.size()==1){
            return q;
        }
        //small calculation
        int front= q.poll();
        //recursive call
        reverse(q);
        //add the front elemnt in q
        q.add(front);
        return q;
    }
    //print()
    // Utility function to print the queue
    static Queue<Integer> queue;

    // Utility function to print the queue
    static void Print() {
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
       queue=reverse(queue);
        Print();
    }

}
