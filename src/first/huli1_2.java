package first;

public class huli1_2 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i; j++)
				System.out.print("6");
			for (int k = 0; k < (2 * i + 1); k++)
				System.out.print("*");
			System.out.println();

			/*if (i==9)
				System.out.println("XX");*/

		}

	}
}