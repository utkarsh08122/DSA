import java.util.*;

class intersect {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> set = new HashMap<>();

        int index = 0;
        for (int i = 0; i < nums1.length; i++) {

            set.put(nums1[i], set.getOrDefault(nums1[i], 0) + 1);

        }
        int[] arr = new int[set.size()];
        for (int i = 0; i < nums2.length; i++) {
            if (set.containsKey(nums2[i])) {
                if (set.get(nums2[i]) > 0) {
                    set.put(nums2[i], set.get(nums2[i]) - 1);
                    arr[index] = nums2[i];
                    index++;
                }
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }

        return result;

    }
}