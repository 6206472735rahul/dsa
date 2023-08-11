package stack;

import java.util.Scanner;
import java.util.Stack;

public class redundant {
    //create a function for redundant
    public static boolean checkRedundant(String str){
        //create a stack
        Stack<Character> stack= new Stack<>();
        //using loop for travels all char of string
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='('||ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                stack.push(ch);
            }
            else{
                if(ch==')'){
                    char top= stack.peek();
                    if(top=='('){
                        return true;
                    }
                    else{
                        while(stack.peek()!='('){
                            stack.pop();
                        }
                        stack.pop();
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(checkRedundant(str));

    }
}
