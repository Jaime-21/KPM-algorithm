# KMP Algorithm

## Environment

* Operating System: Windows 11
* Programming Language: Java
* IDE: IntelliJ IDEA Ultimate



## How to Run

1. Copy the KMP code and paste it into your preferred IDE.

2. Run the program.

3. If you want to test with other strings, go to the `main` method and change or add new test cases.



## Description

This program implements the **KMP (Knuth-Morris-Pratt)** algorithm described in Figure 3.20 of the book *Compilers: Principles, Techniques, & Tools*.

The algorithm is used to check if a pattern (keyword) exists inside a text.



## Algorithm Explanation

The algorithm has two main parts:

1. **Failure Function**

   * It is built from the pattern.
   * It helps the algorithm know how much to "jump" when a mismatch happens.

2. **Search Process**

   * The text is scanned from left to right.
   * If characters match, the algorithm continues.
   * If a mismatch occurs, it uses the failure function instead of starting over.

This makes the algorithm efficient.



## What is the failure function and what does it do?

The failure function is an array built from the pattern before starting the search.

For each position, it stores the length of the longest prefix that is also a suffix up to that point.

Its purpose is to avoid unnecessary comparisons.
When a mismatch happens, instead of restarting, the algorithm uses this function to continue from a better position.



## Test Cases

Pattern used: `ababaa`

* Text: `abababaab` → Result: true
* Text: `abababbaa` → Result: false



## Notes

The KMP algorithm is efficient because it does not recheck characters in the text.
It uses previous information from the pattern to move faster.

Time complexity: **O(n + m)**
