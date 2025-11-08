// File: QA6_FloorDivAndFloorMod.java
// Topic: Math.floorDiv() and Math.floorMod()
// 🧠 Used for integer division and remainder with correct behavior for negative numbers.

public class QA1_FloorDivAndFloorMod {
    public static void main(String[] args) {

        /* ============================================================
         * 🧮 1️⃣ Math.floorDiv() — division rounded toward negative infinity
         * ============================================================
         */
        int a = 15, b = 4;

        System.out.println("floorDiv(15, 4): " + Math.floorDiv(a, b));   // -> 3
        System.out.println("15 / 4 (normal): " + (a / b));               // -> 3 (same for positives)

        System.out.println("floorDiv(-15, 4): " + Math.floorDiv(-15, b)); // -> -4 👈 note!
        System.out.println("-15 / 4 (normal): " + (-15 / b));             // -> -3 (different!)
        System.out.println("floorDiv(15, -4): " + Math.floorDiv(15, -4)); // -> -4 👈 note!
        System.out.println("15 / -4 (normal): " + (15 / -4));             // -> -3 (different!)

        /*
           🔍 Explanation:
           -----------------
           • Normal integer division (/) in Java truncates toward 0.
               → Example:  -15 / 4 = -3   (because -3.75 → truncates to -3)
           • Math.floorDiv() instead rounds toward negative infinity (↓).
               → Example:  -15 / 4 = -4   (because floor(-3.75) = -4)

           💡 So floorDiv() gives more “mathematical” results when negatives are involved.
              It’s especially useful in modular arithmetic, calendars, etc.

           ------------------------------------------------------------
           ✅ Positive example:
               floorDiv(15, 4)  → 3
               because 15 ÷ 4 = 3.75 → floor(3.75) = 3

           ✅ Negative example:
               floorDiv(-15, 4) → -4
               because -15 ÷ 4 = -3.75 → floor(-3.75) = -4
        */


        /* ============================================================
         * 🧩 2️⃣ Math.floorMod() — remainder consistent with floorDiv()
         * ============================================================
         */
        System.out.println("floorMod(15, 4): " + Math.floorMod(15, 4));    // -> 3
        System.out.println("15 % 4 (normal): " + (15 % 4));                // -> 3

        System.out.println("floorMod(-15, 4): " + Math.floorMod(-15, 4));  // -> 1 👈 note!
        System.out.println("-15 % 4 (normal): " + (-15 % 4));              // -> -3 (different!)
        System.out.println("floorMod(15, -4): " + Math.floorMod(15, -4));  // -> -1 👈 note!
        System.out.println("15 % -4 (normal): " + (15 % -4));              // -> 3 (different!)

        /*
           💡 What happens here:
           --------------------
           1️⃣  15 ÷ 4  → 3 remainder 3 ✅
           2️⃣ -15 ÷ 4  → -4 remainder 1 ✅
           3️⃣  15 ÷ -4 → -4 remainder -1 ✅

           floorMod() always makes sure:
             ➤ remainder has the same sign as the divisor (b)

           ----------------------------------------------------
           🧠 Difference between % and floorMod:
           ----------------------------------------------------
           - `%` gives remainder after cutting toward zero.
             Example:  -15 % 4 = -3  ❌
           - `floorMod()` gives mathematical remainder (positive if divisor is positive).
             Example:  -15 mod 4 = 1 ✅

           So:
             floorMod(-15, 4) = 1
             floorMod(15, -4) = -1
        */


        /* ============================================================
         * 🧩 3️⃣ Relationship Between floorDiv() and floorMod()
         * ============================================================
         */
        int x = -15, y = 4;
        int div = Math.floorDiv(x, y);   // -4
        int mod = Math.floorMod(x, y);   // 1

        System.out.println("Check Relation: " + (y * div + mod));  // -> -15 ✅

        /*
           💡 Formula always holds true:
               a = (b × floorDiv(a, b)) + floorMod(a, b)

           Example:
               a = -15, b = 4
               floorDiv(-15,4) = -4
               floorMod(-15,4) = 1
               => (4 * -4) + 1 = -16 + 1 = -15 ✅ correct!
        */


        /* ============================================================
         * ✅ SIMPLE CONCLUSION (For Beginners)
         * ============================================================
         */
        /*
           🧠 Easy rule to remember:
           -------------------------
           Math.floorDiv(a, b):
              → Division that always goes DOWN (toward -∞).
           Math.floorMod(a, b):
              → Remainder consistent with floorDiv (matches its direction).

           ✔ For positives — both behave like normal / and %.
           ✔ For negatives — floorDiv gives smaller integer (more negative).
                             floorMod gives remainder with same sign as divisor.

           📘 Think:
               Normal /  → cuts toward 0
               floorDiv → steps down (toward -∞)

               Normal %  → remainder can be negative
               floorMod → remainder always consistent with floorDiv
        */
    }
}

/*
   💡 Let’s understand floorMod() in the simplest way 👇

   Imagine you are dividing numbers into equal groups and want the leftover.

   Example 1️⃣ →  9 ÷ 5
   ---------------------------------
   Normal division:  9 / 5 = 1 remainder 4 ✅
   → floorMod(9, 5) = 4
   (same as normal %, because both are positive)

   Example 2️⃣ →  -9 ÷ 5
   ---------------------------------
   Let’s check normal % first:
      -9 % 5 = -4   ❌ (negative remainder, looks weird)
   But mathematically we expect leftover to be *positive* (same direction as divisor).

   Now using floorMod:
      -9 ÷ 5 = -1.8 → floor(-1.8) = -2
      remainder = -9 - (5 × -2)
                 = -9 + 10
                 = +1 ✅

   So:
      floorMod(-9, 5) = 1  ✅  (positive, because divisor = +5)

   Example 3️⃣ →  9 ÷ -5
   ---------------------------------
   Normal %:
      9 % -5 = 4   ❌ (positive, but divisor is negative)
   floorMod fixes it:
      9 ÷ -5 = -1.8 → floor(-1.8) = -2
      remainder = 9 - (-5 × -2)
                 = 9 - 10
                 = -1 ✅

   So:
      floorMod(9, -5) = -1  ✅ (same sign as divisor)

   ----------------------------------------------------
   🧠 In short:
   ----------------------------------------------------
   - `%` can give a remainder with *wrong sign*.
   - `floorMod()` always gives a remainder
       → that has the *same sign as the divisor*.

   Quick Table 🧩
   ---------------------------
   | a   | b  | a % b | floorMod(a,b) |
   |-----|----|--------|----------------|
   | 9   | 5  | 4      | 4 ✅           |
   | -9  | 5  | -4 ❌  | 1 ✅           |
   | 9   | -5 | 4 ❌   | -1 ✅          |

   💬 Easy rule to remember:
   👉 floorMod() always keeps the remainder in the same direction as b.
*/
