import java.util.*;
class intersection {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> set = new HashMap<>();
        HashSet<Integer> set1 = new HashSet<>();

        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (!set.containsKey(nums1[i])) {
                set.put(nums1[i], 0);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.containsKey(nums2[i])) {
                if (set.get(nums2[i]) == 0) {
                    set.put(nums2[i], 1);
                    set1.add(nums2[i]);
                }
            }
        }

        int[] arr = new int[set1.size()];

        for (int i : set1) {
            arr[index] = i;
            index++;
        }

        return arr;

    }
}
