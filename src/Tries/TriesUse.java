package Tries;


public class TriesUse {
    public static void main(String[] args) {
        Tries t= new Tries();
        t.add("AND");
        t.add("NOTE");
        t.add("NEW");
        System.out.println(t.search("NEW"));
        t.remove("NEW");
        System.out.println(t.search("NEW"));
        System.out.println(t.countWord());
    }
}
