class A3 // super class
{
  public void show() {
    System.out.println("in a");
  }
}

class B2 extends A3 // sub class
{
  public void show() { // if you write here "super.show();" the output will be : in a , in b
    System.out.println("in b"); // here if b doesn't has his own show method,it will call the show method of a
                                // but as b has his own show method, it overrides the show method of a
  }
}

public class method_overriding {
  public static void main(String[] args) {
    B2 obj1 = new B2();
    obj1.show();

  }
}
