import java.util.HashSet;
import java.util.Set;
//set doesn't allow duplicate values(every value in a set is unique)
import java.util.*;

public class set_interface {
  public static void main(String[] args) {
    Set<Integer> s = new HashSet<>();// if you use TreeSet here instead of HashSet the output will be in ascending
                                     // order
    System.out.println(s.add(12));
    System.out.println(s.add(50));
    System.out.println(s.add(81));
    System.out.println(s.add(1));
    System.out.println(s.add(1));// if you repeat any value it will print false and also not print the value
    System.out.println(s);

  }
}
