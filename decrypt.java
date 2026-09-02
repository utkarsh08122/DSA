

class decrypt {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        if (k == 0) {
            return ans;
        }

        int sum = 0;

        if (k > 0) {
            for (int i = 1; i <= k; i++) {
                sum += code[i % n];
            }

            for (int i = 0; i < n; i++) {
                ans[i] = sum;
                sum -= code[(i + 1) % n];

                sum += code[(i + k + 1) % n];
            }

        } else {
            k = -k;

            for (int i = 1; i <= k; i++) {
                sum += code[(n - i) % n];
            }

            for (int i = 0; i < n; i++) {
                ans[i] = sum;

                sum -= code[(i - k + n) % n];

                sum += code[i];
            }
        }

        return ans;
    }
}



// not best case
// class Solution {
//     public int[] decrypt(int[] code, int k) {
//         int n = code.length;
//         int[] result = new int[n];

//         if (k == 0) {
//             return result;
//         }

//         for (int i = 0; i < n; i++) {
//             int sum = 0;

//             if (k > 0) {
//                 for (int j = 1; j <= k; j++) {
//                     sum += code[(i + j) % n];
//                 }
//             } else {
//                 for (int j = 1; j <= -k; j++) {
//                     sum += code[(i - j + n) % n];
//                 }
//             }

//             result[i] = sum;
//         }

//         return result;
//     }
// }
