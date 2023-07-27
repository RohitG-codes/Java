// EXAMPLES OF CONSTRUCTOR OVERLOADING
class A {
  int num1;
  int num2;
  int num3;

  public A() // default comstructor -->no.1
  {
    num1 = 5;
    num2 = 4;
  }

  public A(int n) // parametarized constructor -->no.2
  {
    num1 = n;
    num2 = n;
  }

  public A(double d, int i) // parametarized constructor -->no.3
  {
    num1 = (int) d; // type casting
    num2 = i;
  }

  public A(float f, double d1, int i1) // parametarized constructor -->no.4
  {
    num1 = (int) f; // type casting
    num2 = (int) d1; // type casting
    num3 = i1;
  }
}

// EXAMPLES OF METHOD OVERLOADING
// you can create multiple constructors/methods with the same name but with
// different parameters in same class,this is called constructor/method
// overloading
class A1 {
  public void add(int i, int j) {
    System.out.println(i + j);
  }

  public void add(int i, int j, int k) {
    System.out.println(i + j + k);
  }

  public void add(double i, double j) {
    System.out.println(i + j);
  }
}

public class method_constructor_overloading {
  public static void main(String[] args) {
    A obj1 = new A(6.5f, 8.5, 9);// --> this for no.4
    A1 obj = new A1();
    obj.add(5, 6);
    obj.add(5, 6, 7);
    obj.add(5.5, 4.5);
    System.out.println(obj1.num1); // if this : A obj=new A(9); output will be (9 9) -->this is for no.2
    System.out.println(obj1.num2); // if this : A obj=new A(); output will be (5 4)no.3 -->this is for no.1
    System.out.println(obj1.num3); // if this : A obj=new A(5.6,7); output will be (5 4)no.3 -->this is for no.3
  }
}
