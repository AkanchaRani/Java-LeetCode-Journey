# Find Missing and Repeated Values (2965)

## 🧠 Intuition
The grid should contain numbers from **1 to n²**, each appearing exactly once.  
However:
- One number is repeated
- One number is missing  

We can track how many times each number appears.

---

## ⚙️ Approach (Frequency Array / Hashing)

- Create a frequency array of size `n² + 1`
- Traverse the grid and update frequency
- Traverse the frequency array:
  - If frequency = 2 → repeated element
  - If frequency = 0 → missing element

---

## ⏱ Complexity

- **Time Complexity (T.C.):** O(n²)  
- **Space Complexity (S.C.):** O(n²)  

---

## 🔥 Pattern

- Hashing  
- Frequency Counting  

---

## 🚀 Key Takeaway

Using a frequency array allows direct tracking of occurrences, making it easy to detect missing and duplicate values efficiently.