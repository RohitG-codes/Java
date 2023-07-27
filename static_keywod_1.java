// code 2
class Emp1 {
  int eid;
  int salary;
  static String ceo;
  static // if you want to initialize a static variable you have to use a static block
  {
    ceo = "harry";
    System.out.println("in static");
  }

  public Emp1() // if you want to initialize a non static variable you can create a constructor
  {
    eid = 5;
    salary = 2000;
    System.out.println("in constructor");
  }

  public void show() {
    System.out.println(eid + ":" + salary + ":" + ceo);
  }
}

public class static_keywod_1 {
  static int i = 0;

  public static void main(String[] args) {
    Emp1 navin = new Emp1(); // static block will execute before constructor
    Emp1 rahul = new Emp1(); // staic block will execute only once but constructor will execute everytime we
                             // create an object
    i = 5; // here you have to make "i" a static variable becuse it is in a static method
    System.out.println(i);
    navin.show();
    rahul.show();

  }
}
