// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		// Replace this comment with your code
		int number = Integer.parseInt(args[0]);
		// String mode = args[1];
		// int[] myArry = {};
		int test = number;
		int order = 1;

		for (int i = 1; i < test; i++)
			System.out.print(order + "");
		for (int x = 0; order == 1; x++) {
			if ((order % 2) == 0) {
				order = order / 2;
				System.out.print(order);

			} else {
				order = (order * 3) + 1;
				System.out.print(order);
			}
		}

		// for (int i = 0; i < test; i++) {
		// System.out.println("");
		// System.out.print("");

		// System.out.print(" (" + x + ")");
		// }

		// if (mode == "c") {
		// }
	}
}

/*
 * if (test == 1) {
 * for(int x=0; order >1; x++){
 * if ((order % 2) == 0) {
 * order = order / 2;
 * System.out.print(order);
 * 
 * } else {
 * order = (order * 3) + 1;
 * System.out.print(order);
 * }
 * }
 * 
 * }
 */
