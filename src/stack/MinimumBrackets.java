package stack;

import java.util.Scanner;
import java.util.Stack;

public class MinimumBrackets {

    //create a function for minimum Brackets reversal
    public static int minimumBracketReversal(String str){
        if(str.length()%2!=0){// not balanced (even case) 0r odd case unbalanced
            return -1;
        }
        Stack<Character>st= new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == '{') {
                st.push(ch);
            } else {
                if (!st.isEmpty() && st.peek() == '{') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }
        // unbalanced
        int count=0;
        while (!st.isEmpty()){
            char ch1= st.pop();
            char ch2=st.pop();
            //when ever char1 and char 2 is not eqaul then always count will be  increased by 2
            if(ch1!=ch2){
                count=count+2;
            }
            else{
                count=count+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(minimumBracketReversal(str));

    }
}
