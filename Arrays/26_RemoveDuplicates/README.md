# Remove Duplicates from Sorted Array (26)

## 🧠 Intuition
Since the array is sorted, duplicates are adjacent.  
We can keep track of unique elements using a pointer.

---

## ⚙️ Approach (Two Pointer)
- Use two pointers:
  - `i` → last unique element
  - `j` → scans array
- If nums[i] != nums[j]:
  - move i forward
  - copy nums[j] to nums[i]

---

## ⏱ Complexity
- Time: O(n)
- Space: O(1)

---

## 🚀 Pattern
Two Pointer (same direction)