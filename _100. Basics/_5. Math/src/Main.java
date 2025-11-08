// File: _9_MathFunctions.java
// Topic: Java Math Class — Detailed Explanation of All Common Methods
// 🧠 Math = final class in java.lang containing static methods for
//     mathematical calculations (no object creation needed).
// 💡 Syntax → Math.methodName(arguments)
// 💡 Return Types → depend on the method (int, long, float, double)

public class Main {
    public static void main(String[] args) {

        // =====================================================
        // 🧩 1️⃣ Arithmetic Operations (int / long)
        // =====================================================
        int a = 15, b = 4;

        System.out.println("addExact(15,4): " + Math.addExact(a, b));           // 19
        System.out.println("subtractExact(15,4): " + Math.subtractExact(b, a)); // -11
        System.out.println("multiplyExact(15,4): " + Math.multiplyExact(a, b)); // 60
        System.out.println("floorDiv(15,4): " + Math.floorDiv(a, b));           // 3
        System.out.println("floorMod(15,4): " + Math.floorMod(a, b));           // 3

        /*
           🎯 Explanation:
           • addExact(), subtractExact(), multiplyExact() → return int/long
             same as +, -, * but throw ArithmeticException if overflow occurs.
           • floorDiv(a,b) → integer division that rounds down (returns int/long)
             ex: Math.floorDiv(-7,3) → -3  (normal / gives -2)
           • floorMod(a,b) → remainder matching floorDiv rule
             ensures: a = b*floorDiv(a,b) + floorMod(a,b)
           💡 Safer for signed arithmetic (especially negative numbers).
        */

        // =====================================================
        // 🧩 2️⃣ Rounding Methods (double → int/long)
        // =====================================================
        double x = 12.56;

        System.out.println("round(12.56): " + Math.round(x));  // 13  → long
        System.out.println("floor(12.56): " + Math.floor(x));  // 12.0 → double
        System.out.println("ceil(12.56): " + Math.ceil(x));    // 13.0 → double
        System.out.println("rint(12.5): " + Math.rint(12.5));  // 12.0 → double

        /*
           🎯 Explanation:
           • round(x) → returns nearest integer (long or int)
             → ex: Math.round(12.4) = 12, Math.round(12.6) = 13
           • floor(x) → returns largest integer ≤ x (double)
             → ex: floor(12.9) = 12.0
           • ceil(x) → returns smallest integer ≥ x (double)
             → ex: ceil(12.1) = 13.0
           • rint(x) → rounds to nearest even integer (banker’s rounding, returns double)
             → ex: rint(12.5) = 12.0, rint(13.5) = 14.0
        */

        // =====================================================
        // 🧩 3️⃣ Power and Root (double input/output)
        // =====================================================
        System.out.println("pow(2,3): " + Math.pow(2, 3));     // 8.0
        System.out.println("sqrt(25): " + Math.sqrt(25));       // 5.0
        System.out.println("cbrt(27): " + Math.cbrt(27));       // 3.0
        System.out.println("hypot(3,4): " + Math.hypot(3, 4)); // 5.0

        /*
           🎯 Explanation:
           • pow(a,b) → returns a^b as double
           • sqrt(x)  → square root (double)
           • cbrt(x)  → cube root (double)
           • hypot(a,b) → √(a² + b²) (double)
           💡 hypot() avoids overflow/underflow (better than manual sqrt(a*a + b*b)).
        */

        // =====================================================
        // 🧩 4️⃣ Absolute and Sign
        // =====================================================
        System.out.println("abs(-7): " + Math.abs(-7));              // 7
        System.out.println("signum(-10.5): " + Math.signum(-10.5));  // -1.0
        System.out.println("signum(0.0): " + Math.signum(0.0));      // 0.0
        System.out.println("signum(5.3): " + Math.signum(5.3));      // 1.0

        /*
           🎯 Explanation:
           • abs(x) → returns absolute (positive) value (same type as input)
             int→int, double→double
           • signum(x) → returns -1.0, 0.0, or 1.0 (double)
             tells whether number is negative, zero, or positive
        */

        // =====================================================
        // 🧩 5️⃣ Min, Max, Clamp (same type returned)
        // =====================================================
        System.out.println("min(8,3): " + Math.min(8, 3));     // 3
        System.out.println("max(8,3): " + Math.max(8, 3));     // 8
        System.out.println("clamp(15,1,10): " + Math.clamp(15, 1, 10)); // 10

        /*
           🎯 Explanation:
           • min(a,b), max(a,b) → returns smaller/larger of same type
             (int, long, float, or double)
           • clamp(x, min, max) → keeps value within a range
             returns:
               → min if x < min
               → max if x > max
               → x otherwise
           💡 Example: clamp(15,1,10) → 10; clamp(5,1,10) → 5
        */

        // =====================================================
        // 🧩 6️⃣ Trigonometric Methods (radians → double)
        // =====================================================
        double deg = 30;
        double rad = Math.toRadians(deg); // convert degrees → radians

        System.out.println("sin(30°): " + Math.sin(rad));   // 0.5
        System.out.println("cos(30°): " + Math.cos(rad));   // 0.866
        System.out.println("tan(30°): " + Math.tan(rad));   // 0.577
        System.out.println("asin(0.5): " + Math.toDegrees(Math.asin(0.5)));  // 30.0
        System.out.println("acos(0.866): " + Math.toDegrees(Math.acos(0.866))); // ~30.0
        System.out.println("atan(1): " + Math.toDegrees(Math.atan(1)));      // 45.0

        /*
           🎯 Explanation:
           • All trig functions take/return double.
           • sin(x), cos(x), tan(x): input in radians → output double.
           • asin(x), acos(x), atan(x): return angle (radians) → convert to degrees using toDegrees().
           • toRadians(x): degrees → radians
           • toDegrees(x): radians → degrees
           💡 sin(π/6)=0.5 → same as sin(30°)
        */

        // =====================================================
        // 🧩 7️⃣ Exponential and Logarithmic (double)
        // =====================================================
        System.out.println("exp(1): " + Math.exp(1));        // 2.7182818
        System.out.println("log(10): " + Math.log(10));      // 2.302585 (natural log)
        System.out.println("log10(100): " + Math.log10(100));// 2.0
        System.out.println("expm1(1): " + Math.expm1(1));    // e^1 - 1 = 1.718
        System.out.println("log1p(0.5): " + Math.log1p(0.5));// ln(1.5)=0.405

        /*
           🎯 Explanation:
           • exp(x) → returns e^x  (double)
           • log(x) → natural log base e
           • log10(x) → base 10 logarithm
           • expm1(x) → e^x - 1, better precision for small x
           • log1p(x) → ln(1 + x), better precision for small x
           💡 Useful in finance, statistics, and scientific calculations.
        */

        // =====================================================
        // 🧩 8️⃣ Random Number Generator
        // =====================================================
        double r = Math.random();               // 0.0 ≤ r < 1.0
        int random1to10 = (int)(Math.random() * 10) + 1; // 1–10

        System.out.println("Random (0–1): " + r);
        System.out.println("Random (1–10): " + random1to10);

        /*
           🎯 Explanation:
           • Math.random() → returns double in [0.0, 1.0)
           • To generate in range [min, max]:
               (int)(Math.random() * (max - min + 1)) + min
           💡 Example: random(1–6) for dice = (int)(Math.random() * 6) + 1
        */

        // =====================================================
        // 🧩 9️⃣ Floating-Point Helpers (double)
        // =====================================================
        System.out.println("nextAfter(1.0, 2.0): " + Math.nextAfter(1.0, 2.0)); // next double
        System.out.println("ulp(1.0): " + Math.ulp(1.0)); // distance to next double
        System.out.println("copySign(5.5, -2.0): " + Math.copySign(5.5, -2.0)); // -5.5

        /*
           🎯 Explanation:
           • nextAfter(a,b): returns next representable floating-point after a toward b.
           • ulp(x): returns smallest difference between x and next representable value.
             (Unit in Last Place)
           • copySign(magnitude, signSource): returns |magnitude| with sign of signSource.
             → copySign(5.5, -2.0) = -5.5
        */

        // =====================================================
        // 🧠 FINAL SUMMARY (Interview Notes)
        // =====================================================
        /*
           ✅ Category  |  Methods & Return Type  |  Example
           --------------------------------------------------------
           Arithmetic   | addExact(int,int):int           | safer addition
                        | floorDiv(int,int):int           | division (toward -∞)
                        | floorMod(int,int):int           | remainder
           --------------------------------------------------------
           Rounding     | round(double):long               | 12.6→13
                        | floor(double):double             | 12.9→12.0
                        | ceil(double):double              | 12.1→13.0
                        | rint(double):double              | ties-to-even
           --------------------------------------------------------
           Power/Roots  | pow(a,b):double, sqrt(x):double  | 2^3=8, √25=5
           --------------------------------------------------------
           Trigonometry | sin(), cos(), tan() : double     | radian input
                        | toRadians(deg):double            | deg→rad
                        | toDegrees(rad):double            | rad→deg
           --------------------------------------------------------
           Log/Exp      | exp(), log(), log10() : double   | exponential & logarithm
                        | expm1(), log1p() : double        | high precision
           --------------------------------------------------------
           Random       | random():double (0–1)            | pseudo random number
           --------------------------------------------------------
           Helpers      | abs(), signum(), copySign()      | magnitude & sign tools
                        | nextAfter(), ulp()               | floating precision control
                        | min(), max(), clamp()            | bounds handling
           --------------------------------------------------------
           💡 No object creation → just call Math.method()
        */
    }
}
