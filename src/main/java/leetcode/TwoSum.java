package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mymap = new HashMap<>();
        int required;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            required = target - nums[i];
            if (mymap.containsKey(required)) {
                result[0] = mymap.get(required);
                result[1] = i;
                return result;
            }
            mymap.put(nums[i], i);
        }
        return result;
    }
}
