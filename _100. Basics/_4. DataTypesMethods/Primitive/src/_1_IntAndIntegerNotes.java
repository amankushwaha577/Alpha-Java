// Topic: int (primitive) + Integer (wrapper class) + inbuilt methods + comparison pitfalls
// 🧠 Notes are given step by step so you can understand concept + logic.

public class _1_IntAndIntegerNotes {
    public static void main(String[] args) {

        // --------------------------------------
        // 🧩 1️⃣ int — Primitive Type
        // --------------------------------------
        // 👉 Primitive = raw data stored directly in memory (not an object)
        // 👉 int = 4 bytes (range ≈ -2.1B to +2.1B)
        int a = 10; // variable 'a' holds value 10
        int b = 5;  // variable 'b' holds value 5

        // 🧠 Performing arithmetic operations
        System.out.println("Sum: " + (a + b));  // -> Sum: 15
        System.out.println("Diff: " + (a - b)); // -> Diff: 5
        System.out.println("Prod: " + (a * b)); // -> Prod: 50
        System.out.println("Div: " + (a / b));  // -> Div: 2
        System.out.println("Mod: " + (a % b));  // -> Mod: 0
        // 💡 Note: % gives remainder, / gives integer division result

        // --------------------------------------
        // 🧩 2️⃣ Integer — Wrapper Class
        // --------------------------------------
        // 👉 Integer is a class that wraps primitive int into an Object.
        // 👉 Needed when using Collections or Object-based APIs.
        Integer boxed = Integer.valueOf(a);  // Manual Boxing: int -> Integer object
        int unboxed = boxed.intValue();      // Manual Unboxing: Integer -> int

        System.out.println("Boxed: " + boxed);     // -> Boxed: 10
        System.out.println("Unboxed: " + unboxed); // -> Unboxed: 10

        // 🧠 Auto-boxing and Auto-unboxing (automatic conversion)
        Integer autoBox = 42;  // compiler auto-converts int → Integer
        int autoUnbox = autoBox; // compiler auto-converts Integer → int
        System.out.println("AutoBox: " + autoBox);   // -> AutoBox: 42
        System.out.println("AutoUnbox: " + autoUnbox); // -> AutoUnbox: 42

        // --------------------------------------
        // 🧩 3️⃣ Inbuilt Methods in Integer class
        // --------------------------------------
        // 🧠 Wrapper classes provide helpful utilities for conversions & comparisons
        System.out.println(Integer.parseInt("123"));           // -> 123  (String to int)
        System.out.println(Integer.toString(99));              // -> 99   (int to String)
        System.out.println(Integer.valueOf("101", 2));    // -> 5    ("101" binary → decimal)
        System.out.println(Integer.max(10, 20));            // -> 20   (returns larger)
        System.out.println(Integer.min(10, 20));            // -> 10   (returns smaller)
        System.out.println(Integer.compare(5, 5));                // -> 0    (equal)
        System.out.println(Integer.compare(5, 8));          // -> -1   (first < second)
        System.out.println(Integer.compare(8, 5));          // -> 1    (first > second)
        System.out.println(Integer.toBinaryString(10));     // -> 1010 (binary)
        System.out.println(Integer.toHexString(255));       // -> ff   (hexadecimal)
        System.out.println(Integer.bitCount(7));            // -> 3    (111 has three 1s)
        // 💡 Useful in coding rounds: parsing, bit ops, base conversions, etc.

        // --------------------------------------
        // 🧩 4️⃣ Comparison Pitfall
        // --------------------------------------
        // 👉 '==' compares object reference (memory address)
        // 👉 'equals()' compares actual numeric value
        // 👉 JVM caches Integer objects in range [-128, 127]
        Integer p = 100; // cached
        Integer q = 100; // same cached object
        Integer r = 200; // new object (not cached)
        Integer s = 200; // another new object

        System.out.println(p == q);   // -> true   (same cached reference)
        System.out.println(r == s);   // -> false  (different objects)
        System.out.println(p.equals(q)); // -> true   (same numeric value)
        System.out.println(r.equals(s)); // -> true   (same numeric value)
        // 💡 Interview Tip: Always use equals() for comparing wrapper objects.

        // --------------------------------------
        // 🧩 5️⃣ Safe Comparison Example
        // --------------------------------------
        Integer x = 7, y = 7;
        System.out.println(x.equals(y)); // -> true (recommended way)
    }
}
