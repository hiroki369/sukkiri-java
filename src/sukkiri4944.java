
public class sukkiri4944 {
	public static void main(String [] args ) {
		int [] numbers = {3,4,9};
		System.out.println("画面に一桁の数字を入力して下さい");
		int input  = new java.util.Scanner(System.in).nextInt();
		for (int value : numbers) {
			if (value == input) {
				System.out.println("アタリ");
			}
		}
	}
}
