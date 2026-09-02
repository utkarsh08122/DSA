import java.util.*;


// not a best case solution
class containsNearbyAlmostDuplicate {
    public boolean containsNearbyAlmostDuplicate(
            int[] nums, int indexDiff, int valueDiff) {

        if (indexDiff <= 0 || valueDiff < 0) {
            return false;
        }

        Map<Long, Long> buckets = new HashMap<>();

        long width = (long) valueDiff + 1;

        for (int i = 0; i < nums.length; i++) {

            long num = nums[i];
            long bucket = num / width;

            // Fix for negative numbers
            if (num < 0) {
                bucket--;
            }

            // Same bucket
            if (buckets.containsKey(bucket)) {
                return true;
            }

            // Previous bucket
            if (buckets.containsKey(bucket - 1) &&
                    Math.abs(num - buckets.get(bucket - 1)) <= valueDiff) {
                return true;
            }

            // Next bucket
            if (buckets.containsKey(bucket + 1) &&
                    Math.abs(num - buckets.get(bucket + 1)) <= valueDiff) {
                return true;
            }

            buckets.put(bucket, num);

            // Remove element outside indexDiff window
            if (i >= indexDiff) {
                long oldNum = nums[i - indexDiff];
                long oldBucket = oldNum / width;

                if (oldNum < 0) {
                    oldBucket--;
                }

                buckets.remove(oldBucket);
            }
        }

        return false;
    }
}

// worst case
// class containsNearbyAlmostDuplicate {
// public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int
// valueDiff) {

// for (int i = 0; i < nums.length; i++) {
// int j = i + 1;

// while (j <= indexDiff + i && j < nums.length) {
// if (Math.abs(i - j) <= indexDiff &&
// Math.abs(nums[i] - nums[j]) <= valueDiff) {
// return true;
// }
// j++;
// }
// }

// return false;
// }
// }
