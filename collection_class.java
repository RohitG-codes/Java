import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collection_class {
  public static void main(String[] args) {
    List<Integer> values = new ArrayList<>();
    values.add(1);
    values.add(5);
    values.add(2);
    values.add(8);
    values.add(2, 3);
    for (Integer o : values) {
      System.out.println(o); // original list will be printed
    }
    System.out.println(); // "Collections" is a class and "sort","reverse","shuffle" are staic methods
    Collections.sort(values);// it will sort the List
    for (Integer o : values) {
      System.out.println(o);
    }
    System.out.println();
    Collections.reverse(values);// it will reverse the list
    for (Integer o : values) {
      System.out.println(o);
    }
    System.out.println();
    Collections.shuffle(values);// it will print the list randomly
    for (Integer o : values) { // here you see,we can change the original list(by sort,reverse...)that's why
                               // list is mutable
      System.out.println(o);
    }
  }
}
