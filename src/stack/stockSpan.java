package stack;

import java.util.Stack;

public class stockSpan {
    //create a function for stock
    public static int[] StockSpan(int price[]){
        //create a stack
        Stack<Integer> stk= new Stack<>();
        //create a new arrays to store all span element(value)
        int span[]= new int[price.length];
         span[0]=1;
        stk.push(0);

        //using loop for travels all price element
        for(int i=1;i<price.length;i++){
            while(!stk.isEmpty() && price[i]>price[stk.peek()]) {
                stk.pop();
            }
            if(stk.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-stk.peek();
            }
            stk.push(i);
        }
        return span;

    }
    //create a function for printing arrays
    public static void printArrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int price[]={100,80,60,70,60,75,85};
        int span[]= StockSpan(price);

     printArrays(span);


    }
}
