// 📘 DataTypesDemo.java
// A simple demo showing all primitive data types in Java
public class Main {

    public static void main(String[] args) {

        // 🔹 Integer types
        byte b = 10;               // byte → 1 byte (-128 to 127)
        short s = 2000;            // short → 2 bytes (-32,768 to 32,767)
        int i = 50000;             // int → 4 bytes (most used for integers)
        long l = 10000000000L;     // long → 8 bytes (note the 'L' suffix)

        // 🔹 Floating point types
        float f = 12.5f;           // float → 4 bytes (note 'f' suffix)
        double d = 99.99;          // double → 8 bytes (more precise decimals)

        // 🔹 Character & Boolean
        char c = 'A';              // char → 2 bytes, single character
        boolean flag = true;       // boolean → 1 bit, true/false

        // 🔹 Print all with outputs in comments
        System.out.println("byte: " + b);         // Output ➜ byte: 10
        System.out.println("short: " + s);        // Output ➜ short: 2000
        System.out.println("int: " + i);          // Output ➜ int: 50000
        System.out.println("long: " + l);         // Output ➜ long: 10000000000
        System.out.println("float: " + f);        // Output ➜ float: 12.5
        System.out.println("double: " + d);       // Output ➜ double: 99.99
        System.out.println("char: " + c);         // Output ➜ char: A
        System.out.println("boolean: " + flag);   // Output ➜ boolean: true
    }
}

/*
🧠 OUTPUT ON CONSOLE:
--------------------
byte: 10
short: 2000
int: 50000
long: 10000000000
float: 12.5
double: 99.99
char: A
boolean: true
*/

/*
💡 QUICK SUMMARY
================
Primitive Data Types (8 total)
------------------------------
1. byte    → 1 byte  → range: -128 to 127
2. short   → 2 bytes → range: -32,768 to 32,767
3. int     → 4 bytes → most used for integers
4. long    → 8 bytes → add 'L' at end
5. float   → 4 bytes → add 'f' at end
6. double  → 8 bytes → most used for decimals
7. char    → 2 bytes → single character in single quotes
8. boolean → 1 bit   → true or false
*/
