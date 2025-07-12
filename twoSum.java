pubimport java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed)) {
                return new int[] { map.get(needed), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {}; // No match found
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}