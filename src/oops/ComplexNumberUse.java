package oops;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class ComplexNumberUse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int real1= sc.nextInt();
        int imaginary1= sc.nextInt();

        int real2= sc.nextInt();
        int imaginary2= sc.nextInt();

        //create a object
        ComplexNumber c1= new ComplexNumber(real1,imaginary1);
      ComplexNumber c2= new ComplexNumber(real2,imaginary2);
      int choice= sc.nextInt();
      if(choice==1){
          c1.real=c1.real+c2.real;
          c1.imaginary= c1.imaginary+c2.imaginary;
          System.out.println(c1.real+" "+"+i"+c1.imaginary);
      }
      else if(choice==2){
          // (a+ib)*(c+id)= ac+aid+ib*c+ib*id
          // ac+aid+ibc+(-bd)
          // ac-bd+i(ad+bc)
          int tempReal= c1.real;
          int tempImg= c1.imaginary;
          c1.real=tempReal*c2.real-tempImg* c2.imaginary;
          c1.imaginary=tempReal*c2.imaginary+tempImg*c2.real;
          System.out.println(c1.real + " + i"+c1.imaginary);

      }

    }
}
