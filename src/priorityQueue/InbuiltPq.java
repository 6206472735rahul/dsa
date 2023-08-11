package priorityQueue;

import java.util.PriorityQueue;

public class InbuiltPq {
    public static void main(String[] args) {
        int arr[]={1,2,3,45,6,7};
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
       // System.out.println(pq.peek());// by default getMinimum value in pq like 1
        System.out.println(pq.size());
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
