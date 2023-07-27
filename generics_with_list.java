import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class generics_with_list {
  public static void main(String[] args) {
    List<Integer> values = new ArrayList<Integer>();// you can also do this(only above Java7)->"List<Integer>values=new
                                                    // ArrayList<>();"
    values.add(1); // you can define the type of List here("Integer","String","particular object
                   // type")
    values.add(2);
    values.add(5);
    values.add(8);
    values.add(2, 3);
    System.out.println(values);
    Iterator it = values.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    for (int i = 0; i < values.size(); i++) {
      System.out.println(values.get(i));
    }
    for (Integer o : values) {
      System.out.println(o);
    }
  }
}
