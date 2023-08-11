package oops;

public class Fraction {
    public  static  Fraction add(Fraction f1,Fraction f2){
        int numerator= f2.denominator*f1.numerator+f2.numerator*f1.denominator;
        int denominator= f1.denominator*f2.denominator;
        Fraction f3= new Fraction(numerator,denominator);
        return f3;
    }
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);


    }

    public void simplify() {
        int hcf = gcd(numerator, denominator);
        numerator = numerator / hcf;
        denominator = denominator / hcf;

    }

    public static int gcd(int numerator, int denominator) {
        int min = Math.min(numerator, denominator);
        for (int i = min; min >= 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                return i;
            }
        }
        return min;

    }

    //add f1 or f2 =f3
    public static void main(String[] args) {
        Fraction f1= new Fraction(4,6);
      f1.print();
        Fraction f2= new Fraction(5,20);
        f2.print();
        Fraction f3= add(f1,f2);
//     0r   System.out.println(f3.numerator+"/"+f3.denominator);
        f3.print();

    }

    public  void add(Fraction f2){  //added f1+f2=f1
//     this.numerator= this.numerator*f2.denominator+this.denominator*f2.numerator;
//      this.denominator= this.denominator*f2.denominator; or

        numerator= f2.denominator*numerator+f2.numerator*denominator;
        denominator=denominator*f2.denominator;
        simplify();
    }

}



