package LinkedList2;

import java.util.LinkedList;

public class CollectionOfLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list.size());
    }
}


//package LinkedList2;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class CollectionOfLinkedList {
//    public static void main(String[] args) {
//        LinkedList<Integer> list= new Queue<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println(list.size());
//    }
//}
