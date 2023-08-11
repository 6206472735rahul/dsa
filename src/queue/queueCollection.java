package queue;
import java.util.LinkedList;
import java.util.Queue;
public class queueCollection {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        q.add(40);
//        q.add(50);
//        System.out.println(q.size());
//       // System.out.println(q.poll());
//       // q.poll();
//        q.remove();
//        System.out.println(q.size());
//        System.out.println(q.peek());

        //2nd way
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        System.out.println(q.size());
        System.out.println(q.peek()+q.size());


    }
}