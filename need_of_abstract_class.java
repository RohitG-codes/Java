class Printer // here Number is an abstract class and integr,double,float e.t.c extends this
              // class
{ // so by using this class you can pass any type of value (int,double,float).you
  // don't have create different methods for each of them
  public void show(Number i) {
    System.out.println(i);
  }
}

public class need_of_abstract_class {
  public static void main(String[] args) {
    Printer obj = new Printer();
    obj.show(5); // passing integer value
    obj.show(5.5); // passing double value
    obj.show(5.5f); // passing float value
  }
}
