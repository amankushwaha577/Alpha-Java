public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
/* ============================================================
 * 🧠 NON-PRIMITIVE DATA TYPES — MASTER SUMMARY
 * ------------------------------------------------------------
 *  ✔ Created using classes (user-defined or built-in)
 *  ✔ Stored in HEAP memory (reference stored in stack)
 *  ✔ Can store multiple values / complex structures
 *  ✔ Default value = null
 *  ✔ Examples:
 *        • String
 *        • Arrays
 *        • Classes & Objects
 *        • Interfaces
 *        • Enums
 *        • Records (Java 16+)
 *        • Collections (List, Map, Set)
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 1️⃣ STRING (Most Important Non-Primitive)
 * ------------------------------------------------------------
 *  ✔ String is a CLASS (not primitive)
 *  ✔ IMMUTABLE → cannot change after creation
 *  ✔ Stored in String Constant Pool (SCP) when created as literal
 *  ✔ `new String("Aman")` → stored in HEAP (NOT SCP)
 *  ✔ == compares REFERENCES (memory address)
 *  ✔ equals() compares CONTENT
 *
 *  Example:
 *      String s1 = "Aman";
 *      String s2 = "Aman";
 *      String s3 = new String("Aman");
 *
 *      s1 == s2 → true   (both from SCP)
 *      s1 == s3 → false  (heap vs SCP)
 *      s1.equals(s3) → true (same content)
 *
 *  💡 Memory Rule:
 *     LITERAL → SCP
 *     new String() → HEAP only
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 2️⃣ STRINGBUILDER / STRINGBUFFER (Mutable)
 * ------------------------------------------------------------
 *  ✔ Mutable → CAN change content
 *  ✔ Used when doing many modifications (append, delete)
 *  ✔ StringBuilder → NOT synchronized (faster)
 *  ✔ StringBuffer  → synchronized (thread-safe)
 *
 *  Example:
 *      StringBuilder sb = new StringBuilder("Aman");
 *      sb.append(" Kushwaha");  // content changes in same object
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 3️⃣ ARRAYS (Fixed Size, Non-Primitive)
 * ------------------------------------------------------------
 *  ✔ Contiguous memory block
 *  ✔ Size fixed once created
 *  ✔ Can store primitives OR objects
 *  ✔ Default values:
 *        int[] → 0
 *        boolean[] → false
 *        String[] → null
 *
 *  Example:
 *      int[] arr = {10, 20, 30};
 *      String[] names = new String[3]; // all null
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 4️⃣ CLASSES & OBJECTS
 * ------------------------------------------------------------
 *  ✔ Class → blueprint
 *  ✔ Object → instance stored in heap
 *  ✔ Access via reference variable
 *
 *  Example:
 *      class Person { int age; }
 *      Person p = new Person();
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 5️⃣ INTERFACES (100% abstract until Java 8)
 * ------------------------------------------------------------
 *  ✔ Can contain abstract methods
 *  ✔ Java 8 → default + static methods allowed
 *  ✔ Achieves multiple inheritance in Java
 *
 *  Example:
 *      interface A { void show(); }
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 6️⃣ ENUMS (Fixed constant values)
 * ------------------------------------------------------------
 *  ✔ Used to represent fixed set of constants
 *
 *  Example:
 *      enum Day { MON, TUE, WED }
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 7️⃣ WRAPPER CLASSES (Object versions of primitives)
 * ------------------------------------------------------------
 *  ✔ byte → Byte
 *  ✔ short → Short
 *  ✔ int → Integer
 *  ✔ long → Long
 *  ✔ float → Float
 *  ✔ double → Double
 *  ✔ char → Character
 *  ✔ boolean → Boolean
 *
 *  ✔ Support:
 *       • parsing (parseInt)
 *       • valueOf
 *       • compare
 *       • max/min/sum
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 8️⃣ OBJECT CLASS (Parent of all classes)
 * ------------------------------------------------------------
 *  ✔ toString()
 *  ✔ equals()
 *  ✔ hashCode()
 *  ✔ clone()
 *  ✔ finalize()
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧠 QUICK INTERVIEW REVISION (Non-Primitives)
 * ------------------------------------------------------------
 *  🔹 Stored in HEAP
 *  🔹 Default value = null
 *  🔹 String immutable
 *  🔹 StringBuilder mutable
 *  🔹 Arrays fixed-size
 *  🔹 Classes → blueprint; Objects → instances
 *  🔹 Wrapper objects → useful for Collections
 *  🔹 equals() for content; == for reference
 * ------------------------------------------------------------
 */
