class pivotInteger {
    public int pivotInteger(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int x = (int) Math.sqrt(sum);

        if (x * x == sum) {
            return x;
        }

        return -1;
    }
}
