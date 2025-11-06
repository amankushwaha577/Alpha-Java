// File: ShortAndWrapperNotes.java
// Topic: short (primitive) + Short (wrapper class) + inbuilt methods + comparison pitfalls
// 🧠 Short = 2 bytes (range: -32,768 to 32,767)
// 💡 Used for smaller integer storage when memory optimization is needed (IoT, embedded data, arrays of numbers)

public class _3_ShortAndWrapperNotes {
    public static void main(String[] args) {

        // --------------------------------------
        // 🧩 1️⃣ short — Primitive Type
        // --------------------------------------
        // 👉 16-bit signed integer (2 bytes)
        // 👉 Default range: -32768 to +32767
        // 👉 Common use: when storing lots of small numeric values (saves memory)
        short a = 100;      // ✅ 100 fits in short range
        short b = 50;       // ✅ another short number

        // 🔹 Basic Arithmetic (internally promoted to int during operations)
        System.out.println("Sum: " + (a + b));   // -> 150
        System.out.println("Diff: " + (a - b));  // -> 50
        System.out.println("Prod: " + (a * b));  // -> 5000
        System.out.println("Div: " + (a / b));   // -> 2
        // 💡 Even though operands are short, arithmetic happens in int internally in Java.

        // --------------------------------------
        // 🧩 2️⃣ Short — Wrapper Class
        // --------------------------------------
        // 👉 The wrapper allows `short` to behave like an object.
        // 👉 Useful when working with Collections (e.g., List<Short>) or APIs requiring Objects.

        Short box = Short.valueOf(a);    // Boxing: primitive → object
        short unbox = box.shortValue();  // Unboxing: object → primitive

        System.out.println("Boxed: " + box);     // -> 100
        System.out.println("Unboxed: " + unbox); // -> 100

        // 🧠 Auto-boxing & Auto-unboxing
        // Java compiler automatically converts between short ↔ Short
        Short autoBox = 25;       // short → Short automatically
        short autoUnbox = autoBox; // Short → short automatically
        System.out.println("AutoBox: " + autoBox);     // -> 25
        System.out.println("AutoUnbox: " + autoUnbox); // -> 25

        // --------------------------------------
        // 🧩 3️⃣ Inbuilt Methods in Short class (Daily Use + LeetCode Ready)
        // --------------------------------------
        // 🧠 These methods help with conversions, comparisons, and byte operations.

        // 🔹 1️⃣ Short.parseShort(String s)
        // ✅ Converts a String → primitive short
        // 🧠 Use case: read numeric input from text
        System.out.println(Short.parseShort("123")); // -> 123

        // 🔹 2️⃣ Short.toString(short value)
        // ✅ Converts short → String
        // 🧠 Use case: concatenating or printing numbers as text
        System.out.println(Short.toString((short) 45)); // -> "45"

        // 🔹 3️⃣ Short.valueOf(String s)
        // ✅ Converts a string → Short object (wrapper)
        // 🧠 Use case: when Collections need an object type, not primitive
        System.out.println(Short.valueOf("120")); // -> 120 (Short object)

        // 🔹 4️⃣ Short.valueOf(String s, int radix)
        // ✅ Converts numbers from any base (binary, octal, decimal, hex) → Short object
        // 🧠 Use case: base conversions — very common in parsing problems
        System.out.println(Short.valueOf("101", 2));  // -> 5
        // "101" (base 2) = 1×2² + 0×2¹ + 1×2⁰ = 4 + 0 + 1 = 5 ✅ (Binary → Decimal)

        System.out.println(Short.valueOf("10", 8));   // -> 8
        // "10" (base 8) = 1×8¹ + 0×8⁰ = 8 ✅  (Octal → Decimal)

        System.out.println(Short.valueOf("10", 10));  // -> 10
        // "10" (base 10) = 10 ✅  (Decimal → Decimal)

        System.out.println(Short.valueOf("A", 16));   // -> 10
        // "A" (base 16) = 10 ✅  (Hexadecimal → Decimal)
        // 💡 Hexadecimal digits: 0–9, A=10, B=11, C=12, D=13, E=14, F=15

        // 🔹 5️⃣ Short.decode(String s)
        // ✅ Converts strings with prefixes (0x, 0, #) into Short values
        // 🧠 Use case: reading config values (like color codes or constants)
        System.out.println(Short.decode("123"));   // -> 123 (decimal)
        System.out.println(Short.decode("0x7B"));  // -> 123 (hex)
        System.out.println(Short.decode("#7B"));   // -> 123 (hex)
        System.out.println(Short.decode("0173"));  // -> 123 (octal)
        // 💡 decode() automatically detects the number system based on prefix.

        // 🔹 6️⃣ Short.compare(short x, short y)
        // ✅ Returns:
        //    → -1 if x < y
        //    →  0 if x == y
        //    →  1 if x > y
        System.out.println(Short.compare((short) 10, (short) 20)); // -> -1
        System.out.println(Short.compare((short) 20, (short) 10)); // -> 1
        System.out.println(Short.compare((short) 5, (short) 5));   // -> 0

        // 🔹 7️⃣ Short.reverseBytes(short value)
        // ✅ Swaps high and low bytes of the 16-bit number
        // 🧠 Use case: Endianness correction (network byte order)
        System.out.println(Short.reverseBytes((short) 0x1234)); // -> 13330 (0x3412)
        /*
        💡 EXPLANATION:
        0x1234 (hex) = binary 0001 0010 0011 0100
        reverseBytes → 0011 0100 0001 0010 = 0x3412 = 13330 decimal
        Used when transferring binary data between systems with different architectures.
        */

        // 🔹 8️⃣ Short.hashCode(short value)
        // ✅ Returns hash code (same as short value)
        // 🧠 Used internally in HashMap/HashSet
        System.out.println(Short.hashCode((short) 99)); // -> 99

        // 🔹 9️⃣ Constants
        // ✅ Provide key info for memory size and limits
        System.out.println("MAX: " + Short.MAX_VALUE + ", MIN: " + Short.MIN_VALUE);
        // -> MAX: 32767, MIN: -32768
        System.out.println("Bytes: " + Short.BYTES + ", Bits: " + Short.SIZE);
        // -> Bytes: 2, Bits: 16

        // --------------------------------------
        // 🧩 4️⃣ Comparison Pitfall (Caching)
        // --------------------------------------
        // 👉 Short caches values from -128 to 127
        // 👉 '==' checks memory reference, not value equality.
        // 👉 'equals()' compares actual numeric value.
        Short x = 100;  // within cache range
        Short y = 100;  // same cached object
        Short p = 200;  // outside cache
        Short q = 200;  // different object

        System.out.println(x == y);      // -> true   (same cached reference)
        System.out.println(p == q);      // -> false  (different objects)
        System.out.println(x.equals(y)); // -> true   (values equal)
        System.out.println(p.equals(q)); // -> true   (values equal)
        // 💡 Interview Tip: Always use .equals() for wrappers (Integer, Short, Long).

        // --------------------------------------
        // 🧩 5️⃣ Safe Comparison Example
        // --------------------------------------
        Short s1 = 127, s2 = 127;
        if (s1.equals(s2)) {
            System.out.println("Equal ✔️");
        } else {
            System.out.println("Not Equal ❌");
        }

        // --------------------------------------
        // 🧠 Summary (Quick Revision)
        // --------------------------------------
        // ✅ short = primitive (fast, 2 bytes)
        // ✅ Short = wrapper (object type, has helper methods)
        // ✅ Auto-boxing/unboxing = easy conversion between short ↔ Short
        //
        // 🔹 Commonly used methods:
        //   parseShort(), toString(), valueOf(String), valueOf(String, radix),
        //   decode(), compare(), reverseBytes(), hashCode(),
        //   MAX_VALUE, MIN_VALUE, BYTES, SIZE.
        //
        // ⚠️ Pitfall:
        //   - Always use equals() for wrapper comparisons.
        //   - Caching applies only in range [-128, 127].
    }
}
