// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                // Replace this comment with your code
                char[] arrChar = { 'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X' };
                String name = args[0];
                int wow = Integer.parseInt(args[1]);
                // lop for the str
                for (int i = 0; i < name.length(); i++) {
                        boolean printTest = true;
                        for (int X = 0; X < arrChar.length; X++) {

                                if (name.indexOf(arrChar[X], i) == i) {
                                        System.out.println("Give me an" + name.charAt(0 + i) + "!");
                                        printTest = false;
                                }
                        }
                        if (printTest == true) {
                                System.out.println("Give me a " + name.charAt(0 + i) + "!");
                        }
                }
                System.out.println("What does that spell?");
                for (int b = 0; b < wow; b++) {
                        System.out.println(name + "!!!");
                }
        }
}