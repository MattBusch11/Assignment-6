import java.util.Scanner;
public class Assignment6 {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int count = 0;
		for (int i=0; i<100; i++) {
			if (count==9) {
				System.out.println(getPentagonalNumber(n) + " ");
				count = 0;
			} else {
				System.out.print(getPentagonalNumber(n) + " ");
				count++;
			}
			n++;
		}
	}
	public static int getPentagonalNumber(int n) {
		int number = n*(3*n-1)/2;
		return number;
	}
}
				
