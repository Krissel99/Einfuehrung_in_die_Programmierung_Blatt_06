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

        System.out.println(isMirrorArray(a, a));
        System.out.println(isMirrorArray(a, b));
        System.out.println(isMirrorArray(a, c));
        System.out.println(isMirrorArray(a, d));
        System.out.println();

        System.out.println(isMirrorArray(b, a));
        System.out.println(isMirrorArray(b, b));
        System.out.println(isMirrorArray(b, c));
        System.out.println(isMirrorArray(b, d));
        System.out.println();

        System.out.println(isMirrorArray(c, a));
        System.out.println(isMirrorArray(c, b));
        System.out.println(isMirrorArray(c, c));
        System.out.println(isMirrorArray(c, d));
        System.out.println();

        System.out.println(isMirrorArray(d, a));
        System.out.println(isMirrorArray(d, b));
        System.out.println(isMirrorArray(d, c));
        System.out.println(isMirrorArray(d, d));
    }
}