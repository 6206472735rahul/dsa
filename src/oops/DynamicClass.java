package oops;

public class DynamicClass {
    int data[];
    int nextElementIndex;

    // create a constructor
    public DynamicClass() {
        // create a new arrays
        data = new int[5];
        nextElementIndex = 0;
    }

    //create a fun() for size
    public int size() {
        return nextElementIndex;
    }

    //create a fun() for IsEmpty
    public boolean IsEmpty() {
        return nextElementIndex == 0;
    }

    // create a fun() for get
    public int get(int i) {
        if (i >= nextElementIndex) {
            //throw err
            return -1;
        }
        return data[i];
    }

    //create a fun() for add
    public void add(int el) {
        if (nextElementIndex == data.length) {
            doubleCapacity();
        }
        data[nextElementIndex] = el;
        nextElementIndex++;
    }

    //create a fun() for doubleCapacity of my arrays
    private void doubleCapacity() {
        int temp[] = data;
        //copy the original arrays and double it
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    //create a fun() for set
    public void set(int i, int el) {
        if (i >= nextElementIndex) {
            //err
            return;
        }
        data[i] = el;
    }
    //create a fun() for removeLast
    public int removeLast(){
        int temp= data[nextElementIndex-1];
        data[nextElementIndex-1]=0;
        nextElementIndex--;
        return temp;
    }
}


