package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets {
    //create a function for IsBalanced
    public static boolean IsBalanced(String str){
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else {// closing ')'
                if (stack.size() == 0) return false;
                if (stack.peek() == '(') stack.pop();
            }
        }
        if(stack.size()>0){
            return false;
        }
        return true;
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(IsBalanced(str));

    }
}

