import java.util.*;//  when you are using scanner you have ti import this package

public class user_input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // system.in is a standard input stream(getting the input from the keyboard)
    System.out.println("enter the first number :");
    int a = sc.nextInt();
    System.out.println("enter the second number :");
    int b = sc.nextInt();
    System.out.println("enter the third number :");
    int c = sc.nextInt();
    int d = a + b + c;
    System.out.println(d);
    System.out.println();
    System.out.println("enter a string");
    String e = sc.nextLine();
    System.out.println(e);

  }
}
