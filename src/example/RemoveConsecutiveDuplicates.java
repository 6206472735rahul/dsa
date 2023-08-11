package example;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
    //create a fun() for arrays list
    public static ArrayList<Integer> removeDuplicates(int arr[]){
        //syntax of arrays list
        ArrayList<Integer> res= new ArrayList<>();
        res.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                res.add(arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={10,10,20,2020,40,10};
        ArrayList<Integer> res= removeDuplicates(arr);
        //print the arraylist element
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }

    }
}
