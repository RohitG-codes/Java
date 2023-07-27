public class array {
    public static void main(String[] args) {
        // 1-D array
        int nums[] = new int[4]; // you can also write like this --> int nums[]={1,2,3,4}
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();
        // 2-D array
        int d[][] = {
                { 1, 2, 3, 6 },
                { 4, 5, 6, 3 },
                { 7, 8, 9, 1 }
        };
        System.out.println(d[2][3]);
        System.out.println(d[0][1]);
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // jagged array(arrays,where the number of columns are not fixed)

        int dd[][] = {

                { 1, 2, 3, 4 },
                { 5, 6, 7 },
                { 8, 9, 1, 4, 5 }

        };
        System.out.println(dd[1][0]);
        System.out.println(dd[2][4]);
        System.out.println();
        for (int i = 0; i < dd.length; i++) {
            for (int j = 0; j < dd[i].length; j++) {
                System.out.print(dd[i][j] + " ");
            }
            System.out.println();
        }

    }
}
