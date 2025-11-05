/**
 [1] What is Type Casting?
 ---------------------------------------------------
 Type casting means converting one data type into another.

 There are two kinds:
 1) Implicit (Widening)  -> automatic conversion by Java (safe)
 2) Explicit (Narrowing) -> manual conversion by programmer (possible data loss)

 Example:
 int a = 10;
 double b = a;   // implicit
 double x = 3.14;
 int y = (int) x; // explicit
 */

/**
 [2] Implicit Casting (Widening)
 ---------------------------------------------------
 Happens automatically: small -> large type.
 No data loss, safe conversion.

 Order:
 byte -> short -> int -> long -> float -> double

 Example:
 int a = 5;
 double b = a; // 5.0

 Reason:
 double can store all int values safely.
 */

/**
 [3] Explicit Casting (Narrowing)
 ---------------------------------------------------
 Manual conversion: large -> small type.
 Can cause data loss or overflow.

 Example:
 double pi = 3.14;
 int n = (int) pi; // n = 3

 Overflow example:
 int a = 130;
 byte b = (byte) a; // byte range -128 to 127
 // b = -126 (wrap around)
 */

/**
 [4] Data Loss Example
 ---------------------------------------------------
 float f = 9.99f;
 int i = (int) f;
 System.out.println(i); // 9 (decimal part lost)
 */

/**
 [5] Can boolean be casted?
 ---------------------------------------------------
 No.
 boolean cannot be cast to numeric types or vice versa.

 boolean flag = true;
 // int x = (int) flag; // Compile-time error
 */

/**
 [6] char <-> int casting
 ---------------------------------------------------
 char -> int gives ASCII / Unicode value.

 char ch = 'A';
 int val = ch; // 65
 */

/**
 [7] Object Casting (Upcasting / Downcasting)
 ---------------------------------------------------
 Upcasting (automatic):
 Child -> Parent

 Dog d = new Dog();
 Animal a = d;

 Downcasting (manual):
 Parent -> Child

 Animal a = new Dog();
 Dog d = (Dog) a;

 If incompatible -> ClassCastException
 */

/**
 [8] Trick Question
 ---------------------------------------------------
 int i = 257;
 byte b = (byte) i;
 System.out.println(b);
 // 257 % 256 = 1 -> Output: 1
 */

/**
 [9] float <-> long
 ---------------------------------------------------
 Explicit casting needed (not automatic)

 float f = 10.5f;
 long l = (long) f; // 10
 */

/**
 [10] Real-World Use Cases
 ---------------------------------------------------
 - Data conversion between numeric types (database, files)
 - Polymorphism (upcasting/downcasting)
 - Precision control in calculations
 - Converting API Object types to concrete classes
 */

/**
 [11] Summary Table
 ---------------------------------------------------
 | Casting Type | Direction      | Example       | Performed By | Data Loss | Safe |
 |--------------|----------------|---------------|--------------|-----------|------|
 | Implicit     | Small -> Large | int -> double | JVM          | No        | YES  |
 | Explicit     | Large -> Small | double -> int | Programmer   | Possible  | RISK |
 | Upcasting    | Child -> Parent| Dog -> Animal | JVM          | No        | YES  |
 | Downcasting  | Parent -> Child| Animal -> Dog | Programmer   | Possible  | RISK |
 */

/**
 INTERVIEW SUMMARY
 ---------------------------------------------------
 Q1: What is type casting?
 -> Converting one data type to another.

 Q2: Types of casting?
 -> Implicit (widening) and Explicit (narrowing).

 Q3: Is data loss possible?
 -> Yes, only in explicit/narrowing conversions.

 Q4: boolean to int?
 -> Not allowed.

 Q5: char to int output?
 -> Gives Unicode value (e.g., 'A' -> 65).

 Q6: Overflow example?
 -> int 130 -> byte = -126.

 Q7: Difference between upcasting and downcasting?
 -> Upcasting is safe (automatic), downcasting requires manual conversion.

 Q8: Real-life use?
 -> Object conversions, precision control, DB data parsing.

 Q9: Range of int changes if local/global?
 -> No. Range depends on data type (4 bytes -> -2^31 to 2^31-1).

 Q10: Trick:
 int i = 257; byte b = (byte)i; -> Output: 1
 */

/**
 OUTPUT (from demo code):
 ------------------------
 Original int value: 10
 After widening to double: 10.0
 Original double value: 3.14159
 After narrowing to int: 3
 Original int: 130
 After casting to byte: -126
 */
