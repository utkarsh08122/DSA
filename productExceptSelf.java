class productExceptSelf {
    public static void productExceptSelf(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] arr1 = new int[4];
        int mul = 1;
        for (int i = 0; i < 4; i++) {
            mul = mul * arr[i];
        }
        for (int j = 0; j < 4; j++) {
            arr1[j] = mul / arr[j];

        }

        for (int j = 0; j < 4; j++) {

            System.out.println(arr1[j]);
        }

    }
}