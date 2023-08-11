package priorityQueue;

import java.util.ArrayList;

public class Pq {
    ArrayList<Integer> heap;
    //create a constructor
    public Pq(){
        heap= new ArrayList<>();
    }
    //create a insert function
    public void insert(int element){
        heap.add(element);
        int childIndex=heap.size()-1;
        int parentIndex= (childIndex-1)/2;
        while(childIndex>0){
            if(heap.get(childIndex)<heap.get(parentIndex)){
                int temp= heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,childIndex);
                childIndex=parentIndex;
                parentIndex= (childIndex-1)/2;
            }
            else{
                return;
            }
        }

    }

    //create a getmin function
    public int getMin() throws PqException {
if(isEmpty()){
    throw new PqException();
}
return heap.get(0);
    }

    //create a PqException class
    public class PqException extends Exception{

    }

    //create a remove function
    public int remove() throws PqException {
if(isEmpty()){
    throw  new PqException();
}
int ans=heap.get(0);
heap.set(0,heap.get(heap.size()-1));
heap.remove(heap.size()-1);
// heapify down
       int parentIndex=0;
       int minIndex= parentIndex;
       int leftChildIndex= 2*parentIndex+1;
       int rightChildIndex= 2*parentIndex+2;
       while(leftChildIndex<heap.size()){
           if(heap.get(leftChildIndex)<heap.get(minIndex)){
               minIndex=leftChildIndex;
           }
           if(rightChildIndex< heap.size() && heap.get(rightChildIndex)<heap.get(minIndex)){
               minIndex=rightChildIndex;
           }
           if(minIndex==parentIndex){
               break;
           }
           else{
               //swap
               int temp= heap.get(minIndex);
               heap.set(minIndex,heap.get(parentIndex));
               heap.set(parentIndex,temp);
               parentIndex=minIndex;
               leftChildIndex= 2*parentIndex+1;
               rightChildIndex=2*parentIndex+2;
           }

       }
       return ans;
    }

    //create a size function
    public int size(){
return heap.size();
    }
    // create a isEmpty function
    public boolean isEmpty(){
 return  heap.size()==0;

    }

    public static void main(String[] args) throws PqException {
        Pq p= new Pq();
        p.insert(10);
        p.insert(20);
        p.insert(30);
        if(!p.isEmpty()){
            System.out.println(p.getMin());
            p.remove();
        }
    }

}
