package priorityQueue;

import java.util.PriorityQueue;

public class KLargest {
    public static void KLargestElement(int arr[],int k){
        // i wil use first loop to store only k values in pq and compare with next element
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<k;i++){
          pq.add(arr[i]);
        }
        //2nd loop will be going k to arr.length
        for(int i=k;i<arr.length;i++){
            if(pq.peek()<arr[i]){
                //remove pq element
                pq.poll();
                //add arr[i] element
                pq.add(arr[i]);
            }
        }
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,2,100,4,5};
        int k=4;
        KLargestElement(arr,k);
    }
}
