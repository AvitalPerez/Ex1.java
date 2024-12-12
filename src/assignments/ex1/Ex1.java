package assignments.ex1;

import org.junit.platform.engine.support.descriptor.FileSystemSource;

/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {


    // checks if num is in the right ASCII range
    public static boolean checkNum(String num) {
        for (int i = 0; i < num.length(); i++) {
            int c = (int) num.charAt(i);
            if (!(c >= 48 && c <= 57) && !(c >= 65 && c <= 71)) {
                return false;
            }
        }
        return true;
    }

    //Checks if num is converted to a valid base
    public static boolean isValid(String num, String b) {
        int base = (int) b.charAt(0);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) >= base) {
                return false;
            }

        }
        return true;
    }


    /**
     * Convert the given number (num) to a decimal representation (as int).
     * It the given number is not in a valid format returns -1.
     *
     * @param num a String representing a number in basis [2,16]
     * @return
     */

    public static int number2Int(String num) {

        if (!isNumber(num) || num == null || num.isEmpty()) {
            return -1;
        }

        String number = num.substring(0, num.indexOf("b"));
        String base = num.substring(num.indexOf("b") + 1);
        int value = Character.getNumericValue(base.charAt(0));

        return Integer.parseInt(number, value);
    }

    /**
     * This static function checks if the given String (g) is in a valid "number" format.
     *
     * @param a a String representing a number
     * @return true iff the given String is in a number format
     */
    public static boolean isNumber(String a) {
        boolean ans = false;

        if (a == null || a.isEmpty() || a.contains(" ")) {
            return false;
        }

        if (a.contains("b")) {
            int indexOfb = a.indexOf('b');
            // Is be the only one + is it in the right place
            if (indexOfb != a.length() - 1 && indexOfb != 0) {
                // Split num and base to 2 Strings
                String num = a.substring(0, indexOfb);
                String base = a.substring(indexOfb + 1);
                // Are num and base in a valid range?   10b2
                if (checkNum(num)) {
                    if (base.matches("[2-9]") || base.matches("[A-G]")) {
                        if (isValid(num, base)) {
                            return true;
                        }
                        return false;
                    }
                    {
                        return false;
                    }
                }
            }
            // if b is not in the right place
            else {
                return false;
            }
        } // if String doesn't contain b
        else {
            return (a.matches("\\d+"));
        }
        return ans;
    }

    /**
     * Calculate the number representation (in basis base)
     * of the given natural number (represented as an integer).
     * If num<0 or base is not in [2,16] the function should return "" (the empty String).
     *
     * @param num  the natural number (include 0).
     * @param base the basis [2,16]
     * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
     */
    public static String int2Number(int num, int base) {
        String ans = "";

        if (num < 0 || base < 2 || base > 16) {
            return ans;
        }

        ans = Integer.toString(num, base);
        return ans;
    }

    /**
     * Checks if the two numbers have the same value.
     *
     * @param n1 first number
     * @param n2 second number
     * @return true iff the two numbers have the same values.
     */
    public static boolean equals(String n1, String n2) {

        if (!isNumber(n1) || !isNumber(n2)) {
            return false;
        }

            int num1 = number2Int(n1);
            int num2 = number2Int(n2);

            if (num1 == num2) {
                return true;
            }
            return false;
        }





        /**
         * This static function search for the array index with the largest number (in value).
         * In case there are more than one maximum - returns the first index.
         * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
         * @param arr an array of numbers
         * @return the index in the array in with the largest number (in value).
         *
         */
        public static int maxIndex(String[] arr) {
            int max = 0;
            int i = 0;
            String index = arr[i];

            for ( i = 0; i < arr.length ; i++ ) {
                if ( index != null && index != "-1" ) {
                    int ConvertedIndex = number2Int(index);
                    if (ConvertedIndex > max) {
                        max = ConvertedIndex;
                    }
                }
            }
            return max;
        }
}