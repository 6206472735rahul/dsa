package stack;

public class StackUse {
    public static void main(String[] args) throws StackFullExcetion, StackEmptyExcetion {
      //  StackUsingArrays stack= new StackUsingArrays(100); //create a object for stack data
//       stack.push(10);
//        System.out.println(stack.top());
//       stack.pop();
//       stack.size();
//        System.out.println(stack.isEmpty());
        //2nd way
       // StackUsingArrays stack= new StackUsingArrays(); //create a object for stack data

        //its is uesd for linkedList
        StackUsingLinkedList<Integer> stack= new StackUsingLinkedList<>();

        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
