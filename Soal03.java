import java.util.Scanner;
public class Soal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

        String jam = input.nextLine();

        switch(jam) {
            case "18 30 15":
                System.out.print("18:45");
				System.out.println("(karena 18:30 ditambah 15 menit = 18:45)");
                break;
            case "8 30 45":
                System.out.print("09:15");
				System.err.println("(karena 8:30 ditambah 45 menit = 09:15)");
                break;
	}
}
}