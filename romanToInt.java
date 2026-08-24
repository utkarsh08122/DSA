import java.util.HashMap;


class romanToInt {
    public int romanToInt(String s) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("M", 1000);
        map.put("D", 500);
        map.put("C", 100);
        map.put("L", 50);
        map.put("X", 10);
        map.put("V", 5);
        map.put("I", 1);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = map.get(String.valueOf(s.charAt(i)));

            if (i + 1 < s.length()) {

                int next = map.get(String.valueOf(s.charAt(i + 1)));

                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }

            } else {
                result += current;
            }
        }

        return result;
    }
}