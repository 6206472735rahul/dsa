package oops;
//private ka example
public class privateExample {
    private int val=10;

    private void show(){
        System.out.println(val);
    }

    public static void main(String[] args) {
        privateExample obj= new privateExample();
        obj.val+=10;
        obj.show();
    }
}
