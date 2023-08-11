package queue;

public class queueUse {
    public static void main(String[] args)  {
       // queueUsingArrays queue= new queueUsingArrays(4);
        //using linked list
        queueUsingLinkedList<Integer> queue= new queueUsingLinkedList<>();
        int arr[]={10,20,30,40,50,60,70};
        for(int elem : arr){
                queue.enqueue(elem);
            }
        while (!queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            }
            catch (frontException e){

            }

        }
    }
}
