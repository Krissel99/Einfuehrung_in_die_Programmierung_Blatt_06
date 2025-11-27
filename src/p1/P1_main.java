package p1;

public class P1_main {
    public static int squared(int num) {
        int square = num+1;
        return square*square;
    }

    public static void main(String[] args) {
        int x   = -3;
        int sum = squared(x);
        System.out.println("Rückgaebewert von squared("+x+") ist "+sum);
    }
}