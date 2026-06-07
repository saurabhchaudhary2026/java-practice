public class bincof {
    public static long ftnum(long n) {
        long f = 1;
        for (long i = n; i > 1; i--) {
            f = f * i;
        }

        return f;
    }

    public static long bincoeff(long y, long r) {
        long a = ftnum(y);
        long b = ftnum(r);
        long c = ftnum(y - r);
        long z = a / (b * c);

        return z;
    }

    public static void main(String[] args) {

        System.out.println(bincoeff(10,4));
    }
}
