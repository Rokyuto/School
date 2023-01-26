public class num_symbol_bin_hex_Recurse {
    public static void main(String[] args) {
        for (int number = 32; number < 128; number++) {
            char character = (char)number; // Find Symbol relevant to the current number
            int tempNum = number;
            StringBuilder binResult = new StringBuilder(""); // String Builder to attach values to String
            // Print ASCII table || Integer.toHexString(character) is current Number hex code
            System.out.println(number + " : " + character + " : " + recurse(binResult,tempNum) + " : " + Integer.toHexString(character));
        }
    }
    public static String recurse(StringBuilder binResult,int tempNum) {
        if (tempNum == 0) {
            return String.valueOf(binResult);
        }
        if (tempNum % 2 == 0) {
            binResult.append(0);
            //binResult *= 10; // Write 0 in the binary code
        } else {
            binResult.append(1);
            //binResult = binResult * 10 + '1' - '0'; // Write 1 in the binary code
        }
        return recurse(binResult,tempNum / 2);
    }
}
