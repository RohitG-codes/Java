public class nested_loops {
    public static void main(String[] args) {
        // printing first pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("*" + " "); // 'print' is used to print on the same line but 'println' is used to print
                                             // on the new line
            }
            System.out.println();
        }
        System.out.println();
        // printing second pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

        // printing third pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

}
