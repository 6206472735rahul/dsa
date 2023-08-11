package Recursion3;

import java.util.Scanner;

public class recursion3 {
    //create a function for printAllSubsequence
    public static String[] printAllSubsequence(String str) {
        //base case
        if (str.length() == 0) { // str[]="xyz"
            String ans[] = {""};
            return ans;
        }
        //recursive call for smallOutput // call--> ["",z,y,yz]
        String smallAns[] = printAllSubsequence(str.substring(1));
        String ans[] = new String[2 * smallAns.length];
        //copies all smallAns[] value into ans[]-->ans=["",z,y,yz]
        for (int i = 0; i < smallAns.length; i++) {
            ans[i] = smallAns[i];
        }
        // add the the value 0 index into ans[]-->["",z,y,yz]+x,xz,xy,xyz
        for (int i = 0; i < smallAns.length; i++) {
            ans[i + smallAns.length] = str.charAt(0) + smallAns[i];//-->ans=["",z,y,yz,x,xz,xy,xyz]
        }
        return ans;//ans=["",z,y,yz,x,xz,xy,xyz]-->res
    }


    //create a Helper function for SingleDigit using String array
    public static String[] SingleDigit(int n) {
        if (n == 0 || n == 1) {
            String output[] = {""};
            return output;
        }
        if (n == 2) {
            String output[] = {"a", "b", "c"};
            return output;
        } else if (n == 3) {
            String output[] = {"d", "e", "f"};
            return output;
        } else if (n == 4) {
            String output[] = {"g", "h", "i"};
            return output;
        } else if (n == 5) {
            String output[] = {"j", "k", "l"};
            return output;
        } else if (n == 6) {
            String output[] = {"m", "n", "o"};
            return output;
        } else if (n == 7) {
            String output[] = {"p", "q", "r", "s"};
            return output;
        } else if (n == 8) {
            String output[] = {"t", "u", "v"};
            return output;
        } else {
            String output[] = {"w", "x", "y", "z"};
            return output;
        }
    }

    public static String[] printKeypad(int n) { //23|4
        //base case
        if (n==0) {
            String ans[] = {""};
            return ans;
        }
        // recursive call for smallAns
        String smallAns[] = printKeypad(n / 10); //23
        String singleDigitOutput[] = SingleDigit(n % 10);// 4
        //create a new String arrays ans take the double size
        String copyArray[] = new String[singleDigitOutput.length * smallAns.length];
        int k=0;
        for(int i=0;i<singleDigitOutput.length;i++){
            for(int j=0;j<smallAns.length;j++){
                copyArray[k]=singleDigitOutput[i]+smallAns[j];
                k++;

            }
    }
        return copyArray;
}

//print factorial
    public static int factorial(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
      return n*factorial(n-1);
    }
    //find the minimum in the arrays
//    public static int minimum(int arr[],int startIndex){
//        //base case
//        if(startIndex==arr.length){
//            return Integer.MAX_VALUE;
//        }
//        return
//


    //}

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // System.out.println("Enter string");
//        String st= sc.nextLine();
      //  String res[]= printAllSubsequence(str);
      //  int n= sc.nextInt();
       // String output[]=printKeypad(n);
        //print string
       // for(int i=1;i<output.length;i++){
         //   System.out.println(output[i]);
       // int n=5;
       // System.out.println("fact="+factorial(n));
        int arr[]={1,2,3,4,5};
        //int min= Integer.MAX_VALUE;// min=5
        }

    }

