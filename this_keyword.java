
class calc11 {
  int num1; // instance variable
  int num2; // instance varable

  public calc11(int num1, int num2) // local variable
  {
    this.num1 = num1; // if you don't write the "this" keyword by default it will print the
                      // value;num1=0 and num2=0
    this.num2 = num2; // this keyword is used to differentiate between local variable and instance
                      // variable
  }
} // " this represents the current object "

public class this_keyword {
  public static void main(String[] args) {
    calc11 obj = new calc11(4, 5);
    System.out.println(obj.num1);
    System.out.println(obj.num2);

  }
}
