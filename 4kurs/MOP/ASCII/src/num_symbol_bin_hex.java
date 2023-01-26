import static java.lang.Integer.parseInt;

public class num_symbol_bin_hex {
    public static void main(String[] args) {

        for (int number = 32; number < 128; number++) {
            char character = (char)number; // Find Symbol relevant to the current number
            int tempNum = number;
            String binResult;
            StringBuilder tempString = new StringBuilder(""); // String Builder to attach values to String
            while (tempNum != 0){
                if (tempNum % 2 == 0){
                    tempString.append(0); // Attach 0 to String Builder
                    //binResult *= 10; // Write 0 in the binary code
                }
                else{
                    tempString.append(1); // Attach 1 to String Builder
                    //binResult = binResult * 10 + '1' - '0'; // Write 1 in the binary code
                }
                tempNum /= 2;
            }
            binResult = String.valueOf(tempString); // Write StringBuilder value as String
            // Print ASCII table || Integer.toHexString(character) is current Number hex code
            System.out.println(number + " : " + character + " : " + binResult + " : " + Integer.toHexString(character));
        }
    }
}
