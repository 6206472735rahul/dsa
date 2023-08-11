package oops;

public class dyUse {
    public static void main(String[] args) {
        dy d= new dy();
        for(int i=0;i<=10;i++){
            d.add(10+i);
            System.out.println(d.get(i));
        }
        System.out.println("size="+d.size());
        System.out.println(d.get(2));
        d.set(2,2000000);
        System.out.println(d.get(2));
    }
}
