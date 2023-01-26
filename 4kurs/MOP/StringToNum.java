import java.util.Scanner;

public class StringToNum {

	public static void main(String[] args) {
	
		Scanner myScanner = new Scanner(System.in);
		String StringNumber = myScanner.nextLine();
		//int num = Integer.valueOf(StringNumber);
		//System.out.println(num);
		System.out.println(StringToInt(StringNumber));

	}
	public static int StringToInt(String number) {
		int resultNum = 0;
		for (int i = 0; i < number.length(); i++) {
			//System.out.println(resultNum); // DEBUG
			// last written num * 10 + current element in the num string and then remove the 0 from the calculated num
			resultNum = resultNum * 10 + number.charAt(i) - '0'; // Update ResultNum
			//System.out.println(resultNum); // DEBUG
		}
		return resultNum;
	}

}
