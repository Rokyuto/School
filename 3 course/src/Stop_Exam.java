import java.util.Scanner;

public class Stop_Exam {

    public static void FirstLine(int n) {
        int i;
        int dots = n + 1;
        int underline = n*2 ;

        for (i = 0; i < dots; i++){
            System.out.print(".");
        }
        for (i = 0; i < underline; i++){
            System.out.print("_");
        }
        for (i = 0; i < dots; i++){
            System.out.print(".");
        }
        System.out.println();
    }
    public static void Top(int n) {
        int i;
        int dots = n;
        int rows;
        int underline = 2*n - 1;

        for (rows = 0; rows < n;rows++){
            for (i = 0; i< dots; i++){
                System.out.print(".");
            }
            System.out.print("//");

            for (i = 0; i < underline; i++){
                System.out.print("_");
            }
            System.out.print("\\\\");

            for(i = 0; i < dots; i++){
                System.out.print(".");
            }
            System.out.println();
            dots--;
            underline += 2;
        }
    }
    public static void Mid(int n) {
        int i;
        int rows;
        int underline = 2*n - 1;

        for (rows = 0; rows < n; i++){
            for (i = 0; i < underline; i++){
            }
            i = 0;
            rows++;
            underline += 2;
        }
        System.out.print("//");
        for(i = 0; i < (underline - 5)/2; i++){
            System.out.print("_");
        }
        System.out.print("STOP!");
        for(i = 0; i < (underline - 5)/2; i++){
            System.out.print("_");
        }
        System.out.println("\\\\");
    }
    public static void Bot(int n) {
        int i;
        int dots = 0;
        int rows;
        int underline = 2*n - 1;

        for (rows = 0; rows < n; rows++){
            for(i = 0; i < underline; i++){
            }
            underline += 2;
        }
        for(rows = 0; rows < n; rows++){
            for (i = 0; i < dots; i++){
                System.out.print(".");
            }
            System.out.print("\\\\");
            for(i = 0; i < underline; i++){
                System.out.print("_");
            }
            System.out.print("//");
            for (i = 0; i < dots; i++){
                System.out.print(".");
            }
            System.out.println();
            dots++;
            underline -=2;
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