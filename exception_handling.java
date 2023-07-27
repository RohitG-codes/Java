public class exception_handling {
  public static void main(String args[]) {
    try {
      int i = 9;
      int k = i / 0;
    } catch (Exception e) {
      System.out.println("cannot divide a number by zero");
    } finally {
      System.out.println("hi");

    }
  }
}
