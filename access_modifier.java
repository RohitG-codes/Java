//there can be only one public class in a single Java program
//there can be multiple public classes in a single Java package
class A // it is a default class(cannot be uesd in other packages),this is an outer
        // class
{ // if you make this class A pubic then you can use this class in other packages
  // also
  int a; // deault variable
  public int b;// public variable
  private int c;// private variable
  protected int d;// protected variable

  void run()// deault method->when members of the class(variable ,method or class) are
            // default they can only be accessed from the class of same package
  {

  }

  public void run1()// public method->when members of the class(variable ,method or class) are
                    // public they can be accessed from any class of any package
  {

  }

  private void run2()// private method->when members of the class(variable ,method or class) are
                     // private they cannot be accessed from outside the class
  { // they are meant to be accessed from the same class in which they are declared

  }

  protected void run3()// protected method->when members of the class(variable ,method or class) are
                       // protected they can be accessed from any class of the same package
  { // and child class from other package

  }

  class B// deault class,class B,C,D,E all are inner classes of A
  {

  }

  public class C// public class
  {

  }

  private class D// private class
  {

  }

  protected class E// protected class
  {

  }
}

public class access_modifier {
  public static void main(String[] args) {

    System.out.println("Hello World");

  }
}
