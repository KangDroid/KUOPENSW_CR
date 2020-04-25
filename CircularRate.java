class CircularRate {
    public static void main(String[] args) {
        int max = 1000000;
        double sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += (Math.pow(-1, i+1)) / ((2 * i) - 1);
        }
        System.out.println("Val: " + (4 * sum));
    }
}