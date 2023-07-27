public class arithmetic_operators {
    public static void main(String[] args) {
        int m = 7;
        int n = 6;
        int r1 = m + n;
        int r2 = m - n;
        int r3 = m * n;
        double r4 = (double) m / n;
        int r5 = m % n;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4); // System.out.printf("%.2f",r4) -->for getting "r4" with 2 decimal places
        System.out.println(r5);
        m = ++m; // pre incrament,first increament then assignment,'m' first incremented by one
                 // then assigned to 'm','m' is 8
        n = --n; // pre decreament,first decreament then assignment,'n' first decreamenyed by one
                 // then assigned to 'n,'n' is 5
        System.out.println(m);
        System.out.println(n);
        m = m++; // post incrament,first assignment then increament,'m' first assigned to 'm'
                 // then incremented by one,'m' is still 8
        n = n--;// post decreament,first assignment then decreament,'n' first assigned to 'n'
                // then decremented by one,'n' is still 5
        System.out.println(m);
        System.out.println(n);
        int k = m + n; // here 'm' is 9 and 'n' is 4 after post increament and post decreament
        System.out.println(k);

    }
}
