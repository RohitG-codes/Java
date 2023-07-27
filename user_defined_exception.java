/*
class ExceptionDemo {
  public static void main(String[] args) {
    int i=3;
    int j=8;
    try
    {
      double k=i/j;
      if (k==0)
        throw new Exception(); //this "exception" is calling   the "exception" of catch block
      System.out.println(k);
    }
    catch(Exception e)
    {
      System.out.println("error");
    }
    
    
  }
}
*/

public class user_defined_exception {
  public static void main(String[] args) {
    int i = 3;
    int j = 8;
    try {
      int k = i / j;
      if (k == 0)
        throw new MyCreatedException("you are creating an error"); // see MyCreatedException.java file
      System.out.println(k);
    } catch (MyCreatedException e) {
      System.out.println("error " + e.getMessage());
    }
  }
}
