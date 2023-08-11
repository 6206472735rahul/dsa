package oops;

public class Car {
    // getters and setters-->these are function to access the private class  when you access outside the class the use it.
    String company_name;
  private  int year;

  public int get(){ // getters

      return year ;
  }
//  public void set(int num){  //first way
//      year=num;
//  }
public void set(int year){ // using this keywords (2nd way)

      this.year=year;
}
    public static void main(String[] args) {
        Car c= new Car();
        c.company_name="honda";
        c.set(2020);// pass the values always
        System.out.println(c.company_name+" "+c.get());
    }
}
