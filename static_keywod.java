//static variable are same for all the objects
//non-static variable are different for all the objects

// code 1
class Emp {
  int eid; // object specific variable --> non static variable
  int salary; // object specific variable --> non static variable
  static String ceo; // not object specific variable --> static variable

  public void show() {
    System.out.println(eid + ":" + salary + ":" + ceo);
  }
}

public class static_keywod {
  public static void main(String[] args) { // at first the class loads then we create an object
    Emp navin = new Emp(); // there is a special memory in JVM where we load all our class files that is
                           // called " class loader memory "
    navin.eid = 7;
    navin.salary = 4000; // here eid and salary goes into heap memory but ceo goes into class loader file
    Emp.ceo = "mahesh";

    Emp rahul = new Emp(); // we create an object inside the heap memory and before creating an object at
                           // first we load the class
    rahul.eid = 8;
    rahul.salary = 5000;
    Emp.ceo = "mahesh";

    Emp.ceo = "nikita"; // if you change tha eid or salary of navin it doesn't affect the eid or salary
                        // of rahul but if you change the ceo it will affect both of them

    navin.show();
    rahul.show();

  }
}
