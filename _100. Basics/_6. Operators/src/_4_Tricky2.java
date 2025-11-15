
public class _4_Tricky2 {
    public static void main(String[] args) {

        /* ✅ 1️⃣ What is the output?
              int a = 10;
              System.out.println(a++ + a);

           ✔ Dry Run:
             a = 10
             a++ → returns 10, then a = 11
             Expression = 10 + 11 = 21
        */
        {
            int a = 10;
            System.out.println(a++ + a); // 21
        }

        /* ✅ 2️⃣ What is the output?
              int a = 10;
              System.out.println(a + ++a);

           ✔ Dry Run:
             a = 10
             ++a → a = 11, returns 11
             Expression = 10 + 11 = 21
        */
        {
            int a = 10;
            System.out.println(a + ++a); // 21
        }

        /* ✅ 3️⃣ What is the output?
              int a = 10;
              System.out.println(++a + ++a);

           ✔ Dry Run:
             a = 10
             ++a → a=11, use 11
             ++a → a=12, use 12
             Expression = 11 + 12 = 23
        */
        {
            int a = 10;
            System.out.println(++a + ++a); // 23
        }

        /* ✅ 4️⃣ What is the output?
              int a = 10;
              System.out.println(a-- + --a);

           ✔ Dry Run:
             a = 10
             a-- → use 10, a=9
             --a → a=8, use 8
             Expression = 10 + 8 = 18
        */
        {
            int a = 10;
            System.out.println(a-- + --a); // 18
        }

        /* ✅ 5️⃣ What is the output?
              int x = 5;
              int y = x++ + x++ + x++;

           ✔ Dry Run:
             x=5 → x++ → use 5, x=6
             x=6 → x++ → use 6, x=7
             x=7 → x++ → use 7, x=8
             y = 5 + 6 + 7 = 18
        */
        {
            int x = 5;
            int y = x++ + x++ + x++;
            System.out.println(y); // 18
        }

        /* ✅ 6️⃣ What is the output?
              int x = 5;
              int y = ++x + ++x + ++x;

           ✔ Dry Run:
             x=5 → ++x → x=6, use 6
             x=6 → ++x → x=7, use 7
             x=7 → ++x → x=8, use 8
             y = 6 + 7 + 8 = 21
        */
        {
            int x = 5;
            int y = ++x + ++x + ++x;
            System.out.println(y); // 21
        }

        /* ✅ 7️⃣ What is the output?
              int a = 1;
              int b = a++ + ++a + a++ + a;

           ✔ Dry Run:
             a=1
             a++ → use 1, a=2
             ++a → a=3, use 3
             a++ → use 3, a=4
             a   → use 4
             b = 1 + 3 + 3 + 4 = 11
        */
        {
            int a = 1;
            int b = a++ + ++a + a++ + a;
            System.out.println(b); // 11
        }

        /* ✅ 8️⃣ What is the output?
              int a = 5;
              int b = 2;
              int c = a++ - --b + ++a - b--;

           ✔ Dry Run:
             a=5, b=2
             a++ → use 5, a=6
             --b → b=1, use 1
             ++a → a=7, use 7
             b-- → use 1, b=0

             Expression = 5 - 1 + 7 - 1 = 10
        */
        {
            int a = 5, b = 2;
            int c = a++ - --b + ++a - b--;
            System.out.println(c); // 10
        }

        /* ✅ 9️⃣ What is the output?
              int x = 10;
              x += x++ + ++x;

           ✔ Dry Run:
             x = 10
             x++ → use 10, x=11
             ++x → x=12, use 12
             RHS = 10 + 12 = 22
             x += 22 → x = 10 + 22 = 32
        */
        {
            int x = 10;
            x += x++ + ++x;
            System.out.println(x); // 32
        }

        /* ✅ 1️⃣0️⃣ What is the output?
              int x = 10;
              x = x++ + x * 2;

           ✔ Precedence:
             * has higher precedence than +
           ✔ Dry Run:
             x=10
             RHS: x++ + x*2
               - Evaluate left operand x++: use 10, x=11
               - Evaluate right operand x*2: x=11 → 11*2=22
             RHS = 10 + 22 = 32
             x = 32
        */
        {
            int x = 10;
            x = x++ + x * 2;
            System.out.println(x); // 32
        }

        /* ✅ 1️⃣1️⃣ What is the output?
              System.out.println(10 * 20 + "Java");
              System.out.println("Java" + 10 * 20);

           ✔ Explanation:
             10*20 = 200 → 200 + "Java" → "200Java"
             "Java" + (10*20) → "Java200"
        */
        {
            System.out.println(10 * 20 + "Java");  // 200Java
            System.out.println("Java" + 10 * 20);  // Java200
        }

        /* ✅ 1️⃣2️⃣ What is the output?
              System.out.println("Result: " + 10 + 20);
              System.out.println("Result: " + (10 + 20));

           ✔ Explanation:
             "Result: " + 10 → "Result: 10"
             "Result: 10" + 20 → "Result: 1020"

             (10 + 20) = 30
             "Result: " + 30 → "Result: 30"
        */
        {
            System.out.println("Result: " + 10 + 20);     // Result: 1020
            System.out.println("Result: " + (10 + 20));   // Result: 30
        }

        /* ✅ 1️⃣3️⃣ What is the output?
              int a = 10;
              int b = 20;
              System.out.println(a == 10 && b++ == 20);
              System.out.println(b);

           ✔ Dry Run:
             a==10 → true
             b++==20 → use 20, then b=21 → true
             true && true → true
             Final b = 21
        */
        {
            int a = 10, b = 20;
            System.out.println(a == 10 && b++ == 20); // true
            System.out.println(b);                    // 21
        }

        /* ✅ 1️⃣4️⃣ What is the output?
              int a = 10;
              int b = 20;
              System.out.println(a != 10 && b++ == 20);
              System.out.println(b);

           ✔ Dry Run:
             a != 10 → false
             && short-circuits → b++ not executed
             So b remains 20
        */
        {
            int a = 10, b = 20;
            System.out.println(a != 10 && b++ == 20); // false
            System.out.println(b);                    // 20
        }

        /* ✅ 1️⃣5️⃣ What is the output?
              int a = 10;
              int b = 20;
              System.out.println(a == 10 || b++ == 20);
              System.out.println(b);

           ✔ Dry Run:
             a == 10 → true
             || short-circuits → right side not evaluated
             b remains 20
        */
        {
            int a = 10, b = 20;
            System.out.println(a == 10 || b++ == 20); // true
            System.out.println(b);                    // 20
        }

        /* ✅ 1️⃣6️⃣ Difference between & and && on booleans?

           ✔ & (bitwise AND):
             - Evaluates BOTH sides, even if left is false.

           ✔ && (logical AND):
             - Short-circuits when left is false, skips right.
        */
        {
            boolean res1 = (10 > 5) & (10 / 0 == 0);   // throws ArithmeticException
            System.out.println(res1);
        }

        // ⚠️ NOTE:
        // The above snippet would actually throw ArithmeticException.
        // Usually you explain this in interview rather than run it.
        // So let's comment it out to keep the file runnable:

        /*
        {
            boolean res1 = (10 > 5) & (10 / 0 == 0); // LEFT true, RIGHT still evaluated → exception
            System.out.println(res1);
        }
        */

        /* ✅ 1️⃣7️⃣ What is the output using && ?
              boolean res2 = (10 < 5) && (10 / 0 == 0);

           ✔ Dry Run:
             10<5 → false
             && short-circuits → right not evaluated
             res2 = false
        */
        {
            boolean res2 = (10 < 5) && (10 / 0 == 0);
            System.out.println(res2); // false
        }

        /* ✅ 1️⃣8️⃣ Bitwise on booleans:
              System.out.println(true & false);
              System.out.println(true | false);
              System.out.println(true ^ false);

           ✔ Explanation:
             true & false → false
             true | false → true
             true ^ false → true (XOR)
        */
        {
            System.out.println(true & false); // false
            System.out.println(true | false); // true
            System.out.println(true ^ false); // true
        }

        /* ✅ 1️⃣9️⃣ What is the output?
              int x = 7;
              System.out.println(x & 1);

           ✔ Concept:
             x & 1 → 1 if x is odd, 0 if even
             7 → 0111
             1 → 0001
             & → 0001 → 1 (odd)
        */
        {
            int x = 7;
            System.out.println(x & 1); // 1
        }

        /* ✅ 2️⃣0️⃣ What is the output?
              int x = 8;
              System.out.println(x & 1);

           ✔ 8 → 1000
             1 → 0001
             & → 0000 → 0 (even)
        */
        {
            int x = 8;
            System.out.println(x & 1); // 0
        }

        /* ✅ 2️⃣1️⃣ Using ternary:
              int n = 5;
              String s = (n % 2 == 0) ? "Even" : "Odd";

           ✔ For n=5:
             5 % 2 = 1 ≠ 0 → "Odd"
        */
        {
            int n = 5;
            String s1 = (n % 2 == 0) ? "Even" : "Odd";
            System.out.println(s1); // Odd
        }

        /* ✅ 2️⃣2️⃣ Nested ternary:
              int n = 0;
              String type = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";

           ✔ For n=0:
             n>0? false
             n<0? false
             → "Zero"
        */
        {
            int n = 0;
            String type = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
            System.out.println(type); // Zero
        }

        /* ✅ 2️⃣3️⃣ What is the output?
              int a = 10;
              int b = 3;
              double d = a / b;

           ✔ Concept:
             a/b = integer division → 10/3 = 3
             d = 3.0
        */
        {
            int a1 = 10, b1 = 3;
            double d = a1 / b1;
            System.out.println(d); // 3.0
        }

        /* ✅ 2️⃣4️⃣ How to get 3.333... ?
              double d = a / (double) b;

           ✔ Now:
             a / (double)b → 10 / 3.0 → 3.333...
        */
        {
            int a1 = 10, b1 = 3;
            double d2 = a1 / (double) b1;
            System.out.println(d2); // 3.3333333...
        }

        /* ✅ 2️⃣5️⃣ What is the output?
              char c = 'A';
              System.out.println(c + 1);

           ✔ Concept:
             char promoted to int in arithmetic.
             'A' = 65 → 65 + 1 = 66
        */
        {
            char c = 'A';
            System.out.println(c + 1); // 66
        }

        /* ✅ 2️⃣6️⃣ What is the output?
              char c = 'A';
              System.out.println((char)(c + 1));

           ✔ Now we cast back to char:
             65 + 1 = 66 → 'B'
        */
        {
            char c = 'A';
            System.out.println((char) (c + 1)); // B
        }

        /* ✅ 2️⃣7️⃣ What is the output?
              short s = 1;
              s = s + 1;

           ✔ This causes COMPILATION ERROR:
             s+1 → int result, cannot assign to short without cast.
        */
        {
            short s = 1;
            // s = s + 1; // ❌ compilation error
            s = (short) (s + 1); // ✅ with cast
            System.out.println(s); // 2
        }

        /* ✅ 2️⃣8️⃣ Why does this work?
              short s = 1;
              s += 1;

           ✔ Because:
             s += 1; internally does cast back to short automatically.
             Equivalent to: s = (short)(s + 1);
        */
        {
            short s = 1;
            s += 1; // OK
            System.out.println(s); // 2
        }

        /* ✅ 2️⃣9️⃣ What is the output?
              boolean b = true;
              b &= false;

           ✔ Explanation:
             b = b & false → true & false = false
        */
        {
            boolean b = true;
            b &= false;
            System.out.println(b); // false
        }

        /* ✅ 3️⃣0️⃣ What is the output?
              boolean b = false;
              b |= true;

           ✔ Explanation:
             b = b | true → false | true = true
        */
        {
            boolean b = false;
            b |= true;
            System.out.println(b); // true
        }

        System.out.println("\n🎉 _2_Tricky2.java – More operator Q&A completed!");
    }
}
