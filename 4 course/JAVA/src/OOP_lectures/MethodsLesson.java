package OOP_lectures.src;

public class MethodsLesson {
    public static void main(String[] args) {
        printRes(sumNums(5, 6));
    }

    static boolean sumNums(int x, int y) {
        if (x > y) {
            return true;
        }
        return false;
    }

    public static void printRes(boolean result) {
        System.out.println(result);
    }
}
