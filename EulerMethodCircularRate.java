public class EulerMethodCircularRate {
    public static void main(String[] args) {
        int iteration_count = 1000000;
        double sum  = 0;
        for (long i = 1; i <= iteration_count; i++) {
           // System.out.println(i);
            sum += (double)1 / (i*i);
        }
        System.out.println("Pi is: " +  Math.sqrt(6 * sum));
    }
}