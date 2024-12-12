# Ex1 - Number Formatting Converter and Calculator
# Student's ID - 328728068

## Java Functions Used in This Code

1. **`String.substring(int startIndex, int endIndex)`** - Extracts a substring from a string between the specified start and end indices.
2. **`String.indexOf(char ch)`** - Returns the index of the first occurrence of the specified character in the string.
3. **`String.charAt(int index)`** - Returns the character at the specified index in a string.
4. **`Character.getNumericValue(char ch)`** - Converts a character to its corresponding numeric value.
5. **`Integer.parseInt(String s, int radix)`** - Converts a string into an integer based on the specified base (radix).
6. **`String.matches(String regex)`** - Checks if a string matches a given regular expression.
7. **`Integer.toString(int num, int base)`** - Converts an integer to a string in the specified base.

## Project Description
This project represents a solution for an assignment (Ex1) involving the design of a number formatting converter and calculator.
The assignment requires working with numbers as Strings and converting them between various bases (2 to 16), including binary, hexadecimal, and other bases in between.


## Functionality
The following static functions are implemented in the `Ex1` class:

1. **`checkNum(String num)`**: Validates if a given number is in the valid ASCII range for digits (0-9) and letters (A-G).
2. **`isValid(String num, String b)`**: Checks if the number is valid in the given base.
3. **`number2Int(String num)`**: Converts a number in String format from any base (2 to 16) to a decimal (base 10) (Return -1 if invalid)
4. **`isNumber(String a)`**: Checks if the given String is in a valid number format 
5. **`int2Number(int num, int base)`**: Converts an integer to a number in a given base (from 2 to 16).
6. **`equals(String n1, String n2)`**: Checks if two numbers (in String format) are equal.
7. **`maxIndex(String[] arr)`**: Finds the index of the largest number in an array of number Strings.


