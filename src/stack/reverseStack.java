package stack;

import java.util.Stack;

public class reverseStack {

    //create a function for reverse stack
    public static void reverse(Stack<Integer> input,Stack<Integer> extra){
      //base case
        if(input.size()<=1){
            return;
        }
        //small calculation
        int temp= input.pop();// 1 element remove from input stack
        //recursive call
        reverse(input,extra);

        //first loop work for input stack all input data remove from top and shift in extra stack
        while(!input.isEmpty()){
            int top= input.pop();
            extra.push(top);
        }
        input.push(temp);// again push temp value in input stack
        // //2nd loop work for extra stack all extra data remove from top and shift in again shift input stack
        while(!extra.isEmpty()){
            int top= extra.pop();
            input.push(top);
        }
    }
    public static void main(String[] args) {
       // int arr[]={1,2,3,4,5,6};
        Stack<Integer> input= new Stack<>();
        Stack<Integer>extra= new Stack<>();
        reverse(input,extra);
        for(int i=1;i<=5;i++){
            input.push(i);
        }
while(!input.isEmpty()){
    System.out.println(input.pop());
}
    }
}
