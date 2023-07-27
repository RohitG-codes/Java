public class enhanced_for_loop {
    public static void main(String[] args) {
        // enhanced for loop with 1-D array
        int a[] = { 1, 2, 3, 4, 5 };
        for (int k : a) // k will fetch one value at a time from a
        {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println();
        // enhanced for loop with jagged array(2-D array)
        int d[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7 },
                { 8, 9, 1, 4, 5 }
        };
        for (int t[] : d) // t will fetch one array row at a time from d
        {
            for (int p : t) // p will fetch one value at a time from t
            {
                System.out.print(" " + p);
            }
            System.out.println();
        }

    }
}
