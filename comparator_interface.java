import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;

//by defalur there is no class which implements comparator interface
//so you can create your own class which implements comparator interface oryou can use annonymous class
//comparator interface is a functional interface so you can use lambda expression here
//sorting the values based on their last digit
public class comparator_interface {
  public static void main(String[] args) {
    List<Integer> values = new ArrayList<Integer>();
    values.add(119);
    values.add(256);
    values.add(518);
    values.add(811);
    Comparator<Integer> c = new Comparator<Integer>() {
      public int compare(Integer i, Integer j) {
        if (i % 10 > j % 10)
          return 1;// if it returns 1 then swap
        else
          return -1;// if it returns -1 then don't swap
      }
    }; // you can do this all thing in one line ->
    Collections.sort(values, c); // "Comparator<Integer> c=(i,j)-> i%10>j%10?1:-1"
    for (Integer o : values) {
      System.out.println(o);
    }
  }
}
