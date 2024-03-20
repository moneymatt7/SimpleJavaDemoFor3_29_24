
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // prompt the user to enter their first name
        System.out.println("Please enter your first name:");
        String input = sc.nextLine().toUpperCase();

        System.out.print("Welcome, \n" + toAscii(input) + "\nThis is a small " +
                "demo application brought to you by the \n" +
                toAscii("FSCJ STARS!"));

    }

    public static StringBuilder toAscii(String input) {
        // row height of each letter
        final int LETTER_HEIGHT = 5;

        StringBuilder line = new StringBuilder();

        // iterate over each row
        for (int row = 0; row < LETTER_HEIGHT; row++) {

            for (char c : input.toCharArray()) {
                // get ASCII art for current char
                String[] asciiLetter = Letters.ASCII_CHAR_MAP.get(c);

                // check map for character, append it to the line
                if (asciiLetter != null && row < asciiLetter.length) {
                    line.append(asciiLetter[row]);
                    line.append(" ");
                }else{
                    // if letter not in map append space
                    line.append("       ");
                }
            }
            line.append("\n");
        }

        return line;
    }
}

