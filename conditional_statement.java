public class conditional_statement {
    public static void main(String[] args) {
        // if-else statement
        if (true) // if "if" returns 'true',then only it will print the statement
            System.out.println("hello");
        if (false) // if "if" returns 'false',then it will not print the statement
            System.out.println("hi");
        int n = 7;
        if (n == 0)
            System.out.println("neither odd or even");
        else if (n % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
        // ternary operator
        int m = 5;
        int j = 0;
        j = m > 6 ? 1 : 2; // it is asking if 'm' greater than six,if yes then it will print '1',otherwise
                           // it will print '2'
        System.out.println(j);
        // switch-case statement
        int k = 2;
        switch (k) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("number not matched");

        }
    }
}
