/*
Use an map to store already visited element and its index.
While we iterate and inserting elements into the table, we also look back to check if current element's complement already exists in the table.
If it exists, we have found a solution and return immediately.
Time complexity: O(n), one pass
Space complexity: O(n)
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
