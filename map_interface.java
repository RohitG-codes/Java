import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map_interface {
  public static void main(String[] args) {
    Map<String, String> m = new HashMap<>();
    m.put("name", "navin"); // it doesn't follow the sequence in the output
    m.put("actor", "john");
    m.put("ceo", "sundar");
    m.put("hero", "sundar");// here in map interface you can repeat the value but not the key
    m.put("actor", "ntr");// now the new actor is ntr,it will not print the actor john
    System.out.println(m);
    System.out.println(m.get("name"));
    System.out.println(m.get("actor"));
    System.out.println(m.get("ceo"));
    System.out.println(m.get("actor"));
    Set<String> s = m.keySet();
    for (String s1 : s) {
      System.out.println(s1 + " " + m.get(s1));
    }
  }
}
