package spil;

import java.util.Scanner;

/**
 * <p>
 * The View-class is an important part of the MVC-architecture.
 * It allows the programmer to change the user interface at any time with no need to change any other classes.
 * </p>
 */
public class View {

    /**
     * Prints a message to the user.
     *
     * @param message Description The string to be printed to the user.
     */
    public static void print(String message) {
        System.out.println(message);
    }

    /**
     * @return Description Returns integer from console.
     */
    public static int readInt() {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        return input;

    }

    /**
     * @return Description Returns string from console.
     */
    public static String readString() {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        return input;
    }

}
