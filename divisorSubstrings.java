
class divisorSubstrings {
    public int divisorSubstrings(int num, int k) {
        String str1 = String.valueOf(num);
        StringBuilder sb = new StringBuilder("");

        int count = 0;

        for (int i = 0; i < k; i++) {
            sb.append(str1.charAt(i));
        }

        int divisor = Integer.parseInt(sb.toString());

        if (divisor != 0 && num % divisor == 0) {
            count++;
        }

        sb.delete(0, 1);

        for (int i = k; i < str1.length(); i++) {

            sb.append(str1.charAt(i));

            divisor = Integer.parseInt(sb.toString());

            if (divisor != 0 && num % divisor == 0) {
                count++;
            }

            sb.delete(0, 1);
        }

        return count;
    }
}
