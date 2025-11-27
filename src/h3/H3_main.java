package h3;

public class H3_main {

    public static boolean compareArraysVal(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        int[] copyOfA = new int[a.length];
        int[] copyOfB = new int[b.length];

        for (int i = 0; i < a.length; i++) {
            copyOfA[i] = a[i];
            copyOfB[i] = b[i];
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (copyOfA[i] > copyOfA[j]) {
                    int tempA = copyOfA[i];
                    copyOfA[i] = copyOfA[j];
                    copyOfA[j] = tempA;
                }
                if (copyOfB[i] > copyOfB[j]) {
                    int tempB = copyOfB[i];
                    copyOfB[i] = copyOfB[j];
                    copyOfB[j] = tempB;
                }
            }
        }


        for (int i = 0; i < a.length; i++) {
            if (copyOfA[i] != copyOfB[i]) {
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
        int[] f = {1, 1, 2};

        int[][] arrays = {a, b, c, d, e, f};

        String[] strings = {"a", "b", "c", "d", "e", "f"};

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if (compareArraysVal(arrays[i], arrays[j]) && i != j) {
                    System.out.printf("Arrays %s und %s sind identisch.%n", strings[i], strings[j]);
                }
            }
        }
        System.out.println();

        boolean allEqual = true;
        for (int i = 1; i < arrays.length && allEqual; i++) {
            if (!compareArraysVal(arrays[i], arrays[i])) {
                allEqual = false;
                break;
            }
        }
        System.out.print("Für alle identischen Arrays ist compareArraysVal ");
        if (allEqual) {
            System.out.print("= true");
        } else {
            System.out.println("NICHT immer true");
        }

    }

}