package oops;

public class DynamicUse {
    public static void main(String[] args) {
        DynamicClass d= new DynamicClass();
        for(int i=1;i<100;i++){
            d.add(100+i);
        }
        System.out.println(d.size());
      System.out.println(d.get(98));
      d.set(2,30000);
        System.out.println(d.get(2));
//        while(!d.IsEmpty()){
//            System.out.println(d.removeLast());
//            System.out.println("size -"+ d.size());
//        }

    }
}
