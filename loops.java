public class loops {
    public static void main(String[] args) {
        // while loop
        int i = 1; // initialization
        while (i <= 5) // condition,here if the condition is false,the 'hi' will not be printed
        {
            System.out.println("hi");
            i++; // increamentation or deceramentation
        }
        // do-while loop
        int j = 6; // initialization
        do {
            System.out.println("hii");
            j--; // increamentation or deceramentation
        } while (j >= 1); // condition,here even if the condition is false the "hii" will be printed at
                          // least for once
        // for loop
        for (int k = 1; k <= 7; k++)
            System.out.println("hiii");
    }
}
