package h3;

import java.util.Arrays;

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

        int[] a = {};
        int[] b = {};
        System.out.println(compareArraysVal(a, b));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }

}