package oops;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

       // al.size();
//        System.out.println(al.get(0));
//        System.out.println(al.get(1));
//        System.out.println(al.size());
//        al.remove(0);
//        System.out.println(al.get(0));
//        System.out.println(al.size());

        for(int i=0;i<4;i++){
            System.out.println(al.get(i));
        }
    }
}
