# KMP Algorithm Implementation

## 📌 Overview

This project implements the **Knuth-Morris-Pratt (KMP)** string matching algorithm, as described in Section 3.4.5 of *Compilers: Principles, Techniques, & Tools* by Alfred V. Aho.

The goal of this implementation is to determine whether a given **pattern (keyword)** appears as a substring within a **text string**, which is a fundamental operation in the **lexical analysis phase of a compiler**.

---

## ⚙️ Environment & Tools

* **Operating System:** Windows 10
* **Programming Language:** Java (JDK 17 or higher recommended)
* **IDE (optional):** IntelliJ IDEA / Eclipse / VS Code

---

## 🚀 How to Run the Program

1. Clone or download the repository.
2. Open a terminal in the project folder.
3. Compile the program:

```bash
javac KMP.java
```

4. Run the program:

```bash
java KMP
```

5. The program will execute test cases and display whether the pattern exists in each string.

---

## 🧠 Algorithm Explanation

The **KMP algorithm** improves upon naive string matching by avoiding unnecessary comparisons.

Instead of restarting the comparison from the beginning after a mismatch, it uses a **failure function** (also called prefix function) to determine how much the pattern can safely "shift".

### Key Ideas:

* The variable `s` represents how many characters of the pattern have been matched.

* When a mismatch occurs, the algorithm uses the failure function:

  ```
  s = f(s)
  ```

  This allows the algorithm to reuse previous matching information.

* The text is scanned **only once**, making the algorithm efficient.

---

## 📊 Time Complexity

* **Failure Function Construction:** O(n)
* **Pattern Search:** O(m)

Where:

* `n` = length of the pattern
* `m` = length of the text

👉 **Total Complexity: O(n + m)**

---

## 🧪 Test Cases

The following cases correspond to Exercise 3.4.6:

| Case | Text      | Pattern | Result |
| ---- | --------- | ------- | ------ |
| a    | abababaab | ababaa  | true   |
| b    | abababbaa | ababaa  | false  |

---

## 🧩 Files Description

* `KMP.java`: Contains:

  * Failure function implementation
  * KMP search algorithm
  * Test cases in the `main` method

---

## 🎯 Conclusion

The KMP algorithm is efficient because it **never re-examines characters in the text**, and all fallback operations are handled using the failure function.

This makes it suitable for applications such as:

* Lexical analysis
* Text search engines
* Pattern recognition

---

## 👥 Authors

* [Your Name]
* [Partner Name]

---

## 📚 Reference

Aho, A. V. (2007). *Compilers: Principles, Techniques, & Tools* (2nd ed.). Pearson.
