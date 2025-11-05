public class _1a_IntegerVsFloatingDivision
{

    public static void main(String[] args) {

        // 🔹 Case 1: Both operands are integers
        float f1 = 3 / 2;   // integer division happens first → 3 / 2 = 1
        System.out.println("Case 1 (int / int): " + f1);
        // Output → 1.0

        // 🔹 Case 2: One operand is float
        float f2 = 3f / 2;  // floating division → 1.5
        System.out.println("Case 2 (float / int): " + f2);
        // Output → 1.5

        // 🔹 Case 3: One operand is double
        double f3 = 3 / 2.0;  // floating division → 1.5
        System.out.println("Case 3 (int / double): " + f3);
        // Output → 1.5

        // 🔹 Case 4: Integer division assigned to int
        int result = 3 / 2;  // integer division → 1
        System.out.println("Case 4 (int result): " + result);
        // Output → 1
    }
}

/**
 [21] Integer vs Floating Division in Java
 ---------------------------------------------------
 🧩 Concept:
 When dividing numbers, the type of operands determines
 whether the division is integer-based or floating-point-based.

 ---------------------------------------------------
 🔹 RULES:
 ---------------------------------------------------
 1️⃣ If both operands are integers → integer division.
 - The fractional part is truncated (not rounded).
 - Example: 3 / 2 = 1

 2️⃣ If any operand is float or double → floating-point division.
 - Fractional part is preserved.
 - Example: 3f / 2 = 1.5

 ---------------------------------------------------
 🔹 Example Breakdown
 ---------------------------------------------------
 float f1 = 3 / 2;      // int / int → 1 → then assigned as 1.0
 float f2 = 3f / 2;     // float / int → 1.5
 double f3 = 3 / 2.0;   // int / double → 1.5
 int result = 3 / 2;    // integer division → 1

 ---------------------------------------------------
 🔹 Output
 ---------------------------------------------------
 Case 1 (int / int): 1.0
 Case 2 (float / int): 1.5
 Case 3 (int / double): 1.5
 Case 4 (int result): 1

 ---------------------------------------------------
 💬 INTERVIEW EXPLANATION
 ---------------------------------------------------
 ➤ Java decides the type of division based on operand types, not target variable.
 ➤ When both operands are integers, the fractional part is lost before assignment.
 ➤ Even if the result is stored in a float or double, truncation already happened.
 ➤ To get decimal result, make at least one operand float/double (3f / 2 or 3 / 2.0).

 ---------------------------------------------------
 🧠 SHORT ANSWER (for interviewer):
 ---------------------------------------------------
 “3 / 2 performs integer division because both operands are ints,
 so the result is 1 (fraction lost). After assignment to float,
 it becomes 1.0. To get 1.5, one operand must be float or double.”
 */
