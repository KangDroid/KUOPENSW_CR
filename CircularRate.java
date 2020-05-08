class CircularRate {
    public static void main(String[] args) {
        EulerMethodCircularRate emc = new EulerMethodCircularRate();
        emc.calcPrint();
        System.out.println();
        LamCircularRate lc = new LamCircularRate();
        lc.calcPrint();
        System.out.println();
        WallisCircularRate wcr = new WallisCircularRate();
        wcr.calcPrint();
        System.out.println();

        // Don't put this to method.
        int max = 1000000;
        double sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += (Math.pow(-1, i+1)) / ((2 * i) - 1);
        }
        System.out.println("With Lip Method, iteration count of " + max + ",");
        System.out.println("Pi is: " +  (4 * sum));
    }
}