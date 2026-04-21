# Majority Element (169)

## 🧠 Intuition
A majority element is the element that appears more than ⌊n/2⌋ times in the array.

We can solve this problem using multiple approaches with increasing efficiency.

---

## ⚙️ Approach 1: Brute Force

### Idea
- For each element, count its frequency by scanning the entire array.
- If frequency > n/2 → return that element.

### Complexity
- Time: O(n²)
- Space: O(1)

---

## ⚙️ Approach 2: Sorting

### Idea
- Sort the array.
- Count consecutive occurrences.
- If frequency > n/2 → return element.

### Complexity
- Time: O(n log n)
- Space: O(1)

---

## ⚙️ Approach 3: Moore’s Voting Algorithm (Optimal)

### Idea
- Maintain a candidate and a count.
- Same element → count++
- Different element → count--
- When count becomes 0 → choose new candidate

👉 Majority element will always survive cancellation.

### Complexity
- Time: O(n)
- Space: O(1)

---

