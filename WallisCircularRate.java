public class WallisCircularRate {
    public void calcPrint() {
        double sum = 1, e = 2.0, o = 1.0;
        int max_iter = 1000000;
        for (long i = 1; i <= max_iter; i++) {
            sum *= e / o;
            if (i % 2 == 1) {
                o += 2.0;
            } else {
                e += 2.0;
            }
        }
        System.out.println("With Wallis Method, iteration count of " + max_iter + ", ");
        System.out.println("Pi is: " + 2 * sum);
    }
}