// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		// Replace this comment with your code
		int number = Integer.parseInt(args[0]);
		String mode = args[1].toUpperCase();
		int numberFinal = number;
		int counter = 1;
		int tempOne;
		if (mode.equals("V")) {
			// loop for the number of the line
			for (int i = 1; i <= number; i++) {
				System.out.print(i + " ");
				// lop for dealing with one
				if (i == 1) {
					tempOne = (i * 3) + 1;
					System.out.print(tempOne + " ");
					number = tempOne;
					counter = counter + 1;

				} else {
					number = i;
				}
				// lop that stop when I'm in num one
				while (number != 1) {
					if ((number % 2) == 0) {
						number = number / 2;
						System.out.print(number + " ");
					} else {
						number = ((number * 3) + 1);
						System.out.print(number + " ");
					}
					counter = counter + 1;

				}
				System.out.println(" (" + (counter) + ")");
				System.out.println("");

				// bring the counter and the number for the start
				number = Integer.parseInt(args[0]);
				counter = 1;
			}

			System.out.println("Every one of the first " + numberFinal + " hailstone sequences reached 1.");
		} else {

			System.out.println("Every one of the first " + numberFinal + " hailstone sequences reached 1.");
		}

	}
}
