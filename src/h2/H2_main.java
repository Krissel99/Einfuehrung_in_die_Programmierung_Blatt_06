package h2;


public class H2_main {
    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        int[] c = {1, 3, 2};
        int[] d = {1, 2};
        int[] e = {1, 2, 3};

        int[][] arrays = {a, b, c, d, e};

        String[] strings = {"a", "b", "c", "d", "e"};

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if (compareArrays(arrays[i], arrays[j]) && i != j) {
                    System.out.printf("compareArrays(%s,%s) = %b%n", strings[i], strings[j], compareArrays(arrays[i], arrays[j]));
                }
            }
        }
        System.out.println();
        boolean allEqual = true;
        for (int i = 1; i < arrays.length && allEqual; i++) {
            if (!compareArrays(arrays[i], arrays[i])) {
                allEqual = false;
                break;
            }
        }
        System.out.print("Für alle identischen Arrays ist compareArrays ");
        if (allEqual) {
            System.out.print("= true");
        } else {
            System.out.println("NICHT immer true");
        }

    }
}