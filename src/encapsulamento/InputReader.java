package encapsulamento;

import java.util.Scanner;

public class InputReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static String lerInput() {
        return scanner.nextLine();
    }
}
