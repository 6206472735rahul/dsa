package stack;
import java.util.Stack;
public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
