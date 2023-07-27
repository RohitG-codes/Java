
class a111 // super class
{
  public a111() // default constructor
  {
    System.out.println("in a");
  }

  public a111(int i) // parametarized constructor
  {

    System.out.println("in a int");
  }
}

class b1 extends a111 // sub class
{
  public b1() // every constructor in sub class will have a super method by default; even if
              // you don't mention it, it will be there
  { // super means it will call the constructor of the super class
    super(); // if you write here 'super(5)' and create the object like : " b obj=new b();"
             // the output will be --> in a int , in b
    System.out.println("in b");
  }

  public b1(int i) {
    super(i); // if you don't use the super method (super(i)) by default the sub class will
              // call the default constructor and the output will be --> in a , in b int
    System.out.println("in b int"); // if you use the " super(i) " keyword the sub class will call the parametarized
                                    // constructor
  }
}

public class super_method {
  public static void main(String[] args) {

    b1 obj = new b1(5);
  }
}
