package h1;


public class H1_main {
    public static boolean isMirrorArray(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }
//        (a[i] != b[b.length -1 - i])
        for (int i = 0, j = a.length-1; i < a.length; i++, j--) {
            if (a[i] != b[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 2, 1};
        int[] c = {2, 4, 6};
        int[] d = {6, 4, 9};
        int[] e = {1, 2, 3, 6};

        int[][]  arrays  = {a, b, c, d, e};
        String[] strings = {"a", "b", "c", "d", "e"};

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if (isMirrorArray(arrays[i], arrays[j]) && i != j) {
                    System.out.printf("isMirrorArray(%s,%s) = %b%n", strings[i], strings[j], isMirrorArray(arrays[i], arrays[j]));
                }
            }
        }
    }
}