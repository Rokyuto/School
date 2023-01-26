import java.util.Stack;

public class OperatorsExample {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 27;
        System.out.println("num1' BIN code:");
        DecToBin(num1);
        System.out.println("num2' BIN code:");
        DecToBin(num2);

        int and = num1 & num2; // при нула в bin кода на някое от числата, в резултатният bin код се записва 0 на съответната позиция
        int or = num1 | num2; // при 1 в bin кода на някое от числата, в резултатният bin код се записва 1 на съответната позиция
        int xor = num1 ^ num2; // при повтаряща се 1ца или 0 и в двата bin кода на числата, в резултатният bin код се записва 0 на съответната позиция, ако не се повтаря => 0
        int notNum1 =  ~num1; // резулатният bin код е с разменени 1ци и 0 (на мястото на 1 се слага 0, на 0 -> 1)
        int notNum2 = ~num2; // резулатният bin код е с разменени 1ци и 0 (на мястото на 1 се слага 0, на 0 -> 1)
        int leftShiftNum1 = num1 << 1; // добавят се X брой 0 пред bin кода, местейки го наляво
        int leftShiftNum2 = num2 << 3;// добавят се X брой 0 пред bin кода, местейки го наляво
        int rightShiftNum1 = num1 >> 1; // вмъкват се X брой 0 пред bin кода, местейки го надясно
        int rightShiftNum2 = num2 >> 3; // вмъкват се X брой 0 пред bin кода, местейки го надясно

        System.out.println("AND operator result BIN code:");
        DecToBin(and);

        System.out.println("OR operator result BIN code:");
        DecToBin(or);

        System.out.println("XOR operator result BIN code:");
        DecToBin(xor);

        System.out.println("NOT operator result BIN code for num1:");
        DecToBin(notNum1);

        System.out.println("NOT operator result BIN code for num2:");
        DecToBin(notNum2);

        System.out.println("Left Shift operator result BIN code for num1:");
        DecToBin(leftShiftNum1);

        System.out.println("Left Shift operator result BIN code for num2:");
        DecToBin(leftShiftNum2);

        System.out.println("Right Shift operator result BIN code for num1:");
        DecToBin(rightShiftNum1);

        System.out.println("Right Shift operator result BIN code for num2:");
        DecToBin(rightShiftNum2);

    }

    public static void DecToBin(int result){
        Stack<Integer> binaryStack = new Stack<>();
        while(result !=0){
            binaryStack.push(Math.abs(result % 2));
            result /= 2;
        }
        while(binaryStack.size() != 0){
            System.out.print(binaryStack.pop());
        }
        System.out.println();
    }

}
