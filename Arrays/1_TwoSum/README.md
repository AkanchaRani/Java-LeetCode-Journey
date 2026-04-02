# Two Sum (1)

## 🧠 Intuition
We need to find two numbers in the array whose sum equals the target.  
The simplest way is to check every pair.

---

## ⚙️ Approach (Brute Force)
- Use two loops
- For each element, check all elements after it
- If sum equals target → return indices

---

## ⏱ Complexity
- Time: O(n²)
- Space: O(1)

---

## 💻 Code

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}