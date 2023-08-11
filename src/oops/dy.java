package oops;
// create a own dynamic class
public class dy {
    int data[];
    int nextElementIndex;

    public dy(){
        data= new int[5];
        nextElementIndex=0;
    }
    //size()
    public int size(){
        return nextElementIndex;
    }
    //isEmpty
    public boolean isEmpty(){
        return nextElementIndex==0;
    }
    //get
    public int get(int i){
        if(i>=nextElementIndex){
            return -1;
        }
        return data[i];
    }
    //add
    public void add(int el){
        if(nextElementIndex==data.length){
            doublecapacity();
        }
        data[nextElementIndex]=el;
        nextElementIndex++;

    }
    private void doublecapacity() {
        int temp[]=data;
        data= new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }
    //set
    public void set(int i,int el){
        if(i>=nextElementIndex){
            return;
        }
        data[i]=el;

    }

    //removelast
    public int removelast(){
        int temp= data[nextElementIndex-1];
        data[nextElementIndex]=0;
        nextElementIndex--;
        return temp;
    }
}
