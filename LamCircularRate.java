public class LamCircularRate {
    public void calcPrint() {
        double tmpSum = 0;
        int max_iter = 5;
        for (long i = 0; i < max_iter; i++) {
            tmpSum += factorial(4 * i) * (1103 + 26390*i) / (Math.pow(factorial(i), 4)*Math.pow(396.0, 4 * i));
        }

        double final_val = 1 / ((Math.sqrt(8.0) / 9801) * tmpSum);
        System.out.println("With Lam Method, iteration count of " + max_iter + ", ");
        System.out.println("Pi is: " + final_val);
    }
    public static long factorial(long tmp) {
        if (tmp == 0) return 1;
        long val = 1;
        for (long i = 1; i <= tmp; i++) {
            val *= i;
        }

        return val;
    }
}