package priorityQueue;

public class InplaceHeapSort {
//create a function for Heap sort
    public static void HeapSort(int arr[]){
        // step1 build heap
        int n= arr.length;
        for(int i=(n/2)-1;i>=0;i--){
            downHeapify(arr,i,n);
        }
        //step2 remove the elements from starting and put them at last position
        for(int i=n-1;i>=0;i--){
            int temp= arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            downHeapify(arr,0,i);
        }
    }

    private static void downHeapify(int[] arr, int i, int n) {
        int parentIndex=i;
        int leftChildIndex= 2*parentIndex+1;
        int rightChildIndex= 2*parentIndex+2;
        while(leftChildIndex<n){
            int minIndex=parentIndex;
            if(arr[leftChildIndex]<arr[minIndex]){
                minIndex=leftChildIndex;
            }
            if(rightChildIndex<n && arr[rightChildIndex]<arr[minIndex]){
                minIndex=rightChildIndex;
            }
            if(minIndex==parentIndex){
                return;
            }
            else{
                //swap
                int temp= arr[parentIndex];
                arr[parentIndex]=arr[minIndex];
                arr[minIndex]=temp;
                parentIndex=minIndex;
                leftChildIndex= 2*parentIndex+1;
                rightChildIndex=2*parentIndex+2;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]= {4,3,5,6,7,8,9,1};
        HeapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
