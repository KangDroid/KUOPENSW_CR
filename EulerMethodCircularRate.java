public class EulerMethodCircularRate {
    public void calcPrint() {
        int iteration_count = 1000000;
        double sum  = 0;
        for (long i = 1; i <= iteration_count; i++) {
           // System.out.println(i);
            sum += (double)1 / (i*i);
        }
        System.out.println("With Euler Method, iteration count of " + iteration_count + ",");
        System.out.println("Pi is: " +  Math.sqrt(6 * sum));
    }
}