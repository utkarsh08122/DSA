class strStr {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int n1 = needle.length();
        int count = 0;

        if (n1 == 0) {
            return 0;
        }

        for (int i = 0; i < n; i++) {

            if (i + n1 > n) {
                return -1;
            }

            if (haystack.charAt(i) == needle.charAt(count)) {

                while (count < n1) {

                    if (haystack.charAt(count + i) != needle.charAt(count)) {

                        count = 0;
                        break;
                    }
                    if (count == n1 - 1) {
                        return i;
                    }

                    count++;
                }

                count = 0;
            }
        }
        return -1;
    }
}
