import java.util.*;

class intersection1 {
    public List<Integer> intersection(int[][] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

       
        for (int i = 0; i < nums.length; i++) {

           
            for (int j = 0; j < nums[i].length; j++) {

                int num = nums[i][j];

               
                if (!map.containsKey(num)) {
                    map.put(num, 1);
                } else {
                    map.put(num, map.get(num) + 1);
                }
            }
        }

       
        for (int num : map.keySet()) {
            if (map.get(num) == nums.length) {
                result.add(num);
            }
        }

        Collections.sort(result);

        return result;
    }
}