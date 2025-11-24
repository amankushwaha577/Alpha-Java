public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
/* ============================================================
 * 🧩 1️⃣ STRING — INTRO (Most Important Non-Primitive)
 * ------------------------------------------------------------
 *  ✔ String is a CLASS (java.lang.String)
 *  ✔ Non-primitive, stored in HEAP
 *  ✔ Literal Strings go to the special memory area → SCP
 *  ✔ IMMUTABLE → once created, value cannot change
 *
 *  Example:
 *      String s = "Aman";   // goes to SCP
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 2️⃣ STRING MEMORY MODEL
 * ------------------------------------------------------------
 *  🔹 "Aman" (literal) → stored in SCP
 *  🔹 new String("Aman") → stored in HEAP (always new object)
 *
 *  Example:
 *      String s1 = "Aman";          // SCP
 *      String s2 = "Aman";          // same SCP reference
 *      String s3 = new String("Aman"); // HEAP, different object
 *
 *  👉 s1 == s2 → true   (same SCP object)
 *  👉 s1 == s3 → false  (heap vs SCP)
 *  👉 s1.equals(s3) → true  (content is same)
 *
 *  💡 REMEMBER:
 *     LITERAL → SCP
 *     new String() → HEAP
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 3️⃣ WHY STRING IS IMMUTABLE?
 * ------------------------------------------------------------
 *  ✔ Security (used in ClassLoader, File paths)
 *  ✔ Thread-safety by default
 *  ✔ SCP sharing only possible if Strings don't change
 *
 *  Example:
 *      String x = "Aman";
 *      x.concat("K");
 *      // "Aman" stays same; new object "AmanK" created.
 *
 *  👉 Immutable means "value does not change"
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 4️⃣ CONCATENATION RULES
 * ------------------------------------------------------------
 *  ✔ Using + creates NEW String (because immutable)
 *  ✔ Using StringBuilder is FASTER for loops
 *
 *  Example:
 *      String a = "Aman";
 *      String b = a + "Kush";
 *      // a stays "Aman"; b becomes new object.
 *
 *  💡 Compiler Optimization:
 *      "Aman" + "Kush" → combined at compile-time = "AmanKush"
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 5️⃣ intern() — VERY IMPORTANT FOR INTERVIEWS
 * ------------------------------------------------------------
 *  ✔ Moves HEAP string into SCP if not already present.
 *
 *  Example:
 *      String a = new String("Aman");
 *      String b = a.intern();
 *      String c = "Aman";
 *
 *  👉 b == c → true   (both in SCP)
 *  👉 a == c → false  (heap vs SCP)
 *
 *  💡 Trick:
 *     intern() returns the SCP reference.
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 6️⃣ IMPORTANT STRING METHODS
 * ------------------------------------------------------------
 *  🔹 length()
 *  🔹 charAt()
 *  🔹 substring()
 *  🔹 indexOf(), lastIndexOf()
 *  🔹 equals(), equalsIgnoreCase()
 *  🔹 startsWith(), endsWith()
 *  🔹 trim()
 *  🔹 replace(), replaceAll()
 *  🔹 split()
 *  🔹 toCharArray()
 *
 *  Example:
 *      String s = "Aman Kush";
 *      s.length(); → 9
 *      s.charAt(0); → 'A'
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 7️⃣ == vs equals() — MOST ASKED
 * ------------------------------------------------------------
 *  == → compares references (memory address)
 *  equals() → compares content (characters)
 *
 *  Example:
 *      String s1 = "Java";
 *      String s2 = "Java";
 *      String s3 = new String("Java");
 *
 *      s1 == s2 → true     (same SCP reference)
 *      s1 == s3 → false    (heap vs SCP)
 *      s1.equals(s3) → true  (same characters)
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 8️⃣ IMMUTABILITY TRICK (VERY COMMON)
 * ------------------------------------------------------------
 *  Example:
 *      String s = "Aman";
 *      s.concat("Kush");
 *      System.out.println(s);
 *
 *  Output:
 *      Aman
 *
 *  Because s is unchanged → new object created but NOT stored.
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧩 9️⃣ substring() Important Note
 * ------------------------------------------------------------
 *  Java 7u6 → substring creates NEW char array
 *  Earlier → substring shared original array (memory leak risk)
 *
 *  Example:
 *      "AmanKush".substring(0,4) → "Aman"
 * ------------------------------------------------------------
 */


/* ============================================================
 * 🧠 QUICK STRING INTERVIEW REVISION
 * ------------------------------------------------------------
 *  🔹 String literal → SCP
 *  🔹 new String() → heap
 *  🔹 String is immutable
 *  🔹 + creates new String
 *  🔹 intern() → returns SCP version
 *  🔹 == compares reference
 *  🔹 equals() compares content
 *  🔹 Use StringBuilder for multiple modifications
 * ------------------------------------------------------------
 */
