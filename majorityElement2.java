import java.util.*;

class majorityElement2 {
    public List<Integer> majorityElement2(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = nums.length;

        for (int i = 0; i < count; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        
        
             for (int i : map.keySet()) {
            if (map.get(i) > count / 3) {
                result.add(i);
            }
        }


        return result;
    }
}
