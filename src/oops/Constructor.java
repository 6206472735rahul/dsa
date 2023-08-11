package oops;

import java.util.concurrent.Callable;

public class Constructor {
    String name;
    int id;
    double percentage;
  final String UniversityName="IIMT UNIVERSITY";
  static int numberStudents;
    //parametrized constructor (pass arguments)
    public Constructor( String name, int id,double percentage){
      this.name=name;
      this.id=id;
      this.percentage=percentage;
      numberStudents++;
    }
    //no arguments constructor (don't pass any values)
    public  Constructor(){

    }

    public static void main(String[] args) {
        Constructor c= new Constructor("rahul",43,60.0);
        System.out.println(c.numberStudents);// for static keywords--> 1
        Constructor c1= new Constructor("rahul",43,78.0);
        System.out.println(c1.numberStudents);// for static keywords--> 2
       // c.name="Sunil kumar";
      //  c.id=29;
       // or
        System.out.println(c.name);
        System.out.println(c.id);
        System.out.println(c.percentage);
        System.out.println(c1.percentage);
        System.out.println(c1.UniversityName);

        ////no arguments constructor (don't pass any values)
        Constructor c2= new Constructor();
        c2.name="rohit";
        c2.id=47;
      //  c2.UniversityName="group of college";(you can not change values of final keywords
        System.out.println(c2.name);
        System.out.println(c2.id);
        System.out.println(c2.UniversityName);

    }
    }

