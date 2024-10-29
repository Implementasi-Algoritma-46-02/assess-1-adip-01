import java.util.Scanner;
public class Soal01  {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner walae = new Scanner(System.in);
		int a1;
		int a2;
		int a3;
		double ni =  a1 + a2 + a3;
		System.out.println(ni);
		if (a1 <= a2 && a2 <= a3 ) {
			System.out.println("valid");
		} else if (a1 >= a2 && a2 >= a3 && a3 % 2 == 0 ) {
			System.out.println("tidak valid");
	}
}
}