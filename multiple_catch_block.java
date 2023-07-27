public class multiple_catch_block {
  public static void main(String[] args) {
    try {
      int a[] = new int[5];
      a[5] = 4;
      int i = 3;
      int j = 0;
      int k = i / j;
      System.out.println("output is" + k);
    } catch (ArithmeticException a) {
      System.out.println("cannot divide a  number by zero");
    } catch (ArrayIndexOutOfBoundsException b) {
      System.out.println("you are crossing the array limit " + b); // "+b" returns what mistake you have done
    }
    /*
     * you can also do this -->
     * catch( ArithmeticException | ArrayIndexOutOfBoundsException e)
     * {
     * System.out.println("error");
     * }
     */
    catch (Exception c) {
      System.out.println("something went wrong");
    } finally {
      System.out.println("hi");
    }

  }
}
