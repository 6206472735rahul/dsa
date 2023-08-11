package stack;

public class StackUsingArrays {
    //declared arrays
    private int arr[];
    private int topIndex;// track the index of arrays position

    //create a constructor
    public StackUsingArrays() {
        //declared arrays size
        arr = new int[1];
        topIndex = -1;
    }
    //arrays size increase as you want
    public StackUsingArrays(int size){
         arr= new int[size];
         topIndex=-1;
    }

    //create a function for push
    //tc 0(1)
//    public void push(int elem) throws StackFullExcetion {
//        //if satck is full
//        if (topIndex == arr.length - 1) {
//            //throw exception
//            //create a object of stackfullException
//            StackFullExcetion e = new StackFullExcetion();
//           throw e;
//        }
//        // topIndex++; or
//        arr[++topIndex] = elem;
//    }

    //this is a 2nd way to find doublecapacity
    public void push(int elem)  {
        //if satck is full
        if (topIndex == arr.length - 1) {
            doubleCapacity();
        }
        // topIndex++; or
        arr[++topIndex] = elem;
    }

    //create a function for double capacity
    private void doubleCapacity() {
        //create a new temp[] arrays
        int temp[]=arr;
        arr= new int[2*temp.length];
        for(int i=1;i<temp.length;i++){
            arr[i]=temp[i];
        }

    }

    //create a function for top
    //tc 0(1)
    public int top() throws StackEmptyExcetion {
        if (topIndex == -1) {
            //throw stackEmptyException
//create a object for stackEmptyException
            StackEmptyExcetion empty = new StackEmptyExcetion();
            throw empty;
        }
        return arr[topIndex];
    }

    //create a function for size
    //tc 0(1)
    public int size() {
        return topIndex + 1;
    }

    //create a function for isEmpty
    //tc 0(1)
    public boolean isEmpty() {
        if (topIndex == -1) {
            return true;
        } else {
            return false;
        }
        //or
        //return topIndex==-1; both are same statement
    }

    //create a function for pop
    //tc 0(1)
    public int pop() throws StackEmptyExcetion {
        if (topIndex == -1) {
            //throw stackEmptyException
//create a object for stackEmptyException
            StackEmptyExcetion empty = new StackEmptyExcetion();
            throw empty;
        }
        int temp= arr[topIndex];
        topIndex--;
        return temp;
    }
}