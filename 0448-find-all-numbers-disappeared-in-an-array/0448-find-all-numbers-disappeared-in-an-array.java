import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Store all elements in HashSet
        for (int num : nums) {
            set.add(num);
        }

        List<Integer> ans = new ArrayList<>();

        // Check numbers from 1 to n
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}