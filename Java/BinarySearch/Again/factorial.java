public class factorial {
    public static void main(String[] args) {
        fact(5);
    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

}
