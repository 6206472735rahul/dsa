package priorityQueue;

import java.util.ArrayList;

public class Priority_Queue <T> {
  public  ArrayList<Element<T>> heap;
   public  void priority_Queue()
   { //initialization of arraylist because its a reference
       heap= new ArrayList<>();
   }
//create a function for insert the element in priority queue
    public  void insert(T value,int priority){
Element<T> e= new Element<>(value,priority);
heap.add(e);
int childIndex= heap.size()-1;// get child index
//int parentIndex= (childIndex-1)/2;//get parent index
        while( childIndex>0){
            int parentIndex= (childIndex-1)/2;//get parent index
            if(heap.get(childIndex).priority < heap.get(parentIndex).priority){
                Element<T> temp= heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);
                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }
            else{
                return;
            }
        }

   }

    //create a getMin()
    public T getMin() throws priorityException {
        if(isEmpty()){
            throw new priorityException();
        }
        else{
          return heap.get(0).value;
        }
    }
// create a removeMin element function
    public T removeMin() throws priorityException {// [5 10 15 20 25 30]
        if(isEmpty()){
            throw new priorityException();
        }
Element<T> remove= heap.get(0);
        T ans= remove.value;
heap.set(0,heap.get(heap.size()-1));
heap.remove(heap.size()-1);
int parentIndex=0;
int childLeftIndex= 2*parentIndex+1;
int childRightIndex= 2*parentIndex+2;
while(childLeftIndex<heap.size()) {
    int minIndex = parentIndex;
    if (heap.get(childLeftIndex).priority < heap.get(minIndex).priority) {
        minIndex = childLeftIndex;
    }
    if (childRightIndex<heap.size()&& heap.get(childRightIndex).priority < heap.get(minIndex).priority) {
        minIndex = childRightIndex;
    }
    if(minIndex==parentIndex){
        break;
    }
//swap
    Element<T> temp = heap.get(minIndex);
    heap.set(minIndex, heap.get(parentIndex));
    heap.set(parentIndex, temp);
    parentIndex = minIndex;
    childLeftIndex = 2 * parentIndex + 1;
    childRightIndex = 2 * parentIndex + 2;
}
return ans;
    }
    //create a size()
    public int size(){
return heap.size();
    }
    //create a isEmpty()
    public boolean isEmpty(){
       if(size()==0){
           return true;
       }
       else{
           return  false;
       }

    }

    public static void main(String[] args) throws priorityException {
        Priority_Queue<String> pq= new Priority_Queue<String>();
        pq.insert("abc",15);
        pq.insert("def",30);
        pq.insert("ghi",10);
        pq.insert("jkl",100);
        while(!pq.isEmpty()){
            System.out.println(pq.getMin());
            pq.removeMin();
        }
    }
}
