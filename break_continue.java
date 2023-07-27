public class break_continue {
  public static void main(String[] args) {
    // break statement
    for (int i = 1; i <= 8; i++) {
      if (i > 5) // here if i equals to 5 it will print from 1 to 4
      {
        break; // when i equals to 5,it will terminate(break) the loop and jumps out if it
      }
      System.out.println(i);
    }
    // continue statement
    for (int j = 1; j <= 8; j++) {
      if (j == 5) // here if j greater than 5 it will print from 1 to 5
      {
        continue; // when j equals to 5,then it will skip that iteration and continue with the
                  // next iteration
      }
      System.out.println(j);
    }
  }
}
