package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class InbuiltMapUse {

    // remove duplicates
    public static ArrayList<Integer> removeDup(int arr[]) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                continue; // if key is already present that it will do skip and continue further
            }
            output.add(arr[i]);
            map.put(arr[i], true);
        }
        return output;
    }

    //Maximum Frequency Number
    public static int maxFreq(int arr[]) {
        HashMap<Integer,Integer> map= new HashMap<>();
       for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i], map.get(arr[i])+1);
           }
           else{
               map.put(arr[i],1);
           }
       }
       int maxel= arr[0];
       int max= Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           if(map.get(arr[i])>max){
               max= map.get(arr[i]);
               maxel=arr[i];
           }
       }
       return maxel;
    }

    //print intersection
    public static void printIntersection(int arr1[],int arr2[]){
        HashMap<Integer,Integer> map= new HashMap<>();
        // map ke ander arr1 ka keys as well as value dal denge after that i will compare arr2
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else{
                map.put(arr1[i],1);
            }
        }
        //compare with arr2[]
        for(int i=0;i<arr2.length;i++){
            int freq= map.get(arr2[i]);
            if(freq>0){//to ham  intersection nikal sakte
                System.out.print(arr2[i]+" ");
                map.put(arr2[i],freq-1);

            }
        }

        }
        //Pair Sum to 0
    public static int pairSumTo0(int arr[],int size){
        HashMap<Integer,Integer> map= new HashMap<>();
        int countPair=0;
        for(int i=0;i<size;i++){
            if(map.containsKey(-arr[i])){
                countPair=countPair+map.get(-arr[i]);
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }
                else{
                    map.put(arr[i],1);
                }
            }
            else if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        return countPair;
    }

    //longest consecutive subsequence
    public static void longestConsecutive(int arr[]){
        HashMap<Integer,Boolean> map= new HashMap<>();
        HashMap<Integer,Integer> map1= new HashMap<>();
        //assume my all map data is start subsequence
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],true);
            }
        }
        // if it is not start subsequence than make false
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(map.get(arr[i]-1))){
                map.put(arr[i],false);

            }
        }
        //now i am print only true start subsequence
        int maxS=0;
        int maxl=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(map.get(arr[i])==true)){
                int templ=1;
                int temps= map1.get(arr[i]);
                while(map1.containsKey(temps+templ)){
                    templ++;
                }
                if(templ>maxl){
                    maxS=temps;
                    maxl=templ;
                }
            }
            for(int templ=0;i<maxl;i++){
                System.out.println(maxS+i);
            }
        }
    }

        public static void main (String[]args){
        int arr[]={1,2,3,4,5,6,7,8};
        longestConsecutive(arr);
           // System.out.println(pairSumTo0(arr,5));
//            int arr1[] = {1,2,3,4,1,1,1,2,3};
//            int arr2[] = {1,2,3,4,1,1,};
//            printIntersection(arr1,arr2);
         //   System.out.println(maxFreq(arr));

            //  ArrayList<Integer> res= removeDup(arr);
            // System.out.print(res+"  ");
            //Maximum Frequency Number
//            HashMap<Integer, Integer> map = new HashMap<>();
//            for (int i = 0; i < arr.length; i++) {
//                if (map.containsKey(arr[i])) {
//                    map.put(arr[i], map.get(arr[i]) + 1);
//                } else {
//                    map.put(arr[i], 1);
//                }
//            }
//            System.out.println(map.entrySet());
//            int maxel= arr[0];
//            int max=Integer.MIN_VALUE;
//            for(int i=0;i<arr.length;i++){
//                if(map.get(arr[i])>max){
//                    max= map.get(arr[i]);
//                    maxel=arr[i];
//                }
//            }
//            System.out.println(maxel);


//        HashMap<String,Integer> map= new HashMap<>();
//        //put() means insert the element in hashmap  tc--> 0(1)
//        map.put("abc",1);// abc--> 1-->update karke-->4
//        map.put("def",2);
//        map.put("efg",3);
//        map.put("abc",4);// abc values update with new values
//
//        //size() tc--> 0(1)
//        System.out.println(map.size());
//        // containsKey()-->presence it means check the key is present or not  tc--> 0(1)
//        if(map.containsKey("abc")){
//            System.out.println("yes");
//        }
//        //getValue()  tc--> 0(1)
//        int v= map.get("abc");
//        System.out.println(v);
//        //or
//       // int v1= map.get("pqrs"); //if key is not present but you access it that time it will give you nullPinterException
//       // System.out.println(v1);
//
//        // handle nullPointerException
//        int v1=0;
//        if(map.containsKey("pqrs")){
//          v1= map.get("pqrs");
//        }
//        System.out.println(v1);
//
//        //remove()  tc--> 0(1)
//        map.remove("abc");
//        System.out.println(map.keySet());// if you use keySet() then you can print (access) all keys
//
//        // print all keys using iterate
//        Set<String> keys= map.keySet(); // tc--> 0(n)
//        for(String s:keys){
//            System.out.print(s+" ");
//        }
//        //containsValues res will give in form of boolean  tc--> 0(1)
//        System.out.print(map.containsValue(2));
        }
    }
