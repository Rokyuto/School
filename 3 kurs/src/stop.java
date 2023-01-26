import java.util.Scanner;

public class stop {
    public static void FirstLine(int n) {
        int i = 0;
        int dots = n + 1;
        int underLine = n * 2;

        while (i < dots) {
            System.out.print(".");
            i++;
        }

        i = 0;
        while (i <= underLine) {
            System.out.print("_");
            i++;
        }

        i = 0;
        while (i < dots) {
            System.out.print(".");
            i++;
        }
        System.out.println();
    }

    public static void Top(int n) {
        int i = 0;
        int dots = n;
        int rows = 0;
        int underLine = 2 * n - 1;

        while (rows < n) {
            while (i < dots) {
                System.out.print(".");
                i++;
            }
            System.out.print("//");
            i = 0;
            while (i < underLine) {
                System.out.print("_");
                i++;
            }
            System.out.print("\\\\");
            i = 0;
            while (i < dots) {
                System.out.print(".");
                i++;
            }
            System.out.println();
            rows++;
            i = 0;
            dots--;
            underLine += 2;
        }
    }

    public static void Mid(int n) {
        int i = 0;
        int rows = 0;
        int underLine = 2 * n - 1;

        while (rows < n) {
            while (i < underLine) {
                i++;
            }
            i = 0;
            rows++;
            underLine += 2;
        }
        i = 0;
        System.out.print("//");
        while (i < (underLine - 5) / 2) {
            System.out.print("_");
            i++;
        }
        System.out.print("STOP!");
        i = 0;
        while (i < (underLine - 5) / 2) {
            System.out.print("_");
            i++;
        }
        System.out.println("\\\\");
    }
    public static void Bot(int n) {
        int i = 0;
        int dots = 0;
        int rows = 0;
        int underLine = 2 * n - 1;

        while (rows < n) {
            while (i < underLine) {
                i++;
            }
            i = 0;
            rows++;
            underLine += 2;
        }
        i = 0;
        rows = 0;
        while (rows < n) {
            while (i < dots) {
                System.out.print(".");
                i++;
            }
            System.out.println();
            rows++;
            i = 0;
            dots++;
            underLine -=2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        FirstLine(n);
        Top(n);
        Mid(n);
        Bot(n);
    }
}
